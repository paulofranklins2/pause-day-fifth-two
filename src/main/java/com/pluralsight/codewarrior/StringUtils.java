package com.pluralsight.codewarrior;

import java.util.regex.Pattern;

public class StringUtils {

    public static boolean isVowel(String s) {
        var regex = "[aeiouAEIOU]";
        return  Pattern.compile(regex).matcher(s).matches();
    }
}