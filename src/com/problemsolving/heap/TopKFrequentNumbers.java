package com.problemsolving.heap;

import java.util.*;

public class TopKFrequentNumbers {

    private static int[] findTopKFrequentNumbers(int[] arr, int k) {
        int res[] = new int[k];
        Map<Integer, Integer> hmap = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            hmap.put(arr[i], hmap.getOrDefault(arr[i], 0) + 1);
        }
        PriorityQueue<Pair> pq = new PriorityQueue<>(new Pair());
        for (int num : hmap.keySet()) {
            Pair pr = new Pair(hmap.get(num),num);
            pq.add(pr);
            if (pq.size() > k) {
                pq.poll();
            }
        }

        int i =0;
        while (!pq.isEmpty()) {
            res[i++] = pq.poll().elem;
        }
        return res;
    }

    static class Pair implements Comparator<Pair> {
        int freq;
        int elem;

        public Pair() {

        }

        public Pair(int freq, int elem) {
            this.freq = freq;
            this.elem = elem;
        }

        @Override
        public int compare(Pair p1, Pair p2) {
            return p1.freq - p2.freq;
        }

    }

    public static void main(String[] args) {
        int arr[] = new int[]{3, 3, 2, 4, 2, 5, 3, 2, 6, 6};
        int k = 3;
        System.out.println(Arrays.toString(findTopKFrequentNumbers(arr, k)));
    }
}
