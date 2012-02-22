package com.jasonfc.mediator;

public class ConcreteMediator extends Mediator {

	private ConcreteColleagueOne colleagueOne;
	private ConcreteColleagueTwo colleagueTwo;
	
	public void setColleagueOne(ConcreteColleagueOne colleagueOne) {
		this.colleagueOne = colleagueOne;
	}

	public void setColleagueTwo(ConcreteColleagueTwo colleagueTwo) {
		this.colleagueTwo = colleagueTwo;
	}

	@Override
	void tell(String message, Colleague colleague) {
		if(colleague == colleagueOne){
			colleagueTwo.notify(message);
		}else{
			colleagueOne.notify(message);
		}
	}

}
