package com.jasonfc.strategy;

public class StrategyTest {
	public static void main(String[] args) {
		Context context;
		
		context = new Context(new ConcreteStrategyAdd());
		int resultA = context.executeStrategy(3, 4);
		System.out.println("Add : " + resultA);
		
		context = new Context(new ConcreteStrategySubtract());
		int resultB = context.executeStrategy(3, 4);
		System.out.println("Subtract : " + resultB);
		
		context = new Context(new ConcreteStrategyMultiply());
		int resultC = context.executeStrategy(3, 4);
		System.out.println("Multiply : " + resultC);
		
	}
}
