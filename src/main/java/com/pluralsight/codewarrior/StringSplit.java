package com.pluralsight.codewarrior;

public class StringSplit {
    public static String[] solution(String s) {
        if (s.length() % 2 != 0) {
            s += "_";
        }

        int pairCount = s.length() / 2;
        String[] result = new String[pairCount];

        for (int i = 0; i < s.length(); i += 2) {
            result[i / 2] = s.substring(i, i + 2);
        }

        return result;
    }
}