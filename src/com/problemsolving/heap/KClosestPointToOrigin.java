package com.problemsolving.heap;

import java.util.*;

/**
 * Given a list of points on the 2-D plane and an integer K. The task is to find K closest points to the origin and print them.
 * Note: The distance between two points on a plane is the Euclidean distance.
 * Example:
 * Input : point = [[3, 3], [5, -1], [-2, 4]], K = 2
 * Distance between(x1,y1) and (x2,y2) is sqrt of[ (x1-x2)^2 + (y1-y2)^2]
 * Now for origin (0,0) it becomes sqrt of [x1^2 + y1^2]
 * If we remove the sqrt opearation we will get relative value of the equation, which will be applicable
 * for all the points, so ultimately we can check which points are near/far.
 */
public class KClosestPointToOrigin {
    public static int[][] findKClosestPointToOrigin(int mat[][], int k) {
        Map<Integer, Integer> hmap = new HashMap<>();
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                int value = (int) (Math.pow(mat[i][0], 2) + Math.pow(mat[i][1], 2));
                hmap.put(i, value);
            }
        }

        PriorityQueue<Pair> pq = new PriorityQueue<>(new Pair());
        for (int num : hmap.keySet()) {
            Pair pr = new Pair(hmap.get(num), num);
            pq.add(pr);
            if (pq.size() > k) {
                pq.poll();
            }
        }

        int resarr[][] = new int[k][2];
        int i = 0;
        while (!pq.isEmpty()) {
            Pair pr = pq.poll();
            resarr[i++] = mat[pr.elem];
        }
        return resarr;
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
            } else
                return p2.freq - p1.freq;
        }
    }

    public static void main(String[] args) {
        int mat[][] = new int[][]{{1,3}, {-2,2}, {5,8},{0,1}};
        int k = 2;
        int resarr[][] = findKClosestPointToOrigin(mat, k);
        for (int[] row : resarr) {
            // converting each row as string
            // and then printing in a separate line
            System.out.println(Arrays.toString(row));
        }
    }
}
