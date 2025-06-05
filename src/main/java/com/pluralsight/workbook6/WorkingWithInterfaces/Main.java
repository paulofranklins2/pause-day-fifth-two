package com.pluralsight.workbook6.WorkingWithInterfaces;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Wilmer"));
        people.add(new Person("Paulo"));
        people.add(new Person("Maria"));
        people.add(new Person("Maaike"));
        people.add(new Person("Mario"));
    }
}
