package com.pluralsight.codewarrior;

public class BasicOperations {
    public static void main(String[] args) {
        System.out.println(basicMath("+", 2, 2));
    }

    public static Integer basicMath(String op, int v1, int v2) {
        return switch (op.charAt(0)) {
            case '+' -> v1 + v2;
            case '-' -> v1 - v2;
            case '*' -> v1 * v2;
            case '/' -> v1 / v2;
            default -> 0;
        };
    }
}