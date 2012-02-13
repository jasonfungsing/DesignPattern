package com.jasonfc.strategy;


public class ConcreteStrategySubtract implements Strategy{
	
	@Override
	public int execute(int a, int b) {
		System.out.println("Going into Subtract Concrete Strategy");
		return a - b;
	}
}
