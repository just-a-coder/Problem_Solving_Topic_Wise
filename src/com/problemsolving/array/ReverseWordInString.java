package com.problemsolving.array;

import java.util.Arrays;

public class ReverseWordInString {
    public static void main(String[] args) {
        String str = "i.like.this";
        System.out.println(" Reverse Word Result: "+reverseWordOperation(str));
    }

    public static String reverseWordOperation(String str) {
        String strray[] = str.split("\\.");
        String finalStr="";

        for (String word : Arrays.asList(strray)) {
            if (finalStr.isEmpty()) {
                finalStr = reverseStrngRec(word);
            } else {
                finalStr = finalStr+"."+reverseStrngRec(word);
            }
        }
        return finalStr;
    }

    private static String reverseStrngRec(String str) {
        if(str.length()<2)
            return str;
        else
            return str.charAt(str.length()-1)+reverseStrngRec(str.substring(0,str.length()-1));
    }
}
