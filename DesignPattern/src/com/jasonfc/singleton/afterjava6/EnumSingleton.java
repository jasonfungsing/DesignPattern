package com.jasonfc.singleton.afterjava6;

public enum EnumSingleton implements Singleton {
	INSTANCE;
	private String	something;
	
	@Override
	public String getSingleton() {
		return something;
	}
}
