package com.workshop;

import java.util.Scanner;

public class TicTacToe {
	public char[] CreateBoard() {
		char board[] = new char[10];
		for (int i = 1; i < board.length; i++) {
			board[i] = 'e';
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

	public void ShowBoard(char board[]) {
		System.out.println("-----------------");
		System.out.println("| " + board[1] + " | " + board[1] + " | " + board[2] + " |");
		System.out.println("-----------------");
		System.out.println("| " + board[3] + " | " + board[4] + " | " + board[5] + " |");
		System.out.println("-----------------");
		System.out.println("| " + board[6] + " | " + board[7] + " | " + board[9] + " |");
		System.out.println("-----------------");
	}

}
