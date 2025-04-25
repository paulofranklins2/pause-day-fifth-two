package com.pluralsight.codewarrior;

import java.util.regex.Pattern;

public class SecureTester {
    public static void main(String[] args) {
        System.out.println(alphanumeric("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789"));
    }

    public static boolean alphanumeric(String s) {
        var regex = "^[a-zA-Z0-9]+$";
        var matcher = Pattern.compile(regex).matcher(s);
        return matcher.matches();
    }

}