package com.pluralsight.workbook2.constructors;

public class Person {
    private String name;
    private int age;

    Person(String name, int age) {
        if (age < 0) {
            System.out.println("wrong age input");
            this.age = 0;
        }
        this.name = name;
        this.age = age;
    }
}
