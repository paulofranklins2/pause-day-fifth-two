package com.pluralsight.week7.classes;

import com.pluralsight.week7.interfaces.Eater;

public class Dog implements Eater {
    private final String name;

    Dog(String name) {
        this.name = name;
    }

    @Override
    public void eat() {
        System.out.println(name + " the dog is eating.");
    }
}
