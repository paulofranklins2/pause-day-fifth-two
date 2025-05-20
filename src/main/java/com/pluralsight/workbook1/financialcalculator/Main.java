package com.pluralsight.workbook1.financialcalculator;

import java.util.Scanner;

import static com.pluralsight.workbook1.financialcalculator.PrintScreens.runningMainScreen;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        runningMainScreen(scanner);
        scanner.close();
    }
}