package com.pluralsight.workbook1.datatypes;

public class MathExercises {
    public static void main(String[] args) {
        // 1. Math.abs
        int num = -45;
        System.out.println("Absolute value: " + Math.abs(num)); // 45

        // 2. Math.max
        double a = 3.5;
        double b = 7.8;
        System.out.println("Max value: " + Math.max(a, b)); // 7.8

        // 3. Math.min
        int x = 99;
        int y = 23;
        System.out.println("Min value: " + Math.min(x, y)); // 23

        // 4. Math.floor
        double floorExample = 8.9;
        System.out.println("Floored value: " + Math.floor(floorExample)); // 8.0

        // 5. Math.ceil
        double ceilExample = 5.2;
        System.out.println("Ceiled value: " + Math.ceil(ceilExample)); // 6.0

        // 6. Math.round
        double roundExample = 9.6;
        System.out.println("Rounded value: " + Math.round(roundExample)); // 10

        // 7. Bonus Combo — Temperature Converter
        double morningTemp = -3.7;
        double afternoonTemp = 12.4;

        double tempDiff = Math.abs(morningTemp - afternoonTemp);
        double maxTemp = Math.max(morningTemp, afternoonTemp);
        double minTemp = Math.min(morningTemp, afternoonTemp);
        long roundedAfternoon = Math.round(afternoonTemp);
        double flooredMorning = Math.floor(morningTemp);

        System.out.println("Absolute difference: " + tempDiff);
        System.out.println("Highest temperature: " + maxTemp);
        System.out.println("Lowest temperature: " + minTemp);
        System.out.println("Rounded afternoon temperature: " + roundedAfternoon);
        System.out.println("Floored morning temperature: " + flooredMorning);

        // Bonus 1: Rounding Money Challenge
        double price = 10.876;
        double roundedPrice = Math.round(price * 100) / 100.0;
        System.out.println("Rounded price: " + roundedPrice);

        // Bonus 2: Time Challenge
        int videoSeconds = 320;
        int fullMinutes = videoSeconds / 60;
        int displayMinutes = (int)Math.ceil(videoSeconds / 60.0);
        System.out.println("Real minutes: " + fullMinutes);
        System.out.println("Show as: " + displayMinutes + " minutes");

        // Bonus 3: Rounding Down to Nearest 5 Cents
        double price2 = 3.87;
        double roundedToNearest5 = Math.floor(price2 * 20) / 20.0;
        System.out.println("Rounded to nearest 0.05: " + roundedToNearest5);

        // Bonus 4: Crazy Casting
        double castTest = 5.9;
        int result1 = (int)castTest + 3;
        int result2 = (int)(castTest + 3);
        System.out.println("Result 1: " + result1);
        System.out.println("Result 2: " + result2);

        // Bonus 5: Max-Min Battle
        int a1 = 17;
        int b1 = 42;
        int c1 = 9;
        int max = Math.max(a1, Math.max(b1, c1));
        int min = Math.min(a1, Math.min(b1, c1));
        System.out.println("Biggest: " + max);
        System.out.println("Smallest: " + min);

        // Bonus 6: Rounding Total Price Up to Whole Euro
        double total = 17.23;
        int pay = (int)Math.ceil(total);
        System.out.println("Pay: " + pay + " euros");

        // Bonus 7: Casting Overflow Trap
        int big = 150;
        byte small = (byte)big;
        System.out.println("Casting overflow: " + small);

        // Bonus 8: Big Final Boss — Mixed Math
        double start = -12.8;
        double end = 7.3;
        double distance = Math.abs(end - start);
        int roundedDistance = (int)Math.ceil(distance);
        System.out.println("Absolute distance = " + roundedDistance);
    }
}
