package com.pluralsight.codewarrior;

public class FizzBuzzCuckooClock {
    public static String fizzBuzzCuckooClock(String time) {
        String[] parts = time.split(":");
        int hour = Integer.parseInt(parts[0]);
        int minute = Integer.parseInt(parts[1]);

        if (minute == 0) {
            int hour12 = hour % 12;
            if (hour12 == 0) hour12 = 12;
            return "Cuckoo ".repeat(hour12).trim();
        } else if (minute == 30) {
            return "Cuckoo";
        } else if (minute % 15 == 0) {
            return "Fizz Buzz";
        } else if (minute % 3 == 0) {
            return "Fizz";
        } else if (minute % 5 == 0) {
            return "Buzz";
        } else {
            return "tick";
        }
    }
}
