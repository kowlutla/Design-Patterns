package com.kowlutla.behavioural.template.manufacturer;

public class ComputerClient {

	public static void main(String[] args) {

		ComputerManufacturer manufacturer = new LaptopManufacturer();
		manufacturer.buildComputer();

		System.out.println("-------------------------------------------------");
		manufacturer = new DesktopManufacturer();
		manufacturer.buildComputer();
	}

}
