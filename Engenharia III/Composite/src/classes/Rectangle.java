package classes;

import interfaces.Shape;

public class Rectangle implements Shape {

	@Override
	public void draw(String color) {
		System.out.println("Drawing a rectangle with color " + color);
	}	
}
