package com.jasonfc.abstractFactory;

public class MysqlFactory implements IFactory {

	@Override
	public IUser createUser() {
		return new MysqlUser();
	}

}
