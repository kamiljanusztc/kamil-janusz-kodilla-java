package com.kodilla.testing.shape;

public class Triangle implements Shape {

    private double base;
    private double verticalHeight;
    private String shapeName = "triangle";

    public Triangle(double base, double verticalHeight) {
        this.base = base;
        this.verticalHeight = verticalHeight;
    }

    @Override
    public String getShapeName() {
        return shapeName;
    }

    @Override
    public double getField() {
        return base * verticalHeight / 2;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "shapeName='" + shapeName + '\'' +
                '}';
    }
}
