package com.pluralsight.codewarrior;

public class RegexValidation {

    public static boolean validateTime(String time) {
        // validate 24 hours time
        return time.matches("^(?:[01]?\\d|2[0-3]):[0-5]\\d$");
    }
}