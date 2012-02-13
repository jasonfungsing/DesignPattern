package com.jasonfc.strategy;


public class ConcreteStrategyMultiply implements Strategy {

	@Override
	public int execute(int a, int b) {
		System.out.println("Going into Multiply Concrete Strategy");
		return a*b;
	}
	
}
