package com.pluralsight.codewarrior;

import java.util.List;

class Sorter {
    public static List<String> sort(List<String> textbooks) {
        textbooks.sort(String.CASE_INSENSITIVE_ORDER);
        return textbooks;
    }
}