package com.problemsolving.array;

import java.util.HashMap;
import java.util.Map;

public class FindDuplicateCharInString {
    public static void main(String[] args) {
        String str = "geeksforgeeks";
        String duplicates = findDuplicates(str);
        System.out.println(" Duplicates are: "+duplicates);
    }

    private static String findDuplicates(String str) {
        Map<Character,Integer> hMap = new HashMap<>();
        char arr[] = str.toCharArray();
        String duplicates = "";

        for (int i = 0; i < arr.length; i++) {
            if (hMap.containsKey(arr[i])) {
                hMap.put(arr[i], hMap.get(arr[i]) + 1);
                duplicates = duplicates + arr[i];
            } else {
                hMap.put(arr[i], 1);
            }
        }
        return duplicates;
    }
}
