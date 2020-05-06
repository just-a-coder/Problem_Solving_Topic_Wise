package com.problemsolving.heap;

import java.util.Collections;
import java.util.PriorityQueue;

/**
 * Given an array of integers and two numbers k1 and k2. Find the sum of all elements
 * between given two k1’th and k2’th smallest elements of the array.
 * It may  be assumed that all elements of array are distinct.
 * Example :
 * Input : arr[] = {20, 8, 22, 4, 12, 10, 14},  k1 = 3,  k2 = 6
 * Output : 26
 *          3rd smallest element is 10. 6th smallest element
 *          is 20. Sum of all element between k1 & k2 is
 *          12 + 14 = 26
 */
public class SumOfElementsBetweenTwoKElements {
    public static int findKthSmallestElement(int arr[], int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < arr.length; i++) {
           pq.add(arr[i]);
           if(pq.size()>k){
               pq.poll();
           }
        }
        if(!pq.isEmpty()) return pq.poll();
        else return -1;
    }

    public static int findSumBetweenTwoKElements(int arr[], int k1, int k2) {
        int firstK1Element = findKthSmallestElement(arr,k1);
        int secondK1Element = findKthSmallestElement(arr,k2);
        int sum = 0;
        if (k1 < k2) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > firstK1Element && arr[i] < secondK1Element) {
                    sum += arr[i];
                }
            }
        } else {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] < firstK1Element && arr[i] > secondK1Element) {
                    sum += arr[i];
                }
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int arr[] = new int[]{20, 8, 22, 4, 12, 10, 14};
        int k1= 3, k2 =6;
        System.out.println(findSumBetweenTwoKElements(arr, k1, k2));
        System.out.println(findSumBetweenTwoKElements(arr, k2, k1));
    }
}
