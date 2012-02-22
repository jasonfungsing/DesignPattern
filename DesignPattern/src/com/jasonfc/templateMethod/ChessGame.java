package com.jasonfc.templateMethod;

public class ChessGame extends Game{

	@Override
	void initializeGame() {
		System.out.println("Set up chess board.");
		
	}

	@Override
	void keyStep1() {
		System.out.println("Player 1 move.");
		
	}

	@Override
	void keyStep2() {
		System.out.println("Player 2 move.");
		
	}

	@Override
	void decideWin() {
		System.out.println("Play 1/2 can not move any chess.");
		
	}

	@Override
	void printWinner() {
		System.out.println("The one who can still move chess.");
		
	}

}
