package com.kowlutla.creational.factory.person;

public class PersonStore {

	public Person wishPerson(String message) {
		Person person = PersonFactory.wishPerson(message);
		return person;
	}

}
