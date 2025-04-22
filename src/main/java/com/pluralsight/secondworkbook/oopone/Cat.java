package com.pluralsight.secondworkbook.oopone;

public class Cat extends Animal {
    public int numberofLifes = 7;

    public void makeSound(String sound) {
        super.makeSound("Meow");
    }
}
