package com.pluralsight.codewarrior;

public class Sum {

    public static int arrayPlusArray(int[] arr1, int[] arr2) {
        var result = 0;
        for (int j : arr1) {
            result += j;
        }
        for (int j : arr2) {
            result += j;
        }
        return result;
    }

}
