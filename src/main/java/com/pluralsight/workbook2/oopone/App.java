package com.pluralsight.workbook2.oopone;

public class App {
    public static void main(String[] args) {
        var cat = new Cat();
        System.out.println();

        cat.setName("kitty");
        cat.setColor("blue");
        cat.setAge(35);
        cat.setGender(false);
        cat.setNumberOfLegs(5);
        System.out.println(cat.numberofLifes);
        System.out.println();
        cat.makeSound("Bark");

        var dog = new Dog();
        System.out.println(cat);
        System.out.println();
        System.out.println(dog);
        dog.makeSound("Bark");
    }
}
