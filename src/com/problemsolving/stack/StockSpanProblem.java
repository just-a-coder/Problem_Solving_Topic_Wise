package com.problemsolving.stack;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

/**
 *  arr[] = [100,80,60,70,60,75,85]
 *  These are price of the stocks for different days, Output will be the array
 *  where for each day you have to calculate what's the previously consecutive array element count which is
 *  equal to or less than that value. If nothing is there return 1 for that day value
 *  o/p [1,1,1,2,1,4,6]
 */
public class StockSpanProblem {
    private static int[] findSmallerOrEqualStocksOnPreviousDay(int[] price) {
        int n = price.length;
        if(n==0) return price;
        int span[] = new int[n];
        // Creating Stack using Deque reason given Below:
        Deque<Integer> stack = new LinkedList<>();
        // As we know for the first element, result will be always 1
        stack.push(0);
        span[0] = 1;
        // Calculating From 1 to <n
        for (int i = 1; i < n; i++) {
            while (!stack.isEmpty() && price[stack.peek()] <= price[i]) {
                stack.pop(); // Until we find greater element on left let's delete everything
            }
            // Now when we are out of Loop, either Stack is Empty or we got something greater
            if (stack.isEmpty()) {
                span[i] = i + 1; // Nothing is there in stack, so as it is 0based indexing, add 1 with to get total value
            } else {
                span[i] = i-stack.peek(); // We got greater element, so total value will be end-start
            }
            stack.push(i); // push latest index in Stack for later comparison.
            // Here instead of value we are storing index
        }
        return span;
    }

    public static void main(String[] args) {
        int arr[] = new int[]{100,80,60,70,60,75,85};
        System.out.println(Arrays.toString(findSmallerOrEqualStocksOnPreviousDay(arr)));
    }
}

/**
 *  We should always create Stack using Deque, either By LinkedList or ArrayDeque.
 *  First Thing Why Deque??
 *  Stack is Threadsafe as it is derived from Vector,
 *  whereas the most deque implementations are not, and thus faster if you only use it in a single thread.
 *  Stack is a class, Deque is an interface.
 *  It's always better to code for Interface rathher than implementation.
 *  Now which one to use ArrayDeque or LinkedList
 *  ArrayDeque class is likely to be faster
 *  than Stack when used as a stack, and faster than LinkedList when used as a queue.
 *  What is the Difference?
 * LinkedList in Java is basically a doubly Linked List (a very profound statement, I know…).
 * There is some extra baggage that comes along with linked list that can make it expensive:
 * using memory to hold objects and to contain ‘links’ that point to other objects,
 * related objects in non-contiguous memory (which slows down iteration), etc.
 *
 * So why is the ArrayDeque much faster? First of all, it removes the need for
 * extra memory used to create a ‘link’ that points to other objects.
 * An ArrayDeque is backed by a circular array, so all objects are ordered next to each other in the array.
 * The objects sitting contiguously in memory also helps out in cache hits as well.
 *  Final::
 *  So when you have to use Stack, Use LinkedList but when you have to Use Queue use ArrayDeque
 */
