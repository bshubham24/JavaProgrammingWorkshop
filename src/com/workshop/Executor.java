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

			} else if (choice == 2) {
				break;
			} else
				System.out.println("Enter the correct choice");

		}

	}
}
