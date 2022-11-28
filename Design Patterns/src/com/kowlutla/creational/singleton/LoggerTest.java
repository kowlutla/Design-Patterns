package com.kowlutla.creational.singleton;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class LoggerTest {

	public static void main(String[] args)
			throws FileNotFoundException, IOException, CloneNotSupportedException, ClassNotFoundException {

		Logger logger1 = Logger.getInstance();

		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File("data.ser")));
		oos.writeObject(logger1);

		ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File("data.ser")));
		Logger logger2 = (Logger) ois.readObject();
		System.out.println(logger1 == logger2);

		logger1.log("Hello Kowlutla");
	}

}
