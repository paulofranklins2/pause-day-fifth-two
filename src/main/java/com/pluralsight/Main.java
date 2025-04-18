package com.pluralsight;

import com.pluralsight.calculator.Calculator;
import com.pluralsight.calculator.TemperatureConverter;
import com.pluralsight.calculator.TipCalculator;
import com.pluralsight.dateformatter.DateFormatter;
import com.pluralsight.sentenceanalysis.StringAnalyzer;

import java.util.Scanner;

import static com.pluralsight.reusable.ReusableCode.inputForInt;

public class Main {
    static int userChoice;

    static void mainScreen(Scanner scanner) {
        System.out.println("1 - Calculator");
        System.out.println("2 - String Analyzer");
        System.out.println("3 - Tip Calculator");
        System.out.println("4 - Temperature Converter");
        System.out.println("5 - Date Formatter");
        userChoice = inputForInt(scanner, "Choice: ");
    }

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        var stringAnalyzer = new StringAnalyzer();
        var calculator = new Calculator();
        var tipCalculator = new TipCalculator();
        var temperatureConverter = new TemperatureConverter();
        var dateFormatter = new DateFormatter();

        var running = true;
        while (running) {
            mainScreen(scanner);
            scanner.nextLine();
            switch (userChoice) {
                case 1:
                    //Calculator
                    calculator.run(scanner);
                    break;
                case 2:
                    //String Analyzer
                    stringAnalyzer.run(scanner);
                    break;
                case 3:
                    //Tip Calculator
                    tipCalculator.run(scanner);
                    break;
                case 4:
                    //Temperature Converter
                    temperatureConverter.run(scanner);
                    break;
                case 5:
                    //Date Formatter
                    dateFormatter.run(scanner);
                    break;
                case 0:
                    running = false;
                default:
                    mainScreen(scanner);
            }
        }
        scanner.close();
    }
}