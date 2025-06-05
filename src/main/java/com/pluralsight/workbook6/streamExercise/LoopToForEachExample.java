package com.pluralsight.workbook6.streamExercise;

import java.util.Arrays;

public class LoopToForEachExample {
    public static void main(String[] args) {
        var strings = new String[]{"1aasfasdf", "2badfasdfa", "3adfc", "4dasdfvd", "5asdf", "6fasfasdf", "7asdf"};
        System.out.println("Lambda foreach");
        Arrays.stream(strings).forEach(System.out::println);
        System.out.println();
        System.out.println("Regular foreach");
        for (String s : strings) {
            System.out.println(s);
        }
    }
}
