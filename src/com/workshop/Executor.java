package com.workshop;

import java.util.Scanner;

public class Executor {
	public static void main(String[] args) {
		char user, computer;
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

	}
}
