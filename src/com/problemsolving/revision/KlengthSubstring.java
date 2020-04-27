package com.problemsolving.revision;

public class KlengthSubstring {
    public static int numKLenSubstrNoRepeats(String str, int k) {
        int len = str.length();
        int count = 0, start = 0;
        int arr[] = new int[128];
        boolean flag = false;
        for (int i = 0; i < len; i++) {
            if (arr[str.charAt(i)]++ > 0) {
                flag = true;
            }
            while (flag) {
                if (--arr[str.charAt(start++)] > 0) {
                    flag = false;
                }
            }
            if (i - start + 1 == k) {
                count++;
                --arr[str.charAt(start++)];
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String s = "bcaad";
        int k = 3;
        System.out.println(numKLenSubstrNoRepeats(s, k));
    }
}
