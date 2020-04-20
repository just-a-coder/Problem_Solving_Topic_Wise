package com.problemsolving.ds.array.imp;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class RearrangeTest {
    public static void main(String[] args) {
        int arr[] = new int[]{1,2,3,4,5,6};
        int resultarr[] = rearrangeArray(arr);
        System.out.println(Arrays.toString(resultarr));
    }

    private static int[] rearrangeArray(int[] arr) {
        Queue<Integer> qu= new LinkedList<>();
        int n = arr.length;
        int j = n-1;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                qu.add(arr[i]);
                arr[i] = arr[j];
                j--;
            } else {
                if (!qu.isEmpty()) {
                    qu.add(arr[i]);
                    arr[i] = qu.poll();
                }
            }
        }
        return arr;
    }
}
