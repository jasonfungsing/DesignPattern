package com.jasonfc.mediator;

public class Test {
	public static void main(String[] args) {
		ConcreteMediator cm = new ConcreteMediator();
		ConcreteColleagueOne c1 = new ConcreteColleagueOne(cm);
		ConcreteColleagueTwo c2 = new ConcreteColleagueTwo(cm);
		
		cm.setColleagueOne(c1);
		cm.setColleagueTwo(c2);
		
		c1.tell("I love you!");
		c2.tell("Thank you.");

	}
}
