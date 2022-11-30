package com.kowlutla.behavioural.template.manufacturer;

public class LaptopManufacturer extends ComputerManufacturer {

	@Override
	public void addHardDisk() {
		System.out.println("Add hard disk to Laptop");
	}

	@Override
	public void addRAM() {
		System.out.println("Add RAM to Laptop");
	}

	@Override
	public void addKeyboard() {
		System.out.println("Add Keyboard to Laptop");
	}

}
