package telran.controller;

import telran.data.*;

public class ShapeApp {
    public static void main(String[] args) {

        Square sq1 = new Square(Color.BLACK, 21);
        Square sq2 = new Square(Color.RED, 14);
        Square sq3 = new Square(Color.BLUE, 11);

        Circle c1 = new Circle(Color.BLUE, 7);
        Circle c2 = new Circle(Color.BLACK, 9);
        Circle c3 = new Circle(Color.BLUE, 15);

        Rectangle r1 = new Rectangle(Color.YELLOW, 5, 9);
        Rectangle r2 = new Rectangle(Color.BLACK, 7, 3);
        Rectangle r3 = new Rectangle(Color.RED, 3, 4);

        Shape[] shapes = {sq1, sq2, sq3, c1, c2, c3, r1, r2, r3};
        displayArray(shapes);
        System.out.println();

        Shape shape1 = Shape.findMaxShapeByArea(shapes);
        Shape shape2 = Shape.findMaxShape(shapes);
        System.out.println();
        System.out.println(shape1);
        System.out.println(shape2);
        System.out.println();
        System.out.println(Shape.findMaxShapeByArea(shapes));
        System.out.println();

        Shape[] shapesByColor1 = Shape.getShapeByColor(shapes,"black");
        displayArray(shapesByColor1);
        System.out.println();
        displayArray(Shape.getShapeByColor(shapes, "blue"));
        System.out.println();
        Shape[] shapesByColor2 = Shape.getByColor(shapes, "red");
        displayArray(shapesByColor2);

    }

    public static void displayArray(Object[] objects) {
        for (Object o: objects) {
            System.out.println(o);
        }
    }

}
