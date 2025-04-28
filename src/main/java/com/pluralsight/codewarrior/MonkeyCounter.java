package com.pluralsight.codewarrior;

public class MonkeyCounter {
    public static int[] monkeyCount(final int n) {
        var result = new int[n];
        for (int i = 0; i < n; i++) {
            result[i] = i + 1;
        }
        return result;
    }
}