package com.kowlutla.structural.flyweight.shape;

public class Circle extends Shape {

	private String label;

	public Circle() {
		this.label = "Circle";
	}

	@Override
	public void draw(int radius, String fillColor, String lineColor) {
		System.out.println("Drawing a " + label + " with radius " + radius + " " + " Fill color " + fillColor
				+ " Line color " + lineColor);
	}

}
