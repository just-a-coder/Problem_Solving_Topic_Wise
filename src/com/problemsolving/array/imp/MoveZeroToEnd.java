package com.problemsolving.array.imp;

import java.util.Arrays;


public class MoveZeroToEnd {
    public static void main(String[] args) {
        int arr[] = new int[]{1, 8, 3, 0, 2, 0, 1, 10, 13, 0};
        int resultarr[] = moveZeroAtTheEnd(arr);
        System.out.println(Arrays.toString(resultarr));

    }


    private static int[] moveZeroAtTheEnd(int[] arr) {
        int j = 0;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                swap(arr, i, j);
                j++;
            }
        }
        return arr;
    }

    private static int[] swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        return arr;
    }

}
