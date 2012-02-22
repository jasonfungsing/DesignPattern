package com.jasonfc.mediator;

public class ConcreteColleagueOne extends Colleague {

	public ConcreteColleagueOne(Mediator mediator) {
		super(mediator);
	}
	
	public void tell(String message){
		mediator.tell(message, this);
	}
	
	public void notify(String message){
		System.out.println("I am ColleagueOne, I received an message: " + message);
	}

	
}
