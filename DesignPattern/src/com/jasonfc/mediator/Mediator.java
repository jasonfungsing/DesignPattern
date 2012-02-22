package com.jasonfc.mediator;

abstract class Mediator {

	abstract void tell(String message, Colleague mediator);
}
