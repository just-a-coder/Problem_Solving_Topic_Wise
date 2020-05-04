package com.problemsolving.heap;

import java.util.Collections;
import java.util.PriorityQueue;

public class KthSmallestElementInArray {
    public static int findKthSmallestElement(int arr[], int k) {
       PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < arr.length; i++) {
            pq.add(arr[i]);
            if (pq.size() > k) {
                pq.poll();
            }
        }
        return pq.peek();
    }

    public static int findKthLargestElement(int arr[], int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < arr.length; i++) {
            pq.add(arr[i]);
            if (pq.size() > k) {
                pq.poll();
            }
        }
        return pq.peek();
    }

    public static void main(String[] args) {
        int arr[] = new int[]{3,7,5,6,4,8};
        int k = 3;
        System.out.println("Kth Smallest: "+findKthSmallestElement(arr, k));
        System.out.println("Kth largest: "+findKthLargestElement(arr, k));
    }
}
