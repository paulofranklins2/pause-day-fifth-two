package com.pluralsight.secondweek.constructors;

public class Rectangle {
    private double length;
    private double width;
    private double area;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getArea() {
        return this.length * this.width;
    }
}
