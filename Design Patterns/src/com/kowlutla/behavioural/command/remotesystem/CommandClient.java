package com.kowlutla.behavioural.command.remotesystem;

public class CommandClient {

	public static void main(String[] args) {

		// Create RemoteControl
		RemoteControl remoteControl = new RemoteControl();

		// Create Television
		Television television = new Television();

		// Create a On command and to apply on television
		Command onCommand = new OnCommand(television);

		// set the command to remote control
		remoteControl.setCommand(onCommand);
		// press button
		remoteControl.pressButton();

		System.out.println("---------------------");
		// Create a Off command and to apply on television
		Command offCommand = new OffCommand(television);
		// set the command to remote control
		remoteControl.setCommand(offCommand);
		// press button
		remoteControl.pressButton();
	}

}
