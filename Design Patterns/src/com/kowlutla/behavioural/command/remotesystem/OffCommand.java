package com.kowlutla.behavioural.command.remotesystem;

//Concrete implementation of Command interface
public class OffCommand implements Command {

	// use the receiver object
	private Television television;

	public OffCommand(Television television) {
		this.television = television;
	}

	@Override
	public void execute() {
		television.off();
	}

}
