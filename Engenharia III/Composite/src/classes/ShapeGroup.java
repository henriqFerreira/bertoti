package classes;

import java.util.ArrayList;
import java.util.List;

import interfaces.Shape;

public class ShapeGroup implements Shape {
	private List<Shape> shapeList = new ArrayList<>();

	public void addShape(Shape shape) {
		System.out.println("Adding a shape to the shape group");
		shapeList.add(shape);
	}

	public void removeShape(Shape shape) {
		System.out.println("Removing a shape from the shape group");
		shapeList.remove(shape);
	}

	@Override
	public void draw(String color) {
		System.out.println("Drawing a shape group with " + shapeList.size() + " shapes.");

		for (Shape shape : shapeList) {
			shape.draw(color);
		}
	}
	
}
