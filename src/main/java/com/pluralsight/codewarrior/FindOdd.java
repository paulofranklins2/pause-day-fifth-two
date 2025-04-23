package com.pluralsight.codewarrior;

public class FindOdd {
    public static void main(String[] args) {
        var ar = new int[]{20, 1, -1, 2, -2, 3, 3, 5, 5, 1, 2, 4, 20, 4, -1, -2, 5};
        findIt(ar);
    }

    public static int findIt(int[] a) {
        var counter = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (a[j] == a[i]) {
                    System.out.println(i);
                    System.out.println(counter);
                    System.out.println(counter);
                    counter++;
                }
                if (counter % 3 == 0) {
                    return a[i];
                }
                counter = 0;
            }
        }
        return 0;
    }
}