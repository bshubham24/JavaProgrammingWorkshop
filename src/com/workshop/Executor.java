package com.workshop;

import java.util.Scanner;

public class Executor {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome\n");

		TicTacToe tictactoe = new TicTacToe();
		System.out.println("choose an option");
		System.out.println("1. Let's Play");
		System.out.println("2. Exit");
		int choice = Integer.parseInt(sc.nextLine());
		if (choice == 1) {
			tictactoe.CreateBoard();
			char toss = tictactoe.Toss();
			tictactoe.play(toss);
		} else {
			System.out.println("Thank You!");
		}
	}
}
