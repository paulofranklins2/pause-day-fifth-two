package com.pluralsight.secondworkbook.fullnameparser;

public class FullNameParser {
    static String firstName;
    static String middleName;
    static String lastName;

    public static void fullNameParser(String fullName){
        var split = fullName.split(" ");
        if(split.length == 2){
            firstName = split[0];
            lastName = split[1];
            middleName = "(none)";
        }
        if(split.length == 3){
            firstName = split[0];
            middleName = split[1];
            lastName = split[2];
        }
    }

    public static void main(String[] args) {
        fullNameParser("Hello Cunha");
        System.out.println("First name: " + firstName);
        System.out.println("Middle name: " + middleName);
        System.out.println("Last name: " + lastName);
    }
}
