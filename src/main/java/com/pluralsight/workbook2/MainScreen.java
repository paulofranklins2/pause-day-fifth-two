package com.pluralsight.workbook2;

import com.pluralsight.workbook2.calculator.Calculator;
import com.pluralsight.workbook2.calculator.TemperatureConverter;
import com.pluralsight.workbook2.calculator.TipCalculator;
import com.pluralsight.workbook2.dateformatter.DateFormatter;
import com.pluralsight.workbook2.sentenceanalysis.StringAnalyzer;
import com.pluralsight.workbook2.stringbuilder.AddressBuilder;

import java.util.Scanner;

import static com.pluralsight.workbook2.reusable.ReusableCode.inputForInt;

public class MainScreen {
    static int userChoice;

    static void mainScreen(Scanner scanner) {
        System.out.println("1 - Calculator");
        System.out.println("2 - String Analyzer");
        System.out.println("3 - Tip Calculator");
        System.out.println("4 - Temperature Converter");
        System.out.println("5 - Date Formatter");
        System.out.println("6 - Address Builder");
        userChoice = inputForInt(scanner, "Choice: ");
    }

    static void runningMainScreenLogic(Scanner scanner) {
        var running = true;
        while (running) {
            mainScreen(scanner);
            scanner.nextLine();
            switch (userChoice) {
                case 1:
                    //Calculator
                    new Calculator().run(scanner);
                    break;
                case 2:
                    //String Analyzer
                    new StringAnalyzer().run(scanner);
                    break;
                case 3:
                    //Tip Calculator
                    new TipCalculator().run(scanner);
                    break;
                case 4:
                    //Temperature Converter
                    new TemperatureConverter().run(scanner);
                    break;
                case 5:
                    //Date Formatter
                    new DateFormatter().run(scanner);
                    break;
                case 6:
                    //Address Builder
                    new AddressBuilder().run(scanner);
                    break;
                case 0:
                    running = false;
                default:
                    mainScreen(scanner);
            }
        }
    }
}
