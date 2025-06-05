package com.pluralsight.workbook6.streamExercise;

import java.util.List;

public class BuiltInFunctional {
    public static void main(String[] args) {
        List<String> words = List.of("hello", "world", "lambda");
        for (String word : words) {
            System.out.println(word.toUpperCase());
        }
    }
}
