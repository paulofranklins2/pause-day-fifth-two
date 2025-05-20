package com.pluralsight.week7.classes;

import com.pluralsight.week7.interfaces.Eater;

public class Cat implements Eater {
    private final String name;

    Cat(String name) {
        this.name = name;
    }

    @Override
    public void eat() {
        System.out.println(name + " the cat is eating.");
    }
}
