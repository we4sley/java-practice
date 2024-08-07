package com.we4sley.level01.basic;

public class Circle extends Shape implements Resizable {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void resize(double factor) {
        radius *= factor;
    }

    @Override
    double calculateArea() {
        return radius * radius * Math.PI;
    }

    @Override
    double calculatePerimeter() {
        return radius * 2 * Math.PI;
    }
}
