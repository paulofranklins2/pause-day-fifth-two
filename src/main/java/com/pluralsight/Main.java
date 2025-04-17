package com.pluralsight;

import com.pluralsight.calculator.Calculator;
import com.pluralsight.calculator.TemperatureConverter;
import com.pluralsight.calculator.TipCalculator;
import com.pluralsight.dateformatter.DateFormatter;
import com.pluralsight.sentenceanalysis.StringAnalyzer;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        var stringAnalyzer = new StringAnalyzer();
        var calculator = new Calculator();
        var tipCalculator = new TipCalculator();
        var temperatureConverter = new TemperatureConverter();
        var dateFormatter = new DateFormatter();

        //Calculator
//        stringAnalyzer.run(scanner);
        //String Analyzer
//        calculator.run(scanner);
        //Tip Calculator
//        tipCalculator.run(scanner);
        //Temperature Converter
//        temperatureConverter.run(scanner);
        //Date Formatter
        dateFormatter.run(scanner);
        scanner.close();
    }
}