package com.problemsolving.ds.array.imp;

import java.util.Arrays;
import java.util.Collections;

public class MinAbsDifferenceInArray {
    public static void main(String[] args) {
        int arr[] = new int[]{4,2,1,3};
        System.out.println(findMinAbsDifference(arr, arr.length));
    }

    private static int findMinAbsDifference(int[] arr, int n) {
        Arrays.sort(arr);
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n - 1; i++) {
            int absval = Math.abs(arr[i] - arr[i + 1]);
            if (min > absval) {
                min = absval;
            }
        }
        return min;
    }
}
