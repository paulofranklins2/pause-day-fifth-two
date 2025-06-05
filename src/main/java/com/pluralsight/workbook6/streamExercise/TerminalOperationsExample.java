package com.pluralsight.workbook6.streamExercise;

import java.util.Arrays;

public class TerminalOperationsExample {
    public static void main(String[] args) {
        var numbers = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        long count = Arrays.stream(numbers)
                .filter(n -> n % 2 == 0)
                .count();
        System.out.println(count);
    }
}
