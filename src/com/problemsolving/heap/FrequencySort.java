package com.problemsolving.heap;

import java.util.*;

/**
 * Print the elements of an array in the increasing frequency if 2 numbers have
 * same frequency then print the one which came first.
 * Example:
 * Input : arr[] = {2, 5, 2, 8, 5, 6, 8, 8}
 * Output : arr[] = {8, 8, 8, 2, 2, 5, 5, 6}
 */
public class FrequencySort {
    public static int[] performFrequencySorting(int arr[]) {
        Map<Integer, Integer> hmap = new HashMap<>();
        int resultarr[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            hmap.put(arr[i], hmap.getOrDefault(arr[i], 0) + 1);
        }
        PriorityQueue<Pair> pq = new PriorityQueue<>(new Pair());
        for (int num : hmap.keySet()) {
            Pair pr = new Pair(hmap.get(num),num);
            pq.add(pr);
        }

        int i =0;
        while (!pq.isEmpty()) {
            int count = 0;
            Pair pr = pq.poll();
            while (count < pr.freq) {
                resultarr[i++] = pr.elem;
                count++;
            }
        }
        return resultarr;
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
            if (p1.freq == p2.freq) {
                return p1.elem - p2.elem;
            }else
            return p2.freq - p1.freq;
        }
    }

    public static void main(String[] args) {
        int arr[] = new int[]{2, 5, 2, 8, 5, 6, 8, 8};
        System.out.println(Arrays.toString(performFrequencySorting(arr)));
    }
}
