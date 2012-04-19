package com.jasonfc.decorator;

public class ConcreteDecoratorB extends Decorator{

	@Override
	public void dressUp(){
		super.dressUp();
		System.out.println("Put on pants!");
	}
}
