package com.pluralsight.secondworkbook;

import java.util.Scanner;

import static com.pluralsight.secondworkbook.MainScreen.runningMainScreenLogic;

public class Main {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        runningMainScreenLogic(scanner);
        scanner.close();
    }
}