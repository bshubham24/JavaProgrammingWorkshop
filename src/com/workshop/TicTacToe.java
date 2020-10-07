package com.workshop;

import java.util.Scanner;

public class TicTacToe {
	public char[] CreateBoard() {
		char board[] = new char[10];
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
			input = sc.next().charAt(0);
			if (input == 'x' || input == 'o') {
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
				check = true;
				break;
			} else {
				System.out.println("Enter valid positon, Try again");
			}
		}
		if (board[position] == ' ') {
			return position;
		} else {
			System.out.println("This positon is filled, Try again");
			position = 0;
			return position;
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
