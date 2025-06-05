package com.pluralsight.workbook6.streamExercise;

import java.util.Arrays;

public class StreamExample {
    public static void main(String[] args) {
        var numbers = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println("Even Numbers");
        Arrays.stream(numbers)
                .filter(n -> n % 2 == 0)
                .forEach(System.out::println);

        System.out.println("Even Numbers Squared");
        Arrays.stream(numbers)
                .filter(n -> n % 2 == 0)
                .map(n -> n * n)
                .forEach(System.out::println);
    }
}
