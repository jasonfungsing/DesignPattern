package com.jasonfc.mediator;

public class ConcreteColleagueTwo extends Colleague{

	public ConcreteColleagueTwo(Mediator mediator) {
		super(mediator);
	}
	
	public void tell(String message){
		mediator.tell(message, this);
	}

	public void notify(String message){
		System.out.println("I am ColleagueTwo, I received an message: " + message);
	}
}
