package com.pluralsight.codewarrior;

public class DescendingOrder {
    public static void main(String[] args) {
        int i = sortDesc(511234);
        System.out.println(i);
    }

    public static int sortDesc(final int num) {
        int iPlaceHolder = 0;
        int jPlaceHolder = 0;

        var sb = new StringBuilder().append(String.valueOf(num));
        var x = new StringBuilder();
        for (int i = 0; i < sb.length(); i++) {
            var iValue = Integer.parseInt(String.valueOf(sb.charAt(i)));

            for (int j = i; j < sb.length(); j++) {
                var jValue = Integer.parseInt(String.valueOf(sb.charAt(j)));

                if (jValue > iPlaceHolder) {
                    iPlaceHolder = jValue;
                    x.append(String.valueOf(jValue));
                }
                iPlaceHolder = 0;

            }
            System.out.println(x.toString());
        }
        return Integer.parseInt(x.toString());
    }
}