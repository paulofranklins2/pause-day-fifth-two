package com.pluralsight.codewarrior;

public class Xbonacci {
    public double[] xbonacci(double[] signature, int n) {
        double[] result = new double[n];
        int len = signature.length;

        // Fill in the initial signature elements
        for (int i = 0; i < n && i < len; i++) {
            result[i] = signature[i];
        }

        // Calculate the rest of the sequence
        for (int i = len; i < n; i++) {
            double sum = 0;
            for (int j = 1; j <= len; j++) {
                sum += result[i - j];
            }
            result[i] = sum;
        }

        return result;
    }
}
