package com.pluralsight.codewarrior;

public class EightiesKids5 {
    public static String bucketOf(String said) {
        String lower = said.toLowerCase();
        boolean water = lower.contains("water") || lower.contains("wet") || lower.contains("wash");
        boolean slime = lower.contains("slime") || lower.contains("i don't know");

        if (water && slime) return "sludge";
        if (water) return "water";
        if (slime) return "slime";
        return "air";
    }
}
