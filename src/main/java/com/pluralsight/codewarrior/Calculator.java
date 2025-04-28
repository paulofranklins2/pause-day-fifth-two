package com.pluralsight.codewarrior;

public class Calculator {
    public static double calculate(double a, double b, String op) {
        switch (op){
            case "+" -> {
                return a + b;
            }
            case "-" -> {
                return a - b;
            }
            case "*" -> {
                return a * b;
            }
            case "/" -> {
                return a / b;
            }
            default -> {
                throw new IllegalArgumentException();
            }
        }
    }
}