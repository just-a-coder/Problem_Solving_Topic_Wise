package com.problemsolving.greedy;

import java.util.PriorityQueue;

public class ConnectingPipes {
    public static int minCost(int[] pipes)
    {
        int cost = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int in: pipes){
            pq.add(in);
        }

        while(pq.size() > 1){
            int first = pq.poll();
            int second = 0;
            if(!pq.isEmpty())
                second = pq.poll();
            cost += first + second;
            pq.add(first+second);
        }
        return cost;
    }

    public static void main(String[] args) {
        int arr[] = new int[]{4,3,2,6};
        System.out.println(minCost(arr));
    }
}
