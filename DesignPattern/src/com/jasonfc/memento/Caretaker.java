package com.jasonfc.memento;

public class Caretaker {

	private Memento memento;
	
	public Memento get(){
		return memento;
	}
	
	public void set(Memento memento){
		this.memento = memento;
	}
}
