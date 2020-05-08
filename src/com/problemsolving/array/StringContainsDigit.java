package com.problemsolving.array;

public class StringContainsDigit {
    public static void main(String[] args) {
       String str = "1234";
       boolean isDigit = findIsStringDigit(str);
       System.out.println(isDigit);
    }

    private static boolean findIsStringDigit(String str) {
       return str.matches("[0-9]*");
    }


}
