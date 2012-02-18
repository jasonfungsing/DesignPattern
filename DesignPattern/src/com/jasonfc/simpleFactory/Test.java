package com.jasonfc.simpleFactory;

import com.jasonfc.simpleFactory.Operation;


public class Test {

	public static void main(String[] args) {
		Operation oper;
		oper = OperationFactory.createOperate("+");
		oper.set_numberA(1);
		oper.set_numberB(2);
		System.out.println(oper.getResult());
		
	}
}
