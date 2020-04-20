package com.problemsolving.ds.array;

public class MergeString {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Bye";
        String result = mergeStr(str1,str2);
        System.out.println(result);
    }

    public static String mergeStr(String str1, String str2) {
        if (str1.length() < 1 && str2.length() < 1) {
            return str1;
        } else if (str1.length() < 1) {
            return str2;
        } else if (str2.length() < 1) {
            return str1;
        }else return str1.charAt(0)+""+str2.charAt(0)+mergeStr(str1.substring(1),str2.substring(1));
    }
}
