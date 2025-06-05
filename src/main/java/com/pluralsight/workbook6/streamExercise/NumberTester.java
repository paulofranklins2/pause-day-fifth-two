package com.pluralsight.workbook6.streamExercise;

import java.util.Arrays;
@FunctionalInterface
public interface NumberTester {
    boolean test(int n);

    public static void main(String[] args) {
        var numbers = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        NumberTester isEven = n -> n % 2 == 0;

        for (int n : numbers) {
            System.out.println(n + " is even: " + isEven.test(n));
        }
    }
}
