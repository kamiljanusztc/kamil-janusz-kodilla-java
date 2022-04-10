package com.kodilla.testing.shape;

public class Circle implements Shape {

    private double radius;
    private String shapeName = "circle";

    public Circle(double circle) {
        this.radius = radius;
    }

    @Override
    public String getShapeName() {
        return shapeName;
    }

    @Override
    public double getField() {
        return radius * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "shapeName='" + shapeName + '\'' +
                '}';
    }
}