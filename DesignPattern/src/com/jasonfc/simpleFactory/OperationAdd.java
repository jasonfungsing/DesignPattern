package com.jasonfc.simpleFactory;

public class OperationAdd extends Operation {

	@Override
	public double getResult() {
		double result = 0;
		result = super.get_numberA() + super.get_numberB();
		return result;
	}
}
