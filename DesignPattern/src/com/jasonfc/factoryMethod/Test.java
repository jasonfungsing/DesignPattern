package com.jasonfc.factoryMethod;

public class Test {

	public static void main(String[] args) {

		IFactory operFactory = new AddFactory();
		Operation oper = operFactory.createOperation();
		oper.set_numberA(1);
		oper.set_numberB(2);
		System.out.println(oper.getResult());

	}
}
