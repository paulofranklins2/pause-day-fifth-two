package com.pluralsight.codewarrior;

public class Sequence{
    public static void main(String[] args) {
        var x = reverse(30);
        for (int i = 0; i < x.length; i++) {
            System.out.println(x[i]);
        }
    }
    public static int[] reverse(int n){
        var arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = n--;
        }
        return arr;
    }

}