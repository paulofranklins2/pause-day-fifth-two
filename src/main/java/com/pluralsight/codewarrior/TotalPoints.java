package com.pluralsight.codewarrior;

public class TotalPoints {
    public static void main(String[] args) {
        int points = points(new String[]{"1:0", "2:0", "3:0", "4:0", "2:1", "3:1", "4:1", "3:2", "4:2", "4:3"});
        System.out.println(points);
    }

    public static int points(String[] games) {
        int result = 0;
        for (int i = 0; i < games.length; i++) {
            var z = games[i].split(":");
            var scoreA = Integer.parseInt(z[0]);
            var scoreB = Integer.parseInt(z[1]);

            System.out.println(scoreA + " " + scoreB);
            if (scoreA > scoreB) {
                result += 3;
            } else if (scoreA == scoreB) {
                result += 1;
            }
        }
        return result;
    }
}