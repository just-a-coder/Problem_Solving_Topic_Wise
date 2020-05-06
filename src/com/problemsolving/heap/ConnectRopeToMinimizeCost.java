package com.problemsolving.heap;

import java.util.PriorityQueue;

/**
 * There are given n ropes of different lengths, we need to connect these ropes into one rope.
 * The cost to connect two ropes is equal to sum of their lengths. We need to connect the ropes with minimum cost.
 * For example if we are given 4 ropes of lengths 4, 3, 2 and 6. We can connect the ropes in following ways.
 * 1) First connect ropes of lengths 2 and 3. Now we have three ropes of lengths 4, 6 and 5.
 * 2) Now connect ropes of lengths 4 and 5. Now we have two ropes of lengths 6 and 9.
 * 3) Finally connect the two ropes and all ropes have connected.
 * <p>
 * Total cost for connecting all ropes is 5 + 9 + 15 = 29.
 */
public class ConnectRopeToMinimizeCost {

    private static int connectRopesFindCost(int[] length) {
        int sum = 0, ropesum = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int i = 0; i < length.length; i++) {
            pq.add(length[i]);
        }
        
        while (!pq.isEmpty()) {
            sum = pq.poll() + pq.poll();
            ropesum += sum;

            if (pq.isEmpty()) {
                return ropesum;
            } else {
                pq.add(sum);
            }
        }
        return ropesum;
    }

    public static void main(String[] args) {
        int arr[] = new int[]{4, 3, 2, 6};
        System.out.println(connectRopesFindCost(arr));
    }
}
