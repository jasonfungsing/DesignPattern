package com.jasonfc.templateMethod;

public abstract class Game {

	abstract void initializeGame();
	abstract void keyStep1();
	abstract void keyStep2();
	abstract void decideWin();
	abstract void printWinner();
	
	public final void TemplateMethod(){
		initializeGame();
		keyStep1();
		keyStep2();
		decideWin();
		printWinner();
	}
}
