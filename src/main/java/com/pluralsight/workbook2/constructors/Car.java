package com.pluralsight.workbook2.constructors;

public class Car {
    private String brand;
    private int year;
    private boolean isElectric;

    public void startEngine() {
        if (isElectric) System.out.println("Whirrrr... hmmmmmm... zzzzzzz...");
        else System.out.println("BRRAAAWWWRRRR!!! VRAAAAAMMMM");

    }
    Car(String brand, int year, boolean isElectric) {
        this.brand = brand;
        this.year = year;
        this.isElectric = isElectric;
    }
}
