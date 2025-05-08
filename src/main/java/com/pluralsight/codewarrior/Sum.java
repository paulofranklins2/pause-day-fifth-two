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

    public int GetSum(int a, int b) {
        int min = Math.min(a, b);
        int max = Math.max(a, b);
        int result = 0;
        System.out.println(min + " " + max);

        for (int i = min; i <= max; i++) {
            result += i;
        }
        return result;
    }

    public static void main(String[] args) {
        var s = new Sum();
        System.out.println(s.GetSum(0, -1));
    }
}

