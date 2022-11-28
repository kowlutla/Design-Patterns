package com.kowlutla.creational.factory.person;

public class PersonFactory {

	public static Person wishPerson(String message) {
		Person person = null;
		if (message.equalsIgnoreCase("male")) {
			person = new Male();
		} else if (message.equalsIgnoreCase("female")) {
			person = new Female();
		}
		person.wish();
		return person;
	}

}
