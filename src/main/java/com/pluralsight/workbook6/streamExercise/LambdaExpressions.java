package com.pluralsight.workbook6.streamExercise;

import java.util.Arrays;
import java.util.function.DoubleBinaryOperator;

public class LambdaExpressions {
    public static void main(String[] args) {
        DoubleBinaryOperator multiply = (a, b) -> a * b;
        System.out.println(multiply.applyAsDouble(2.0, 2.0));

        String[] words = {"level", "banana", "madam", "world"};
//
//        for (String word : words) {
//            String sb = new StringBuilder(word).reverse().toString();
//            System.out.println(word.equals(sb));
//        }

        Arrays.stream(words)
                .map(word -> word
                        .contentEquals(new StringBuilder(word)
                                .reverse())
                )
                .forEach(System.out::println);
    }
}
