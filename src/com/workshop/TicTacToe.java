package com.workshop;

import java.util.Scanner;

public class TicTacToe {
	public char[] CreateBoard() {
		char board[] = new char[10];
		for (int i = 1; i < board.length; i++) {
			board[i] = 'z';
		}
		return board;
	}

	public char TakeInput() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Choose X or O");
		char input = sc.next().charAt(0);
		return input;
	}

	public void DisplayBoard(char board[]) {
		for (int i = 1; i < board.length; i++) {
			System.out.println(board[i]);
		}
	}

}
