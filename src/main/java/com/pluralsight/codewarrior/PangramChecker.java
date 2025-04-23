package com.pluralsight.codewarrior;

public class PangramChecker {
    public boolean check(String sentence){
        char[] alphabet = new char[26];

        for (int i = 0; i < 26; i++) {
            alphabet[i] = (char) ('A' + i);
            if(!sentence.toLowerCase().contains(String.valueOf(alphabet[i]).toLowerCase())){
                return false;
            }
        }
        return true;
    }
}