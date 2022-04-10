package com.kodilla.testing.shape;

public class Square implements Shape {

    private double side;
    private String shapeName = "square";

    public Square(double side) {
        this.side = side;
    }

    @Override
    public String getShapeName() {
        return shapeName;
    }

    @Override
    public double getField() {
        return side * side;
    }

    @Override
    public String toString() {
        return "Square{" +
                "shapeName='" + shapeName + '\'' +
                '}';
    }
}
