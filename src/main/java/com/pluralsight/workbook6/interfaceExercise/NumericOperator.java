package com.pluralsight.workbook6.interfaceExercise;

@FunctionalInterface
public interface NumericOperator {
    int operate(int a, int b);

    public static void main(String[] args) {
        System.out.println("********** Sum **********");
        NumericOperator add = Integer::sum;
        System.out.println(add.operate(1, 2));
        System.out.println();

        System.out.println("********** Start Max **********");
        NumericOperator max = Integer::max;
        System.out.println(max.operate(2, 2));
        System.out.println("********** OOOR **********");
        System.out.println(new LambdaExample().operate(2, 4));
        System.out.println("********** END Max **********");

        System.out.println();
        System.out.println("********** String Formatter **********");
        StringFormatter formatter = String::toUpperCase;
        System.out.println(formatter.format("hello"));

        System.out.println();
        System.out.println("********** Square **********");
        UnaryOperator square = a -> a * a;
        System.out.println(square.apply(2));


//        NumericOperator sub = Integer::min;
//        System.out.println(sub.operate(1, 2));
//        NumericOperator div = Integer::divideUnsigned;
//        System.out.println(div.operate(10, 2));
    }
}
