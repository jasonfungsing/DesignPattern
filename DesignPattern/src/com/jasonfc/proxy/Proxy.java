package com.jasonfc.proxy;

public class Proxy implements Subject {

	RealSubject realSubject = new RealSubject();

	@Override
	public void request() {
		if (realSubject == null) {
			realSubject = new RealSubject();
		}
		realSubject.request();
	}

}
