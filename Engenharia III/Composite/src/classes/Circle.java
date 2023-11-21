package classes;

import interfaces.Shape;

public class Circle implements Shape {

	@Override
	public void draw(String color) {
		System.out.println("Drawing a circle with color " + color);
	}

}
