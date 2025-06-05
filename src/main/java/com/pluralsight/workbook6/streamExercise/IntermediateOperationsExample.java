package com.pluralsight.workbook6.streamExercise;

import java.util.Arrays;

public class IntermediateOperationsExample {
    public static void main(String[] args) {
        var strings = new String[]{"1aasfasdf", "2badfasdfa", "3adfc", "4dasdfvd", "5asdf", "6fasfasdf", "7asdf"};

        Arrays.stream(strings)
                .filter(s -> s.length() < 6)
                .forEach(System.out::println);
    }
}
