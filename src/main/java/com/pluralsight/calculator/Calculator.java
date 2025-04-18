package com.pluralsight.calculator;

import java.util.Scanner;

import static com.pluralsight.reusable.ReusableCode.inputForChar;
import static com.pluralsight.reusable.ReusableCode.inputForDouble;

public class Calculator {
    private double firstInput;
    private double secondInput;
    private char operator;
    private double result;

    public void run(Scanner scanner) {
        System.out.println("Basic Calculator");

        firstInput = inputForDouble(scanner, "Enter first number: ");
        secondInput = inputForDouble(scanner, "Enter second number: ");
        operator = inputForChar(scanner, "Enter operator (+, -, *, /): ");

        if (!calculate()) {
            System.out.println("Invalid operator.");
            return;
        }
        displayResult();
    }

    private boolean calculate() {
        switch (operator) {
            case '+':
                result = firstInput + secondInput;
                return true;
            case '-':
                result = firstInput - secondInput;
                return true;
            case '*':
                result = firstInput * secondInput;
                return true;
            case '/':
                if (secondInput == 0) {
                    System.out.println("Cannot divide by zero.");
                    return false;
                }
                result = firstInput / secondInput;
                return true;
            default:
                return false;
        }
    }

    private void displayResult() {
        System.out.printf("Result: %.2f %c %.2f = %.2f%n \n", firstInput, operator, secondInput, result);
    }
}
