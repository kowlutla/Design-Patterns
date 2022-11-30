package com.kowlutla.behavioural.template.manufacturer;

public class DesktopManufacturer extends ComputerManufacturer {

	@Override
	public void addHardDisk() {
		System.out.println("Add hard disk to Desktop");
	}

	@Override
	public void addRAM() {
		System.out.println("Add RAM to Desktop");
	}

	@Override
	public void addKeyboard() {
		System.out.println("Add Keyboard to Desktop");
	}

}
