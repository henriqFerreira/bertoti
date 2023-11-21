import classes.Circle;
import classes.Rectangle;
import classes.ShapeGroup;

public class Main {
	public static void main(String[] args) {
		Circle circle = new Circle();
		Rectangle rectangle = new Rectangle();
		ShapeGroup shapeGroup = new ShapeGroup();

		circle.draw("red");
		rectangle.draw("blue");

		shapeGroup.addShape(circle);
		shapeGroup.addShape(rectangle);
		shapeGroup.draw("green");
	}
}
