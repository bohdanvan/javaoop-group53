package com.bvan.oop.lessons3_4.rectangle;

/**
 * @author bvanchuhov
 */
public class RectanglesRunner {

    public static void main(String[] args) {
        Rectangles rectangles = new Rectangles();
        rectangles.add(new Rectangle(10., 20.));
        rectangles.add(new Rectangle(2., 3.));

        System.out.println("area = " + rectangles.getArea());
        System.out.println(rectangles);
    }
}
