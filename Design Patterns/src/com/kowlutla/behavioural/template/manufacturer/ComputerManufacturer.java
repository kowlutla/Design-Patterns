package com.kowlutla.behavioural.template.manufacturer;

public abstract class ComputerManufacturer {

	void buildComputer() {

		// algorithm here
		addHardDisk();
		addRAM();
		addKeyboard();

	}

	public abstract void addHardDisk();

	public abstract void addRAM();

	public abstract void addKeyboard();

}
