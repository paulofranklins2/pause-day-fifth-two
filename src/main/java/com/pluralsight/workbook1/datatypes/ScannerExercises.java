package com.pluralsight.workbook1.datatypes;

import java.util.Scanner;

public class ScannerExercises {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the First Number: ");
        double firstNumber = sc.nextDouble();
        System.out.print("Enter the Second Number: ");
        double secondNumber = sc.nextDouble();
        sc.nextLine();

        System.out.println("Possible calculations:");
        System.out.println("(A)dd");
        System.out.println("(S)ubtract");
        System.out.println("(M)ultiply");
        System.out.println("(D)ivide");

        System.out.print("Please select an option: ");
        sc.next();

        double result = (firstNumber * secondNumber);
        System.out.println("The result is: " + result);
    }
}
