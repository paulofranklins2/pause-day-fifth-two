package com.pluralsight.workbook2.reusable;

import java.util.Scanner;

public class ReusableCode {
    public static char inputForChar(Scanner scanner, String message) {
        System.out.print(message);
        return scanner.nextLine().charAt(0);
    }

    public static double inputForDouble(Scanner scanner, String message) {
        System.out.print(message);
        return scanner.nextDouble();
    }

    public static int inputForInt(Scanner scanner, String message) {
        System.out.print(message);
        return scanner.nextInt();
    }

    public static String inputForDate(Scanner scanner, String message) {
        System.out.print(message);
        return scanner.nextLine().trim();
    }

    public static String inputForString(Scanner scanner, String message) {
        System.out.print(message);
        return scanner.nextLine();
    }
}
