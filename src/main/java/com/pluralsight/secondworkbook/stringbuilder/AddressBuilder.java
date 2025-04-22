package com.pluralsight.secondworkbook.stringbuilder;


import java.util.Scanner;

public class AddressBuilder {

    public void run(Scanner scanner) {
        StringBuilder stringbuilder = new StringBuilder();
        System.out.println("Please provide the following information");

        stringbuilder.append(inputStringForAddress(scanner, "Full Name: ")).append("\n");

        addressToStringBuilder(stringbuilder, "Billing", scanner);
        System.out.println();
        addressToStringBuilder(stringbuilder, "Shipping", scanner);

        System.out.println();
        System.out.println(stringbuilder.toString());
    }

    private void addressToStringBuilder(StringBuilder stringbuilder, String typeOfAddress, Scanner scanner) {
        stringbuilder.append(typeOfAddress).append("\n");
        stringbuilder
                .append(inputStringForAddress(scanner, "Street: ")).append("\n")
                .append(inputStringForAddress(scanner, "City: ")).append("\n")
                .append(inputStringForAddress(scanner, "State: ")).append("\n")
                .append(inputStringForAddress(scanner, "Zip: ")).append("\n").append("\n");
    }

    private String inputStringForAddress(Scanner scanner, String message) {
        System.out.print(message);
        return message + scanner.nextLine();
    }

}
