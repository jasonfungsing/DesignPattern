package com.jasonfc.memento;

public class Originator {

	private String state;

	public void set(String state) {
		System.out.println("Originator: Setting state to " + state);
		this.state = state;
	}

	public Memento saveToMemento() {
		System.out.println("Originator: Saving to Memento.");
		return new Memento(state);
	}
	
	public void restoreFromMemento(Memento memento){
		System.out.println("Originator: State after restoring from Memento: " + state);
		state = memento.getState();
	}
	
	public void showCurrentState(){
	System.out.println("Current State = " + state);	
	}
}
