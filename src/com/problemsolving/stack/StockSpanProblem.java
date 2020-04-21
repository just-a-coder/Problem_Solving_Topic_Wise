package com.problemsolving.stack;

import java.util.Arrays;
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
        Stack<Integer> st = new Stack<>();
        // As we know for the first element, result will be always 1
        st.push(0);
        span[0] = 1;
        // Calculating From 1 to <n
        for (int i = 1; i < n; i++) {
            while (!st.isEmpty() && price[st.peek()] <= price[i]) {
                st.pop(); // Until we find greater element on left let's delete everything
            }
            // Now when we are out of Loop, either Stack is Empty or we got something greater
            if (st.isEmpty()) {
                span[i] = i + 1; // Nothing is there in stack, so as it is 0based indexing, add 1 with to get total value
            } else {
                span[i] = i-st.peek(); // We got greater element, so total value will be end-start
            }
            st.push(i); // push latest index in Stack for later comparison.
        }
        return span;
    }

    public static void main(String[] args) {
        int arr[] = new int[]{100,80,60,70,60,75,85};
        System.out.println(Arrays.toString(findSmallerOrEqualStocksOnPreviousDay(arr)));
    }
}
