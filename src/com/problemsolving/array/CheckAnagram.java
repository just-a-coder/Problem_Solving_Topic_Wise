package com.problemsolving.array;

import java.util.Arrays;

public class CheckAnagram {
    public static void main(String[] args) {
        System.out.println(" Check Anagrams .....");
        String st1 = "SILENT";
        String st2 = "LISTEN";
        boolean isAnagramFlag = isAnagram(st1, st2);
        System.out.println(isAnagramFlag);
    }

    private static boolean isAnagram(String st1, String st2) {
        st1 = st1.replaceAll("//s","");
        st2 = st2.replaceAll("//s","");

        if (st1.length() != st2.length()) {
            return false;
        } else {
            char arr1[] = st1.toLowerCase().toCharArray();
            char arr2[] = st2.toLowerCase().toCharArray();

            Arrays.sort(arr1);
            Arrays.sort(arr2);

            if(Arrays.equals(arr1,arr2))
                return true;
            else
                return false;
        }
    }
}
