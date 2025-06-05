package com.pluralsight.workbook6.WorkingWithInterfaces;

public class Person implements Comparable<Person> {
    String name;

    Person(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Person o) {
        return 0;
    }

    public String getName() {
        return name;
    }
}
