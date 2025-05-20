package com.pluralsight.workbook6;

public class App {
    public static void main(String[] args) {
        Bag<Laptop> laptopBag = new Bag<>();
        laptopBag.add(new Laptop("Dell"));
        laptopBag.add(new Laptop("HP"));
        laptopBag.add(new Laptop("Lenovo"));
        laptopBag.printContents();

        System.out.println();

        Bag<Chihuahua> chihuahuaBag = new Bag<>();
        chihuahuaBag.add(new Chihuahua("Mra. Samantha"));
        chihuahuaBag.add(new Chihuahua("Mr. Wilmer"));
        chihuahuaBag.add(new Chihuahua("Mr. Ryan"));
        chihuahuaBag.add(new Chihuahua("Mr. Presto"));
        chihuahuaBag.printContents();
    }
}
