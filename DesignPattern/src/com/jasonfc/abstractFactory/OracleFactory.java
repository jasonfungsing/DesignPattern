package com.jasonfc.abstractFactory;

public class OracleFactory implements IFactory {

	@Override
	public IUser createUser() {
		return new OracleUser();
	}

}
