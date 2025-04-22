package com.pluralsight.secondweek.stringexercises;

import java.time.LocalDate;

public class StringMiniExercises {
    static String name;

    static void printName(String name) {
        System.out.println(name);
    }

    static int getNameLength() {
        return name.length();
    }

    static String firstAndLastCharacter(String word) {
        return word.charAt(0) + " " + word.charAt(word.length() - 1);
    }

    static String returnToLowerToUpper(String word) {
        return "lowercase: " + word.toLowerCase() + "\nuppercase: " + word.toUpperCase();
    }

    static boolean containsJava(String sentence) {
        return sentence.toLowerCase().contains("java");
    }

    static boolean areTheyEquals(String word1, String word2) {
        return word1.equals(word2);
    }

    public static boolean startAndMatch(String word) {
        return word.toLowerCase().startsWith("a") && word.toLowerCase().endsWith("z");
    }

    public static int compareWords(String word1, String word2) {
        return word1.compareTo(word2);
    }

    public static int countVowels(String word) {
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        var counter = 0;
        for (int i = 0; i < word.length(); i++) {
            for (char vowel : vowels) {
                if (word.toLowerCase().charAt(i) == vowel) {
                    counter++;
                }
            }
        }
        return counter;
    }

    public static String reverseString(String word) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = word.length() - 1; i >= 0; i--) {
            stringBuilder.append(word.charAt(i));
        }
        return stringBuilder.toString();
    }

    public static int paseToInt(String input) {
        try {
            return Integer.parseInt(input) * 2;
        } catch (NumberFormatException e) {
            System.out.println("Invalid Input");
            return -1;
        }
    }

    public static int getTodayDate() {
        return LocalDate.now().getDayOfMonth();
    }

    public static void main(String[] args) {
        var hello = paseToInt("a");
        System.out.println(hello);
    }

}
