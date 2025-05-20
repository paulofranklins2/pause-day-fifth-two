package com.pluralsight.workbook2.fullnamegenerator;

import java.util.Scanner;

public class FullNameApplication {
    static String fullName;
    static String firstName;
    static String lastName;
    static String middleName;
    static String suffix;

    public static String fullName(String firstName, String lastName, String middleName, String suffixName) {
        StringBuilder stringBuilder = new StringBuilder();
        if (!firstName.isBlank()) {
            stringBuilder.append(firstName);
        }
        if (!middleName.isBlank()) {
            stringBuilder.append(" ").append(middleName);
        }
        if (!lastName.isBlank()) {
            stringBuilder.append(" ").append(lastName);
        }
        if (!suffixName.isBlank()) {
            stringBuilder.append(", ").append(suffixName);
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first name: ");
        firstName = scanner.nextLine();
        System.out.print("Enter middle name: ");
        middleName = scanner.nextLine();
        System.out.print("Enter last name: ");
        lastName = scanner.nextLine();
        System.out.print("Enter suffix: ");
        suffix = scanner.nextLine();

        fullName = fullName(firstName, lastName, middleName, suffix);
        System.out.println(fullName);

    }
}