package com.kowlutla.creational.singleton;

public class Singleton {

	private static Singleton instance;

//	 EARLY Instantiation
//	private static Singleton instance=new Singleton();

	private Singleton() {
	}

	public static Singleton getInstance() {

		// LAZY Instantiation
		if (instance == null) {
			instance = new Singleton();
		}
		return instance;
	}
}
