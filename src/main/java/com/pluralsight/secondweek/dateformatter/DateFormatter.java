package com.pluralsight.secondweek.dateformatter;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import static com.pluralsight.secondweek.reusable.ReusableCode.inputForInt;
import static com.pluralsight.secondweek.reusable.ReusableCode.inputForDate;

public class DateFormatter {
    private int optionInput;
    private LocalDate date;

    public void run(Scanner scanner) {
        String inputDate = inputForDate(scanner, "Enter date in YYYY-MM-DD format: ");
        outputOptions();
        optionInput = inputForInt(scanner, "Your choice: ");
        convertStringToDate(inputDate);
        displayResult();
    }

    private void convertStringToDate(String input) {
        DateTimeFormatter inputFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        this.date = LocalDate.parse(input, inputFormatter);
    }

    private void displayResult() {
        DateTimeFormatter outputFormatter;

        switch (optionInput) {
            case 1 -> outputFormatter = DateTimeFormatter.ofPattern("dd MMMM yyyy");
            case 2 -> outputFormatter = DateTimeFormatter.ofPattern("EEEE, MMM d, yyyy");
            case 3 -> outputFormatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
            default -> outputFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        }
        System.out.println(date.format(outputFormatter));
    }

    private void outputOptions() {
        System.out.println("Choose a format:");
        System.out.println("1 - dd MMMM yyyy (e.g. 17 April 2025)");
        System.out.println("2 - EEEE, MMM d, yyyy (e.g. Thursday, Apr 17, 2025)");
        System.out.println("3 - MM/dd/yyyy (e.g. 04/17/2025)");
    }
}
