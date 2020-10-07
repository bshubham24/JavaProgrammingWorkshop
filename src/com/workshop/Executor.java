package com.workshop;

public class Executor {
	public static void main(String[] args) {
		System.out.println("Welcome");
		TicTacToe ticTacToe = new TicTacToe();
		int board[] = ticTacToe.CreateBoard();
		ticTacToe.DisplayBoard(board);
	}
}
