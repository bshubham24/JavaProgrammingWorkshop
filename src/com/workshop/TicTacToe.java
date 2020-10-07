package com.workshop;

public class TicTacToe {
	public int[] CreateBoard() {
		int board[] = new int[10];
		return board;
	}

	public void DisplayBoard(int board[]) {
		for (int i = 1; i < board.length; i++) {
			System.out.println(board[i]);
		}
	}

}
