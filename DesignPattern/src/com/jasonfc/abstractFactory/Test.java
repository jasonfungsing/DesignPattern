package com.jasonfc.abstractFactory;

public class Test {
	
	public static void main(String[] args){
		User user = new User();
		IFactory factory = new MysqlFactory();
		IUser iu = factory.createUser();
		iu.insertUser(user);
		iu.getuser(1);
	}

}
