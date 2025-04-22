package com.pluralsight.secondweek;

import java.util.Scanner;

import static com.pluralsight.secondweek.MainScreen.runningMainScreenLogic;

public class Main {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        runningMainScreenLogic(scanner);
        scanner.close();
    }
}