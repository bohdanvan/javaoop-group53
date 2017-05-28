package com.bvan.oop.lessons3_4.rectangle;

/**
 * @author bvanchuhov
 */
public class RectangleRunner {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10., 20.);

        System.out.println("perimeter = " + rectangle.getPerimeter());
        System.out.println("area = " + rectangle.getArea());
        System.out.println("width = " + rectangle.getWidth());
        System.out.println("height = " + rectangle.getHeight());

        System.out.println(rectangle);
    }
}
