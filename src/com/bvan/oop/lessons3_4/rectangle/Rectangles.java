package com.bvan.oop.lessons3_4.rectangle;

import java.util.ArrayList;
import java.util.StringJoiner;

/**
 * @author bvanchuhov
 */
public class Rectangles {

    private final ArrayList<Rectangle> rectangles = new ArrayList<Rectangle>();

    public Rectangle add(Rectangle rectangle) {
        rectangles.add(rectangle);
        return rectangle;
    }

    public double getArea() {
        double sum = 0;
        for (Rectangle rectangle : rectangles) {
            sum += rectangle.getArea();
        }
        return sum;
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner("\n");
        for (Rectangle rectangle : rectangles) {
            joiner.add(rectangle.toString());
        }
        return "Rectangles:\n" + joiner.toString();
    }
}
