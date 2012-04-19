package com.jasonfc.proxy;

public class RealSubject implements Subject {

	@Override
	public void request() {
		System.out.println("Go and do it!");
	}
}
