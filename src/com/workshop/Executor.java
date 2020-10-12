package com.workshop;

public class Executor {
	public static void main(String[] args) {
		System.out.println("Welcome");

		TicTacToe tictactoe = new TicTacToe();

		tictactoe.CreateBoard();
		char toss = tictactoe.Toss();
		tictactoe.play(toss);
	}
}
