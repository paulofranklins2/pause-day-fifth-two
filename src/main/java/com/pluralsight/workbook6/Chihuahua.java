package com.pluralsight.workbook6;

public class Chihuahua {
    String name;

    Chihuahua(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Chihuahua: Mr. " + this.name;
    }
}

