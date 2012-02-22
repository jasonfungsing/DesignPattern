package com.jasonfc.templateMethod;

public class KOGame extends Game{

	@Override
	void initializeGame() {
		System.out.println("Both play stand face to face.");
		
	}

	@Override
	void keyStep1() {
		System.out.println("Player 1 start kick on player 2 for 30 secs.");
		
	}

	@Override
	void keyStep2() {
		System.out.println("Player 2 start kick on player 1 for 30 secs.");
		
	}

	@Override
	void decideWin() {
		System.out.println("Who is stand still");
		
	}

	@Override
	void printWinner() {
		System.out.println("The one who is still stand there");
		
	}

}
