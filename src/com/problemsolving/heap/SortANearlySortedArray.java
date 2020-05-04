package com.problemsolving.heap;

import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * Given an array of n elements, where each element is at most k away
 * from its target position, devise an algorithm that sorts in O(n log k) time.
 * For example, let us consider k is 2, an element at index 7 in the sorted array,
 * can be at indexes 5, 6, 7, 8, 9 in the given array.
 * Example:
 * Input : arr[] = {6, 5, 3, 2, 8, 10, 9}
 * k = 3
 * Output : arr[] = {2, 3, 5, 6, 8, 9, 10}
 */
public class SortANearlySortedArray {
    private static int[] sortNearlySortedArray(int[] arr, int k) {
        int resultarr[] = new int[arr.length];
        int resultcount = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < resultarr.length; i++) {
            pq.add(arr[i]);
            if (pq.size() > k) {
                resultarr[resultcount++] = pq.poll();
            }
        }

        while (!pq.isEmpty()) {
            resultarr[resultcount++] = pq.poll();
        }
        return resultarr;
    }

    public static void main(String[] args) {
        int arr[] = new int[]{6, 5, 3, 2, 8, 10, 9};
        int k = 3;
        System.out.println(Arrays.toString(sortNearlySortedArray(arr, k)));
    }
}
