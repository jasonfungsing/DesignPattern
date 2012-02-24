package com.jasonfc.command;

public class Invoker {

	public Command command;

	public void setCommand(Command command) {
		this.command = command;
	}

	public void executeCommand() {
		command.execute();
	}
}
