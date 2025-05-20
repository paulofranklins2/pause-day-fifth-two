package com.pluralsight.workbook3.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionExercise {
    public static Scanner scanner = new Scanner(System.in);

    public static void exerciseOne() {
        System.out.print("Enter First Number: ");
        var a = scanner.nextDouble();
        System.out.print("Enter Second Number: ");
        var b = scanner.nextDouble();

        try {
            var result = a / b;
        } catch (ArithmeticException e) {
            System.out.println("Invalid division " + e.getMessage());
        }
    }

    public static void exerciseTwo() {
        System.out.print("Enter Number: ");
        var c = scanner.nextLine();
        try {
            var d = Integer.parseInt(c);
        } catch (NumberFormatException e) {
            System.out.println("Invalid parse " + e.getMessage());
        }
    }

    public static void exerciseThree() {
        while (true) {
            System.out.print("Enter age: ");
            try {
                var age = scanner.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Invalid age. Please enter a number.");
                scanner.nextLine();
            }
        }
    }

    public static void exerciseFour() {
        var answer = "ewq";
        var input = "";
        while (!input.equals(answer)) {
            try {
                System.out.print("secret password: ");
                input = scanner.nextLine();
            } catch (Exception e) {
                throw new RuntimeException("invalid input: " + e.getMessage());
            }
        }
    }

    public static void exerciseFive() {
        try {
            System.out.println("Please enter a temperature in Celsius.");
            double celsius = scanner.nextDouble();
            var result = (celsius * 9 / 5) + 32;
        } catch (InputMismatchException e) {
            System.out.println("invalid input");
        }
    }

    public static void exerciseSix() {
        var counter = 0;
        while (true) {
            System.out.print("Enter a number: ");
            try {
                var ood = scanner.nextDouble() % 2 == 0;
                if (ood) {
                    System.out.println("EVEN");
                } else {
                    System.out.println("OOD");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid age. Please enter a number.");
                counter++;
                if (counter >= 3) {
                    break;
                }
                scanner.nextLine();
            }
        }
    }

    public static void exerciseSeven() {
        double a;
        double b;
        char c = ' ';

        while (true) {
            try {
                System.out.print("Enter first number: ");
                a = scanner.nextDouble();
                System.out.print("Enter second number: ");
                b = scanner.nextDouble();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input");
                scanner.nextLine();
            }
        }
        var isValid = false;
        while (!isValid) {
            try {
                System.out.print("Please enter an operator + - / *: ");
                c = scanner.next().charAt(0);
                if (c == '+' || c == '-' || c == '*' || c == '/') {
                    isValid = true;
                }
            } catch (Exception e) {
                System.out.println("Invalid operator.");
            }

        }

        double result = 0;
        switch (c) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            case '/':
                try {
                    result = a / (b);
                } catch (ArithmeticException e) {
                    System.out.println("Invalid division " + e.getMessage());
                }
                break;
        }
        printResult(result);
    }

    public static void exerciseEight() {
        double a;
        double b;
        double c;
        a = extracted();
        b = extracted();
        c = extracted();
        printResult(a + b + c);
    }

    public static void exerciseNine() {
        var username = scanner.nextLine();
        if (username.length() < 3) {
            throw new IllegalArgumentException("Username can't than 3 characters.");
        }
        printResult(username);
    }

    private static double extracted() {
        while (true) {
            try {
                System.out.print("Enter a number: ");
                return scanner.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input");
                scanner.nextLine();
            }
        }
    }

    public static void printResult(String s) {
        System.out.println("Result: " + s);
    }

    public static void printResult(int i) {
        System.out.println("Result: " + i);
    }

    public static void printResult(double d) {
        System.out.println("Result: " + d);
    }

    public static void main(String[] args) {
//        exerciseOne();
//        exerciseTwo();
//        exerciseThree();
//        exerciseFour();
//        exerciseFive();
//        exerciseSix();
//        exerciseSeven();
//        exerciseEight();
//        exerciseNine();


    }


}
