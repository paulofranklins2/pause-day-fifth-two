package com.pluralsight.calculator;

import java.util.Scanner;

import static com.pluralsight.reusable.ReusableCode.inputForDouble;
import static com.pluralsight.reusable.ReusableCode.inputForInt;

public class TipCalculator {
    private double billAmount;
    private double tipPercentage;
    private int numberOfPeople;
    private double totalWithTip;
    private double amountPerPerson;

    public void run(Scanner scanner) {
        System.out.println("Tip Calculator");

        billAmount = inputForDouble(scanner, "Enter the bill amount: ");
        tipPercentage = inputForDouble(scanner, "Enter the tip percentage (0 if none): ");
        numberOfPeople = inputForInt(scanner, "Number of people: ");

        calculateTotalWithTip();
        calculatePerPersonAmount();

        displaySummary();
        shameLowTip();
    }

    private void calculateTotalWithTip() {
        double tip = billAmount * tipPercentage / 100;
        totalWithTip = billAmount + tip;
    }

    private void calculatePerPersonAmount() {
        amountPerPerson = totalWithTip / numberOfPeople;
    }

    private void displaySummary() {
        System.out.printf("\nBill before tip: $%.2f%n", billAmount);
        System.out.printf("Tip amount: $%.2f%n", totalWithTip - billAmount);
        System.out.printf("Total with tip: $%.2f%n", totalWithTip);

        if (numberOfPeople > 1) {
            System.out.printf("Each person pays: $%.2f%n", amountPerPerson);
        }
    }

    private void shameLowTip() {
        if (tipPercentage > 0 && tipPercentage < 10) {
            System.out.println("\uD83D\uDE05 Cheapskate Alert! \uD83D\uDE05");
        }
    }

}
