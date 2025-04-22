package com.pluralsight.firstworkbook.financialcalculator;

import java.util.Scanner;

import static com.pluralsight.firstworkbook.financialcalculator.PrintScreens.runningMainScreen;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        runningMainScreen(scanner);
        scanner.close();
    }
}