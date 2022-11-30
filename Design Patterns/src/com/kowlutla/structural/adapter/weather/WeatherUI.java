package com.kowlutla.structural.adapter.weather;

public class WeatherUI {

	public void showTemperature(int zipcode) {

		WeatherAdapter adapter = new WeatherAdapter();
		int temperature = adapter.findTemperature(zipcode);
		System.out.println("Temperature is: " + temperature);
	}

	public static void main(String[] args) {

		WeatherUI weatherUI = new WeatherUI();
		weatherUI.showTemperature(1);
	}

}
