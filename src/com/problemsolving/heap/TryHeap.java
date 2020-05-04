package com.problemsolving.heap;

import java.util.Collections;
import java.util.Iterator;
import java.util.PriorityQueue;

public class TryHeap {
    public static void minHeapOperation() {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(5);
        System.out.println(pq.peek());
        pq.add(2);
        System.out.println(pq.peek());
        pq.add(10);
        System.out.println(pq.peek());
        pq.add(4);
        System.out.println(pq.peek());

        Iterator it = pq.iterator();
        while (it.hasNext()) {
            System.out.print(it.next()+ " ");
        }
    }
    public static void maxHeapOperation() {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        pq.add(5);
        System.out.println(pq.peek());
        pq.add(2);
        System.out.println(pq.peek());
        pq.add(10);
        System.out.println(pq.peek());
        pq.add(4);
        System.out.println(pq.peek());
    }


    public static void main(String[] args) {
        maxHeapOperation();
    }
}
