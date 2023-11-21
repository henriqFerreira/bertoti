# Composite pattern

> Composite pattern is a structural design pattern that allows you to compose objects into tree structures, and work with these structures as if they were individual objects.

## Exemplo

![Composite Diagram](/Engenharia%20III/Composite/src/assets/diagrama_composite.png)

### Código

Main.java (src/Main.java)

```java
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
```

Shape.java (src/interfaces/Shape.java)

```java
package interfaces;
package interfaces;

public interface Shape {
 void draw(String color);
}

```

Circle.java (src/classes/Circle.java)

```java
package classes;

import interfaces.Shape;

public class Circle implements Shape {

 @Override
 public void draw(String color) {
  System.out.println("Drawing a circle with color " + color);
 }

}

```

Rectangle.java (src/classes/Rectangle.java)

```java
package classes;

import interfaces.Shape;

public class Rectangle implements Shape {

 @Override
 public void draw(String color) {
  System.out.println("Drawing a rectangle with color " + color);
 } 
}
```

ShapeGroup.java (src/classes/ShapeGroup.java)

```java
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

```
