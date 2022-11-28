package com.kowlutla.creational.singleton;

import java.io.Serializable;

public class Logger implements Cloneable, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5451152234000243309L;
	private static Logger logger;

	private Logger() {

	}

	public static Logger getInstance() {
		if (logger == null) {
			logger = new Logger();
		}
		return logger;
	}

	public void log(String message) {
		System.out.println("Log: " + message);
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException("Singleton should not be cloned");
	}

	public Object readResolve() {
		return logger;
	}

}
