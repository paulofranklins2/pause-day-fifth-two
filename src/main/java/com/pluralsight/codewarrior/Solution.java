package com.pluralsight.codewarrior;

class Solution {
    public static int areaOrPerimeter(int l, int w) {
        if (l == w) {
            return l * w;
        } else {
            return 2 * (l + w);
        }
    }
}