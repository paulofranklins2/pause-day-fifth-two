package com.pluralsight.week7.classes;

import com.pluralsight.week7.interfaces.Drawable;

public class Square implements Drawable {
    @Override
    public void draw() {
        System.out.println("Drawing a square");
    }
    @Override
    public String toString() {
        return "Square";
    }
}
