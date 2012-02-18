package com.jasonfc.abstractFactory;

public class MysqlUser implements IUser {

	@Override
	public void insertUser(User user) {
		System.out.println("Insert User into MySql DB");
		
	}

	@Override
	public void getuser(int id) {
		System.out.println("Get User from MySql DB");
		
	}

}
