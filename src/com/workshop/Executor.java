package com.workshop;

import java.util.Scanner;

public class Executor {
	public static void main(String[] args) {
		char user, computer;
		int position;
		int choice = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome");
		TicTacToe tictactoe = new TicTacToe();
		char board[] = tictactoe.CreateBoard();
		char toss = tictactoe.Toss();
		if (toss == 'H') {
			System.out.println("User won the toss, hence plays first");
			while (choice != 2) {

				user = tictactoe.TakeInput();
				user = Character.toUpperCase(user);
				if (user == 'X') {
					computer = 'O';
				} else
					computer = 'X';
				System.out.println("User: " + user);
				System.out.println("Computer: " + computer);

				System.out.println("Enter 1 for choosing position and enter 2 for exit");
				choice = Integer.parseInt(sc.nextLine());
				if (choice == 1) {
					position = tictactoe.ChoosePosition(board);
					if (position != 0) {
						board[position] = user;
					}
					tictactoe.ShowBoard(board);

					if ((board[1] == 'X' && board[2] == 'X' && board[3] == 'X')
							|| (board[1] == 'O' && board[2] == 'O' && board[3] == 'O')) {
						System.out.println("user wins!");
						break;
					}
					if ((board[1] == 'X' && board[4] == 'X' && board[7] == 'X')
							|| (board[1] == 'O' && board[4] == 'O' && board[7] == 'O')) {
						System.out.println("user wins!");
						break;
					}
					if ((board[1] == 'X' && board[5] == 'X' && board[9] == 'X')
							|| (board[1] == 'O' && board[5] == 'O' && board[9] == 'O')) {
						System.out.println("user wins!");
						break;
					}
					if ((board[3] == 'X' && board[5] == 'X' && board[7] == 'X')
							|| (board[3] == 'O' && board[5] == 'O' && board[7] == 'O')) {
						System.out.println("user wins!");
						break;
					}
					if ((board[2] == 'X' && board[5] == 'X' && board[8] == 'X')
							|| (board[2] == 'O' && board[5] == 'O' && board[8] == 'O')) {
						System.out.println("user wins!");
						break;
					}
					if ((board[3] == 'X' && board[6] == 'X' && board[9] == 'X')
							|| (board[3] == 'O' && board[6] == 'O' && board[9] == 'O')) {
						System.out.println("user wins!");
						break;
					}
					if ((board[4] == 'X' && board[5] == 'X' && board[6] == 'X')
							|| (board[4] == 'O' && board[5] == 'O' && board[6] == 'O')) {
						System.out.println("user wins!");
						break;
					}
					if ((board[7] == 'X' && board[8] == 'X' && board[9] == 'X')
							|| (board[7] == 'O' && board[8] == 'O' && board[9] == 'O')) {
						System.out.println("user wins!");
						break;
					}

				} else if (choice == 2) {
					break;
				} else
					System.out.println("Enter the correct choice");

			}
		} else if (toss == 'T')
			System.out.println("Computer won the toss, hence plays first");

	}
}
