package com.pluralsight.week7.classes;

import com.pluralsight.week7.interfaces.Drawable;

public class ShapeFactory {

    public Drawable getShape(String type) {
        return switch (type.toLowerCase()) {
            case "circle" -> new Circle();
            case "square" -> new Square();
            default -> {
                System.out.println("Invalid shape");
                yield null;
            }
        };
    }
}
