package com.jasonfc.templateMethod;

public class Test {

	public static void main(String[] args){
		Game c = new ChessGame();
		c.TemplateMethod();
		System.out.println("-------- Beautiful separate line --------");
		Game k = new KOGame();
		k.TemplateMethod();
	}
}
