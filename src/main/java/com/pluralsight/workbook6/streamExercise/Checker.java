package com.pluralsight.workbook6.streamExercise;

@FunctionalInterface
public interface Checker<T> {
    boolean check(T value);
}
