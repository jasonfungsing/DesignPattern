package com.jasonfc.singleton.beforejava6;

public class Singleton {
	private static Singleton	uniqueSingleton;
	
	private Singleton() {
		
	}
	
	public static synchronized Singleton getIntance() {
		if (uniqueSingleton == null) {
			uniqueSingleton = new Singleton();
		}
		return uniqueSingleton;
	}
}
