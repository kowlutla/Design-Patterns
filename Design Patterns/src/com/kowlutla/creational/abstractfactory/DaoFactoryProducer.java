package com.kowlutla.creational.abstractfactory;

public class DaoFactoryProducer {

	public static DaoAbstractFactory produce(String factoryType) {

		if (factoryType.equalsIgnoreCase("db")) {
			return new DBDaoFactory();
		} else {
			return new XMLDaoFactory();
		}
	}

}
