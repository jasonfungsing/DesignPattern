package com.jasonfc.decorator;

public class ConcreteDecoratorA extends Decorator {

	@Override
	public void dressUp(){
		super.dressUp();
		System.out.println("Put on underware!");
	}
}
