package com.problemsolving.stack;

import java.util.Stack;

/**
 * Given Some Heights of Building in an Array.
 * Find Max Area of rectangular shape
 * arr[] = [6,2,5,4,5,1,6]
 * O/P: 12(4*3)
 */
public class HistogramAreaProblem {
    public static int findMaxHistogramArea(int arr[]) {
        int maxarea = 0, area = 0;
        int n = arr.length, i=0;
        Stack<Integer> st = new Stack<>();
        while (i < n) {
            if (st.isEmpty() || arr[st.peek()] <= arr[i]) {
                st.push(i++);
            } else {
                int top = st.peek();
                st.pop();

                if (st.isEmpty()) {
                    area = arr[top] * i;
                } else {
                    area = arr[top] * (i-st.peek()-1);
                }
                maxarea = Math.max(maxarea, area);
            }

        }

        while (!st.isEmpty()) {
            int top = st.peek();
            st.pop();

            if (st.isEmpty()) {
                area = arr[top] * i;
            } else {
                area = arr[top] * (i-st.peek()-1);
            }
            maxarea = Math.max(maxarea, area);
        }
        return maxarea;
    }


    public static void main(String[] args) {
        int arr[] = new int[]{6,2,5,4,5,1,6};
        System.out.println(findMaxHistogramArea(arr));
    }
}
