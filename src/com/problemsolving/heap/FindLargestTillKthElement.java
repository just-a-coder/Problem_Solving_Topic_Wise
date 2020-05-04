package com.problemsolving.heap;

import java.util.Arrays;
import java.util.PriorityQueue;

public class FindLargestTillKthElement {

    public static int[] findLargestTillKthElement(int arr[], int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int resultarr[] = new int[k];
        for (int i = 0; i < arr.length; i++) {
            pq.add(arr[i]);
            if (pq.size() > k) {
                pq.poll();
            }
        }
        int i = 0;
        while (!pq.isEmpty()) {
            resultarr[i++] = pq.poll();
        }
        return resultarr;
    }

    public static void main(String[] args) {
        int arr[] = new int[]{3, 7, 5, 6, 4, 8};
        int k = 3;
        System.out.println(Arrays.toString(findLargestTillKthElement(arr, k)));
    }
}
