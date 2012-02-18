package com.jasonfc.abstractFactory;

public class OracleUser implements IUser{

	@Override
	public void insertUser(User user) {
		System.out.println("Insert User into Oracle DB");
		
	}

	@Override
	public void getuser(int id) {
		System.out.println("Get User from Oracle DB");
		
	}

}
