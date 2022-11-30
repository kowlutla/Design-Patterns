package com.kowlutla.structural.adapter.weather;

public class WeatherAdapter {

	public int findTemperature(int zipcode) {

		String city = null;
		if (zipcode == 518225) {
			city = "Kotakonda";
		}

		WeatherFinder finder = new WeatherFinderImpl();
		return finder.find(city);
	}

}
