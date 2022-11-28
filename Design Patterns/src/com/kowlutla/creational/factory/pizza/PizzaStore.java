package com.kowlutla.creational.factory.pizza;

public class PizzaStore {

	public Pizza orderPizza(String type) {
		Pizza pizza = PizzaFactory.createPizza(type);
		return pizza;
	}

}
