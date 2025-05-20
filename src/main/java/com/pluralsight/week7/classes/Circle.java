package com.pluralsight.week7.classes;

import com.pluralsight.week7.interfaces.Drawable;

public class Circle implements Drawable {
    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }

    @Override
    public String toString() {
        return "Circle";
    }
}
