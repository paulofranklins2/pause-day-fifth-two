package com.pluralsight.codewarrior;

import java.util.ArrayList;
import java.util.List;

public class Kata {

    public static void main(String[] args) {
        System.out.println(feast("x", "x"));
        System.out.println(countingSheep(10));
        System.out.println(quarterOf(8));
        String phoneNumber = createPhoneNumber(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0});
        System.out.println(phoneNumber);
    }

    public static boolean feast(String beast, String dish) {
        var a = beast.charAt(0);
        var c = dish.charAt(0);
        var b = ' ';
        var d = ' ';

        if (beast.length() > 1) {
            b = beast.charAt(beast.length() - 1);
        }
        if (dish.length() > 1) {
            d = dish.charAt(dish.length() - 1);
        }

        return a == c && b == d;
    }

    public static String countingSheep(int num) {
        var sb = new StringBuilder();
        for (var i = 0; i < num; i++) {
            sb.append(i + 1).append(" ").append("sheep...");
        }
        return sb.toString();
    }

    public static int quarterOf(int month) {
        return (month - 1) / 3 + 1;
    }

    public static List<String> friend(List<String> x) {
        List<String> stringArr = new ArrayList<>();
        for (String s : x) {
            if (s.length() == 4) {
                stringArr.add(s);
            }
        }
        return stringArr;
    }

    public static String createPhoneNumber(int[] numbers) {
        var sb = new StringBuilder();
        for (int i = 0; i < numbers.length; i++) {
            if (i == 0) {
                sb.append("(").append(numbers[i]);
            } else if (i == 3) {
                sb.append(") ").append(numbers[i]);
            } else if (i == 6) {
                sb.append("-").append(numbers[i]);
            } else {
                sb.append(numbers[i]);
            }
        }
        return sb.toString();
    }

}

