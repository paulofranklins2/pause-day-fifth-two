package com.pluralsight.workbook6.streamExercise;

@FunctionalInterface
public interface Greeter {
    String greet(String name);

    public static void main(String[] args) {
        Greeter greet = (s) -> new StringBuilder("Hello ").append(s).toString();
        System.out.println(greet.greet("Paulo"));
    }
}
