package com.problemsolving.ds.array.imp;

/**
 * Sliding Window Problem
 * Given an Array Of Integer n, Find Max sum of any contagious subarray of size k.
 */
public class MaxSumOfSubArray {
    public static void main(String[] args) {
        //int arr[] = new int[]{1, 9, -1, -2, 7, 3, -1, 2};
        int arr[] = new int[]{2, 1, 5, 1, 3, 2};
        int k = 3;
        int sum = findMaxSumOfSubArray(arr, k);
        System.out.println(sum);
    }

    private static int findMaxSumOfSubArray(int[] arr, int k) {
        int wsum = 0, msum = Integer.MIN_VALUE;
        int n = arr.length;
        int fastPtr = k;
        int slowptr = 0;
        if (k > n)
            return -1;

        for (int i = 0; i < k; i++) {
            wsum += arr[i];
        }

        for (int i = k; i < n; i++) {
            wsum += arr[i]-arr[i-k];
            msum = Math.max(wsum,msum);
        }

        return msum;
    }
}
