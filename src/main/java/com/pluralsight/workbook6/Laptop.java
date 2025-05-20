package com.pluralsight.workbook6;

public class Laptop {
    String brand;

    Laptop(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Laptop: " + this.brand;
    }
}
