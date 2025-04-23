package com.pluralsight.codewarrior;

public class Counter {
    public static void main(String[] args) {
        System.out.println(countSheeps(new Boolean[]{
                true, true, true, false, true, true, true, null, true, true, false, true, false,
                true, false, false, true, true, true, true, true, false, false, true, true}
        ));
    }

    public static int countSheeps(Boolean[] arrayOfSheeps) {
        var counter = 0;
        for (int i = 0; i < arrayOfSheeps.length; i++) {
            if (arrayOfSheeps[i] != null && arrayOfSheeps[i]) {
                counter++;
            }
        }
        return counter;
    }
}