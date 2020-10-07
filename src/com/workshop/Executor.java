package com.workshop;

import java.util.Scanner;

public class Executor {
	public static void main(String[] args) {
		char User, Computer;
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome");
		TicTacToe tictactoe = new TicTacToe();
		char board[] = tictactoe.CreateBoard();
		tictactoe.TakeInput();
		tictactoe.DisplayBoard(board);
	}
}
