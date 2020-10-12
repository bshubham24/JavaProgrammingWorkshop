package com.workshop;

import java.util.Scanner;

public class TicTacToe {
	char board[] = new char[10];
	char user, computer;

	public char[] CreateBoard() {

		for (int i = 1; i < board.length; i++) {
			board[i] = ' ';
		}
		return board;
	}

	public char TakeInput() {
		Scanner sc = new Scanner(System.in);
		boolean check = false;
		char input = ' ';
		while (!check) {
			System.out.println("Choose X or O");
			input = Character.toUpperCase(sc.next().charAt(0));

			if (input == 'X' || input == 'O') {
				check = true;
			}

			else {
				System.out.println("Enter either X or O only");
			}
		}

		return input;
	}

	public int ChoosePosition(char[] board) {
		Scanner sc = new Scanner(System.in);
		int position = 1;
		boolean check = false;
		while (!check) {
			System.out.println("Choose the position on board from 1-9");
			position = Integer.parseInt(sc.nextLine());
			if (position >= 1 && position <= 9) {
				if (board[position] == ' ') {
					return position;
				} else {
					System.out.println("This positon is filled, Please Try again");
					position = 0;
				}
			} else {
				System.out.println("Enter valid positon, Please Try again");
			}
		}
		return position;
	}

	public char Toss() {
		int result = (int) Math.floor(Math.random() * 10) % 2;
		char toss;
		result++;
		if (result == 1) {
			toss = 'H';
		} else {
			toss = 'T';
		}
		return toss;
	}

	public boolean CheckForWin(char w) {
		if ((board[1] == w && board[2] == w && board[3] == w) || (board[1] == w && board[4] == w && board[7] == w)
				|| (board[1] == w && board[5] == w && board[9] == w)
				|| (board[3] == w && board[5] == w && board[7] == w)
				|| (board[2] == w && board[5] == w && board[8] == w)
				|| (board[4] == w && board[5] == w && board[6] == w)
				|| (board[7] == w && board[8] == w && board[9] == w)
				|| (board[3] == w && board[6] == w && board[9] == w)) {
			return true;
		} else
			return false;

	}

	public boolean checkForDraw() {
		for (int i = 1; i < 10; i++) {
			if (board[i] == ' ') {
				return false;
			}
		}
		return true;
	}

	public int chanceOfWin(char computer) {
		if (board[1] == ' ' && ((board[2] == computer && board[3] == computer)
				|| (board[4] == computer && board[7] == computer) || (board[5] == computer && board[9] == computer)))
			return 1;

		if (board[2] == ' '
				&& ((board[1] == computer && board[3] == computer) || (board[5] == computer && board[8] == computer)))
			return 2;

		if (board[3] == ' ' && ((board[2] == computer && board[1] == computer)
				|| (board[6] == computer && board[9] == computer) || (board[5] == computer && board[7] == computer)))
			return 3;

		if (board[4] == ' '
				&& ((board[1] == computer && board[7] == computer) || (board[5] == computer && board[6] == computer)))
			return 4;

		if (board[5] == ' ' && ((board[1] == computer && board[9] == computer)
				|| (board[3] == computer && board[7] == computer) || (board[2] == computer && board[8] == computer)
				|| (board[4] == computer && board[6] == computer)))
			return 5;

		if (board[6] == ' '
				&& ((board[3] == computer && board[9] == computer) || (board[5] == computer && board[4] == computer)))
			return 6;

		if (board[7] == ' ' && ((board[1] == computer && board[4] == computer)
				|| (board[9] == computer && board[8] == computer) || (board[5] == computer && board[3] == computer)))
			return 7;

		if (board[8] == ' '
				&& ((board[2] == computer && board[5] == computer) || (board[7] == computer && board[9] == computer)))
			return 8;

		if (board[9] == ' ' && ((board[7] == computer && board[8] == computer)
				|| (board[3] == computer && board[6] == computer) || (board[5] == computer && board[1] == computer)))
			return 9;

		return 0;

	}

	public int computerChoice(char computer) {
		int position = chanceOfWin(computer);
		if (position != 0) {
			return position;
		}

		else {
			position = blockMove(user);
		}
		return position;
	}

	public int blockMove(char user) {
		int position = chanceOfWin(user);
		if (position == 0) {
			position = checkCorner();
		}
		return position;
	}

	public int checkCorner() {
		if (board[1] == ' ')
			return 1;
		else if (board[3] == ' ')
			return 3;
		else if (board[7] == ' ')
			return 7;
		else if (board[9] == ' ')
			return 9;
		else {
			int position = 0;
			int temp = 0;
			while (temp == 0) {
				position = ((int) Math.floor(Math.random() * 10) % 9) + 1;
				if (board[position] == ' ')
					return position;
			}
			return position;
		}
	}

	public void play(char toss) {

		char currentPlayer = ' ';
		int position;
		int end = 0;
		user = TakeInput();
		if (user == 'X') {
			computer = 'O';
		} else
			computer = 'X';
		System.out.println("User: " + user);
		System.out.println("Computer: " + computer);

		while (end != 1) {
			if (toss == 'H') {
				System.out.println("User won the toss, hence plays first");
				currentPlayer = user;
				toss = 'D';
			}
			if (currentPlayer == user) {
				currentPlayer = computer;
				position = ChoosePosition(board);
				if (position != 0) {
					board[position] = user;
					ShowBoard(board);
					if (CheckForWin(user)) {
						System.out.println("User wins");
						break;
					} else if (checkForDraw()) {
						System.out.println("Match tied!");
						break;
					}
				}

			}

			else if (toss == 'T') {
				System.out.println("Computer won the toss, hence plays first");
				currentPlayer = computer;
				toss = 'D';
			}
			if (currentPlayer == computer) {
				currentPlayer = user;
				position = computerChoice(computer);
				board[position] = computer;
				ShowBoard(board);
				if (CheckForWin(computer)) {
					System.out.println("Computer wins");
					break;
				} else if (checkForDraw()) {
					System.out.println("Match tied!");
					break;
				}

			}
		}
	}

	public void ShowBoard(char board[]) {
		System.out.println("-----------------");
		System.out.println("| " + board[1] + " | " + board[2] + " | " + board[3] + " |");
		System.out.println("-----------------");
		System.out.println("| " + board[4] + " | " + board[5] + " | " + board[6] + " |");
		System.out.println("-----------------");
		System.out.println("| " + board[7] + " | " + board[8] + " | " + board[9] + " |");
		System.out.println("-----------------");
	}

}
