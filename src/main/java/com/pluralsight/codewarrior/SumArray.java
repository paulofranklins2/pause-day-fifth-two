package com.pluralsight.codewarrior;

public class SumArray {

    public static double sum(double[] numbers) {
        double result = 0;
        for (double number : numbers) {
            result += number;
        }
        return result;
    }
}