package com.problemsolving.misc_concept;

import java.util.Arrays;

/**
 * From Rachit Jain Video
 * You have an array of say n Elements, there will be Q number of Query consists of (L,R),
 * You need to increment the array according to that. Say (1,4) so from index 1 to Index 4 you have to
 * increment all the array value. Next say you have (3,6). So from 3 to 6 you have to increment.
 * Brute Force Solution will be for each query run a loop which will start from left and will go till R.
 * Optimal Solution:
 * For Each query Increment arr[L] by 1 and decrement arr[R+1] by 1.
 * At any given point of time if you want to return the result.
 * Run a single loop till n value of Arr[i] is nothing but sum till ith element so if i =5,
 * then Arr[5] = Arr[1]+Arr[2]+Arr[3]+Arr[4]+Arr[5]
 * Let's implement the solution.
 */
public class QueryOnArray {
    public static void findQueryResult(int left, int right, int arr[]) {
        arr[left] = ++arr[left];
        arr[right+1] = --arr[right+1];
        // Instead of 1 if value K has to be added, then left+k and right-k
    }

    /**
     * Now why are we adding and then deleting from right+1 ??
     * This is because, a[i] = a[i]+ a[i-1] (as we know, if previous value has 5, then you have to add
     * that 5 with current value to get final value).
     * Now till when we will add that previous value---- till right element, and right+1 we will stop,
     * that's why in right+1 we are subtracting same number(k) to nullify the previous add effect.
     */

    public static void main(String[] args) {
        int arr[] = new int[10];
        findQueryResult(1,4,arr);
        findQueryResult(3,6,arr);
        for (int i = 1; i < 10; i++) {
            arr[i] = arr[i-1]+arr[i];
        }
        System.out.println(Arrays.toString(arr));
    }
}
