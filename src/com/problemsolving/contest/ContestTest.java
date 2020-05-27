/*
package com.problemsolving.contest;

import com.problemsolving.heap.FrequencySort;

import java.util.*;

public class ContestTest {
    int count = 0;
    public int pseudoPalindromicPaths (TreeNode root) {

    }

    static boolean isPalindrome(String str) {
        List<Character> alist = new ArrayList<>();
        for (char ch: str.toCharArray()){
            if (alist.contains(ch)) {
                alist.remove(ch);
            } else {
                alist.add(ch);
            }
        }

        if ((alist.size() % 2 == 0 && alist.size() == 0) || (alist.size() % 2 == 1 && alist.size() <= 1)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        String word= "leetcode";
        System.out.println(maxVowels(word,3));
    }
}*/
