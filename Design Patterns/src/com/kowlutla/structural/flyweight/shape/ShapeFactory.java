package com.kowlutla.structural.flyweight.shape;

import java.util.HashMap;
import java.util.Map;

//Factory to return the required shape
public class ShapeFactory {

	// use map to cache the shapes instead of creating the new Shape every time
	private static Map<String, Shape> shapes = new HashMap<>();

	public static Shape getShape(String type) {

		Shape shape = null;
		if (shapes.get(type) != null) {
			shape = shapes.get(type);
		} else {
			if (type.equalsIgnoreCase("circle")) {
				shape = new Circle();
			} else if (type.equalsIgnoreCase("rectangle")) {
				shape = new Rectangle();
			}

			shapes.put(type, shape);
		}

		return shape;
	}

}
