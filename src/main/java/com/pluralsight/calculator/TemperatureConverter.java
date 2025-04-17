package com.pluralsight.calculator;

import java.util.Scanner;

import static com.pluralsight.reusable.ReusableCode.inputForChar;
import static com.pluralsight.reusable.ReusableCode.inputForDouble;

public class TemperatureConverter {
    private char operator;
    private double temperature;
    private double result;

    public void run(Scanner scanner) {
        System.out.println("Temperature Converter");
        operator = inputForChar(scanner, "Enter the operator: C ➝  Celsius ➝ Fahrenheit || F ➝ Fahrenheit ➝ Celsius: ");
        temperature = inputForDouble(scanner, "Enter the temperature to convert: ");
        calculate();
        displayResult();
    }

    private void displayResult() {
        if (operator == 'C') System.out.printf("Result: %.2f %c = %.1fF \n", temperature, operator, result);
        else System.out.printf("Result: %.2f %c = %.1fC \n", temperature, operator, result);
    }

    private void calculate() {
        switch (operator) {
            case 'C' -> {
                result = (temperature * 9 / 5) + 32;
            }
            case 'F' -> {
                result = (temperature - 32) * 5 / 9;
            }
        }
    }
}
