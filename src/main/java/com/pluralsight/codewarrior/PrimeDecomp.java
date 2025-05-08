package com.pluralsight.codewarrior;

public class PrimeDecomp {
    public static String factors(int n) {
        StringBuilder result = new StringBuilder();
        for (int i = 2; i <= n; i++) {
            int count = 0;
            while (n % i == 0) {
                n /= i;
                count++;
            }
            if (count > 0) {
                result.append("(").append(i);
                if (count > 1) {
                    result.append("**").append(count);
                }
                result.append(")");
            }
        }
        return result.toString();
    }
}
