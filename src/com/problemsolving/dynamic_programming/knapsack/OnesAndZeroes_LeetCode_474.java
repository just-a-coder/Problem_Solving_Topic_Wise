package com.problemsolving.dynamic_programming.knapsack;

/**
 * Given an array, strs, with strings consisting of only 0s and 1s. Also two integers m and n.
 *
 * Now your task is to find the maximum number of strings that you can form with given m 0s and n 1s.
 * Each 0 and 1 can be used at most once.
 * Example:
 * Input: strs = ["10","0001","111001","1","0"], m = 5, n = 3
 * Output: 4
 * Explanation: This are totally 4 strings can be formed by the using of 5 0s and 3 1s,
 * which are "10","0001","1","0".
 */
public class OnesAndZeroes_LeetCode_474 {
    public int findMaxForm(String[] strs, int m, int n) {
        int dp[][] = new int[m+1][n+1];

        for(String str: strs){
            int count[] = calculateCount(str);
            int zeroes = count[0];
            int ones = count[1];
            /**
             * Clarification Required why it's starting from backwards
             */
            for(int i = m; i >= zeroes; i--){
                for(int j = n; j >= ones; j--){
                    dp[i][j] = Math.max(dp[i][j], dp[i-zeroes][j-ones]+1);
                }
            }
        }
        return dp[m][n];
    }

    private int[] calculateCount(String str){
        int arr[] = new int[2];
        for(char ch: str.toCharArray()){
            if(ch == '0'){
                arr[0]++;
            }else{
                arr[1]++;
            }
        }
        return arr;
    }
}
