package com.jasonfc.strategy;

public class ConcreteStrategyAdd implements Strategy {
	
	@Override
	public int execute(int a, int b) {
		System.out.println("Going into Add Concrete Strategy");
		return a + b;
	}
	
}
