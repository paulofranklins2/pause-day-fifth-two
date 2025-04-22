package com.pluralsight.secondworkbook.sentenceanalysis;

import java.util.Scanner;

public class StringAnalyzer {
    private String sentence;

    public void run(Scanner scanner) {
        System.out.print("Enter a sentence: ");
        sentence = scanner.nextLine();

        displayAnalysis();
    }

    private void displayAnalysis() {
        System.out.println("\nSentence Analysis:");
        System.out.printf("Sentence: %s%n", sentence);
        System.out.printf("Total characters: %d%n", getLength());
        System.out.printf("Characters (no spaces): %d%n", getLengthWithoutSpaces());
        System.out.printf("Word count: %d%n", getWordCount());
        System.out.printf("First & last character: %s%n \n", getFirstAndLastChars());
    }

    private int getLength() {
        return sentence.length();
    }

    private int getLengthWithoutSpaces() {
        int count = 0;
        for (char c : sentence.toCharArray()) {
            if (!Character.isWhitespace(c)) {
                count++;
            }
        }
        return count;
    }

    private int getWordCount() {
        return sentence.split("\\s+").length;
    }

    private String getFirstAndLastChars() {
        if (sentence.isEmpty()) return "N/A";
        String upper = sentence.toUpperCase();
        char first = upper.charAt(0);
        char last = upper.charAt(upper.length() - 1);
        return first + " & " + last;
    }
}
