package com.bvan.oop.lessons3_4.shape;

/**
 * @author bvanchuhov
 */
public class Runner {

    public static void main(String[] args) {
        Shapes shapes = new Shapes();
//        shapes.add(new Rectangle(10.0, 20.0)); // 200
        shapes.add(new Circle(1.)); // 3.14
        shapes.add(new EquilateralTriangle(10.0)); // 43.3
        System.out.println("area = " + shapes.getArea());

        Shape shape = shapes.get(0);
        if (shape instanceof Rectangle) {
            Rectangle rectangle = (Rectangle) shape;
            System.out.println("width = " + rectangle.getWidth());
        }
    }
}
