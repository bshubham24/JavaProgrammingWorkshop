package com.workshop;

import java.util.Scanner;

public class Executor {
	public static void main(String[] args) {
		char user, computer;
		int position;
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome");
		TicTacToe tictactoe = new TicTacToe();
		char board[] = tictactoe.CreateBoard();
		user = tictactoe.TakeInput();
		user = Character.toUpperCase(user);
		if (user == 'X') {
			computer = 'O';
		} else
			computer = 'X';
		System.out.println("User: " + user);
		System.out.println("Computer: " + computer);
		position = tictactoe.ChoosePosition(board);
		if (position != 0) {
			board[position] = user;
		}
		tictactoe.ShowBoard(board);

	}
}
