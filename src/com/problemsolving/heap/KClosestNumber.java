package com.problemsolving.heap;

import java.util.*;

/**
 * Given an unsorted array and two numbers x and k, find k closest values to x.
 */
public class KClosestNumber {

    private static int[] findKClosestValues(int[] arr, int x, int k) {
        int res[] = new int[k];
        PriorityQueue<Pair> pq = new PriorityQueue<>(new Pair());
        for (int i = 0; i < arr.length; i++) {
            int abs = Math.abs(arr[i] - x);
            Pair pr = new Pair(abs, arr[i]);
            pq.add(pr);
            if (pq.size() > k) {
                pq.poll();
            }
        }
        int i= 0;
        while (!pq.isEmpty()) {
            res[i++] = pq.poll().element;
        }
        return res;
    }

    static class Pair implements Comparator<Pair> {
        int freq;
        int element;

        public Pair() {
        }

        public Pair(int freq, int element) {
            this.freq = freq;
            this.element = element;
        }

        @Override
        public int compare(Pair p1, Pair p2) {
            return p2.freq - p1.freq;
        }
    }


    public static void main(String[] args) {
        int arr[] = new int[]{10, 2, 14, 4, 7, 6};
        int x = 5, k = 3;
        System.out.println(Arrays.toString(findKClosestValues(arr, x, k)));
    }

}


