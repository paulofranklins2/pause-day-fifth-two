package com.pluralsight.workbook6.interfaceExercise;

public class LambdaExample implements NumericOperator {
    @Override
    public int operate(int a, int b) {
        return Math.max(a, b);
    }
}
