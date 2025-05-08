package com.pluralsight.codewarrior;

public class CuckooClock {
    public static String cuckooClock(String inputTime, int chimes) {
        String[] parts = inputTime.split(":");
        int hour = Integer.parseInt(parts[0]);
        int minute = Integer.parseInt(parts[1]);

        int chimeCount = 0;

        // Include chimes at the initial time
        if (minute == 0) {
            chimeCount += hour;
        } else if (minute == 15 || minute == 30 || minute == 45) {
            chimeCount++;
        }

        while (chimeCount < chimes) {
            // advance time by one minute
            minute++;
            if (minute == 60) {
                minute = 0;
                hour++;
                if (hour == 13) {
                    hour = 1;
                }
            }

            if (minute == 0) {
                chimeCount += hour;
            } else if (minute == 15 || minute == 30 || minute == 45) {
                chimeCount++;
            }
        }

        return String.format("%02d:%02d", hour, minute);
    }
}
