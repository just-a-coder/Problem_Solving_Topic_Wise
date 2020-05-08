package com.problemsolving.array;

import java.util.Arrays;

public class SortArrayOfZeroOneTwo {
    public static void main(String[] args) {
        int arr[] = new int[]{1, 2, 1, 0};
        int resultarr[] = sortArray(arr, arr.length);
        System.out.println(Arrays.toString(resultarr));
    }

    private static int[] sortArray(int[] arr, int n) {
        int low = 0, mid = 0, high = n - 1;
        while (mid < n - 1) {
            if (arr[mid] == 0) {
                arr = swap(arr, mid, low);
                low++;
                mid++;
            } else if (arr[mid] == 1) {
                mid++;
            } else if (arr[mid] == 2) {
                arr = swap(arr, mid, high);
                high--;
            }
        }
        return arr;
    }

    private static int[] swap(int[] arr, int mid, int other) {
        int temp = arr[mid];
        arr[mid] = arr[other];
        arr[other] = temp;
        return arr;
    }
}
