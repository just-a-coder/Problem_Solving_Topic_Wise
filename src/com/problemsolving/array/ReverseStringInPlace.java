package com.problemsolving.array;

public class ReverseStringInPlace {
    public static void main(String[] args) {
        String str = "ABCD";
        String newStr = revAString(str);
        System.out.println(newStr);
    }

    private static String revAString(String str) {
        if (str.length() <= 1) {
            return str;
        }
        return revAString(str.substring(1,str.length()))+str.charAt(0);
    }
}
