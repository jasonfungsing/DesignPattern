package com.jasonfc.memento;

public class Test {
	public static void main(String[] args) {

		Originator o = new Originator();

		o.set("ON");
		o.showCurrentState();

		Caretaker c = new Caretaker();
		c.set(o.saveToMemento());

		o.set("OFF");
		o.showCurrentState();

		o.restoreFromMemento(c.get());
		o.showCurrentState();
	}
}
