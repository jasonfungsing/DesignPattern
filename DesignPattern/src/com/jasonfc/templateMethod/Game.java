package com.jasonfc.templateMethod;

public abstract class Game {

	abstract void initializeGame();
	abstract void keyStep1();
	abstract void keyStep2();
	abstract void decideWin();
	abstract void printWinner();
	
	public final void TemplateMethod(){
		System.out.print("How to start games: ");
		initializeGame();
		System.out.print("First step: ");
		keyStep1();
		System.out.print("Second step: ");
		keyStep2();
		System.out.println("Omit steps....");
		System.out.print("Decide who is winner: ");
		decideWin();
		System.out.print("The winner is: ");
		printWinner();
	}
}
