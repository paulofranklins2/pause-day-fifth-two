package com.pluralsight.workbook8.sakilamovies.util;

import java.util.Scanner;

public class InputHelper {
    private static final Scanner scanner = new Scanner(System.in);

    public static String stringInput(String message) {
        System.out.print(message);
        return scanner.nextLine();
    }
}
