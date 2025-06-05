package com.pluralsight.workbook6.streamExercise;

@FunctionalInterface
public interface StringRepeater {
    String repeater(String string, int amount);

    public static void main(String[] args) {
        StringRepeater repeater = (s, a) -> new String(new char[a]).replace("\0", s);
        System.out.println(repeater.repeater("Paulo", 5));
    }
}
