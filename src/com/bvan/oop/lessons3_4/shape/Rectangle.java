package com.bvan.oop.lessons3_4.shape;

/**
 * Immutable rectangle.
 *
 * @author bvanchuhov
 */
public class Rectangle implements Shape {

    private final double width;
    private final double height;

    public Rectangle(double width, double height) {
        if (width < 0) {
            throw new IllegalArgumentException("negative width: " + width);
        }
        if (height < 0) {
            throw new IllegalArgumentException("negative height: " + height);
        }

        this.width = width;
        this.height = height;
    }

    public double getPerimeter() {
        return (height + width) * 2;
    }

    public double getArea() {
        return height * width;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }
}
