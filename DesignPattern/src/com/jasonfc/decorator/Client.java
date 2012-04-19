package com.jasonfc.decorator;

public class Client {

	public static void main(String[] args) {

		ConcreteComponent cComponent = new ConcreteComponent();
		ConcreteDecoratorA cDecoratorA = new ConcreteDecoratorA();
		ConcreteDecoratorB cDecoratorB = new ConcreteDecoratorB();

		cComponent.dressUp();
		System.out.println();
		
		System.out.println("I am a normal man if I ");
		cDecoratorA.dressUp();
		System.out.println("then ");
		cDecoratorB.dressUp();
		
		System.out.println();
		
		System.out.println("I ma superman if I ");
		cDecoratorB.dressUp();
		System.out.println("then ");
		cDecoratorA.dressUp();
		
	}

}
