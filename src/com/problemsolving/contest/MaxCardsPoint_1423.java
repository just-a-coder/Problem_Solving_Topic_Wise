package com.problemsolving.contest;

public class MaxCardsPoint_1423 {
    public static int maxScore(int[] cardPoints, int k) {
        int maxscore = 0, n = cardPoints.length;
        int suffixsum = 0, prefixsum = 0;
        for (int i = n - 1; i > n - 1 - k; i--) {
            suffixsum += cardPoints[i];
        }
        maxscore = suffixsum;
        for (int i = 0; i < k; i++) {
            suffixsum -= cardPoints[n - k + i];
            prefixsum += cardPoints[i];
            maxscore = Math.max(maxscore, suffixsum + prefixsum);
        }

        return maxscore;
    }

    public static void main(String[] args) {
        int arr[] = new int[]{1, 2, 3, 4, 5, 6, 1};
        int k = 3;
        System.out.println(maxScore(arr, k));
    }
}
