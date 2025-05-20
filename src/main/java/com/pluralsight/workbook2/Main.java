package com.pluralsight.workbook2;

import java.util.Scanner;

import static com.pluralsight.workbook2.MainScreen.runningMainScreenLogic;

public class Main {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        runningMainScreenLogic(scanner);
        scanner.close();
    }
}