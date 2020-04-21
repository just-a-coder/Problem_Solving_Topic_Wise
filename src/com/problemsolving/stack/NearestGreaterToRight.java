package com.problemsolving.stack;

import java.util.Arrays;
import java.util.Stack;

/**
 * arr[] = [1,3,2,4] o/p [3,4,4,-1]
 * One Array is given for each element find next greater element
 * from the right side of the array. If greater element is not there add -1.
 */
public class NearestGreaterToRight {
    private static int[] findRightGreaterElementArray(int[] arr) {
        int n = arr.length;
        if (n == 0) return arr;
        int resarr[] = new int[n];
        Stack<Integer> st = new Stack<>();
        for (int i = n - 1; i >= 0; i--) {
            if (st.isEmpty()) {
                resarr[i] = -1;
            } else if (st.peek() > arr[i]) {
                resarr[i] = st.peek();
            } else if (st.peek() <= arr[i]) {
                while (!st.isEmpty() && st.peek() <= arr[i]) {
                    st.pop();
                }

                if(st.isEmpty()) resarr[i] = -1;
                else resarr[i] = st.peek();
            }
            st.push(arr[i]);
        }
        return resarr;
    }

    public static void main(String[] args) {
        int arr[] = new int[]{1, 3, 2, 4};
        System.out.println(Arrays.toString(findRightGreaterElementArray(arr)));
    }
}
