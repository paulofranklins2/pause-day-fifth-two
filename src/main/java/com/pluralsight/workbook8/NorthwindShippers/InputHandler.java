package com.pluralsight.workbook8.NorthwindShippers;

import java.util.Scanner;

public class InputHandler {
    private static final Scanner scanner = new Scanner(System.in);

    public static String input(String message) {
        System.out.println(message);
        return scanner.nextLine();
    }
}
