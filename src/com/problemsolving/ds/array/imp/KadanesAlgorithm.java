package com.problemsolving.ds.array.imp;

public class KadanesAlgorithm {
    public static void main(String[] args) {
        int arr[] = new int[]{1, 2, 3, -2, 5};
        int result = findSubArrayOfMaxSum(arr);
        System.out.println(result);
    }

    private static int findSubArrayOfMaxSum(int[] arr) {
        int n = arr.length;
        int lowsum = 0;
        int maxsum = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            lowsum = Math.max(arr[i], lowsum+arr[i]);
            maxsum = Math.max(lowsum,maxsum);
        }
        return maxsum;
    }
}
