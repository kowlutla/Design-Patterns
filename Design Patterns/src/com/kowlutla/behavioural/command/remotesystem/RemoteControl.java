package com.kowlutla.behavioural.command.remotesystem;

//Invoker
public class RemoteControl {

	// Keep the reference of command
	private Command command;

	public Command getCommand() {
		return command;
	}

	public void setCommand(Command command) {
		this.command = command;
	}

	// operation that we want to perform
	public void pressButton() {
		command.execute();
	}

}
