package com.kowlutla.creational.abstractfactory;

public class Client {

	public static void main(String[] args) {

		DaoAbstractFactory daf = DaoFactoryProducer.produce("db");
		Dao dao = daf.createDao("dept");
		dao.save();
	}

}
