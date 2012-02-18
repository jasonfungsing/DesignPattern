package com.jasonfc.simpleFactory;

public class OperationFactory {

	public static Operation createOperate(String operate) {
		Operation oper = null;
		int operateInt = operationStringToInt(operate);
		switch (operateInt) {
		case 1:
			oper = new OperationAdd();
			break;
		case 2:
			oper = new OperationSub();
			break;
		case 3:
			oper = new OperationMul();
			break;
		case 4:
			oper = new OperationDiv();
			break;
		}
		return oper;
	}

	//Java 6 does not support switch by string
	private static int operationStringToInt(String operate) {
		if (operate.equalsIgnoreCase("+")) {
			return 1;
		} else if (operate.equalsIgnoreCase("-")) {
			return 2;
		} else if (operate.equalsIgnoreCase("*")) {
			return 3;
		} else if (operate.equalsIgnoreCase("/")) {
			return 4;
		} else {
			return 0;
		}
	}
}
