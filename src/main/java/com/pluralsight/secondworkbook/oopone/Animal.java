package com.pluralsight.secondworkbook.oopone;

public class Animal {
    String name;
    String color;
    int age;
    boolean gender;
    int numberOfLegs;
    int sleepingHours;

    public void makeSound(String sound) {
        System.out.println(name + " " + sound);
    }

    public void wagTail() {
        System.out.println(name + " wag tail");
    }

    @Override
    public String toString() {
        String convertGender = gender ? "male" : "female";
        return "name: " + name + "\n" +
                "color: " + color + "\n" +
                "age: " + age + "\n" +
                "gender: " + convertGender + "\n" +
                "numberOfLegs: " + numberOfLegs + "\n"
                + "sleepingHours: " + sleepingHours;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public void setNumberOfLegs(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }
}
