package com.problemsolving.array;

import java.util.HashSet;

public class LongestSubstring {
    public static void main(String[] args) {
        String str = "geeksforgeeks";
        int max = findMaxLengthOfSubstring(str);
        System.out.println(" MAX: "+max);
    }

    public static int findMaxLengthOfSubstring(String str) {
        char arr[] = str.toCharArray();
        int MAX = 0;
        HashSet<Character> hSet = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (hSet.contains(arr[j])) {
                    break;
                } else {
                    hSet.add(arr[j]);
                }
            }
            if (hSet.size() > MAX) {
                MAX = hSet.size();
            }
            hSet.clear();
        }
        return MAX;
    }
}
