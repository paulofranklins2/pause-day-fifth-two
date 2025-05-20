package com.pluralsight.week7.classes;

import com.pluralsight.week7.interfaces.Eater;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

//        ShapeFactory x = new ShapeFactory();
//        Drawable circle = x.getShape("Circle");
//        System.out.println(circle);
//        Drawable square = x.getShape("square");
//        System.out.println(square);

        ArrayList<Square> products = new ArrayList<>();
        products.add(new Square());
        products.get(0);

        LocalDate date = LocalDate.now();

        System.out.println(date.getDayOfMonth());

        ArrayList<Eater> eaters = new ArrayList<>();
        eaters.add(new Cat("Tom"));
        eaters.add(new Dog("Jerry"));

        eaters.forEach(Eater::eat);
        System.out.println();
        eaters.forEach(System.out::println);
    }
}
