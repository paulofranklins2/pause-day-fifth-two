package com.pluralsight.workbook6.streamExercise;

public class Main {
    public static void main(String[] args) {
        NameCombiner nameCombiner = (firstName, lastName) -> firstName + " " + lastName;
        System.out.println(nameCombiner.combine("Paulo", "Cunha"));
    }
}
