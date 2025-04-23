package com.pluralsight.codewarrior;

public class FindOutlier {
    static int find(int[] integers) {
        var oddCounter = 0;
        var evenCounter = 0;
        var evenPlaceHolder = 0;
        var oddPlaceHolder = 0;

        for (int integer : integers) {
            if (integer % 2 == 0) {
                evenCounter++;
                evenPlaceHolder = integer;
            } else {
                oddCounter++;
                oddPlaceHolder = integer;
            }
        }
        if (oddCounter == 1) return oddPlaceHolder;
        else return evenPlaceHolder;
    }
}