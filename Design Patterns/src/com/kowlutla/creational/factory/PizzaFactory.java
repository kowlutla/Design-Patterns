package com.kowlutla.creational.factory;

public class PizzaFactory {

	public static Pizza createPizza(String type) {
		Pizza pizza = null;

		if (type.equalsIgnoreCase("cheese")) {
			pizza = new ChessPizza();
		} else if (type.equalsIgnoreCase("veg")) {
			pizza = new VegPizza();
		}

		pizza.prepare();
		pizza.bake();
		pizza.cut();
		return pizza;
	}
}
