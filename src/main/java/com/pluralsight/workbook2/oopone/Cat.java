package com.pluralsight.workbook2.oopone;

public class Cat extends Animal {
    public int numberofLifes = 7;

    public void makeSound(String sound) {
        super.makeSound("Meow");
    }
}
