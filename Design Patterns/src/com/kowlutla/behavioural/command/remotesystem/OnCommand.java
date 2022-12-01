package com.kowlutla.behavioural.command.remotesystem;

//Concrete implementation of Command interface
public class OnCommand implements Command {

	// use the receiver object
	private Television television;

	public OnCommand(Television television) {
		this.television = television;
	}

	@Override
	public void execute() {
		television.on();
	}

}
