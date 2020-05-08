package com.problemsolving.array;

import java.util.HashMap;
import java.util.Map;

public class SumOfDistinctElement {
    public static void main(String[] args) {
        int arr[] = new int[]{1,2,3,4,3,5};
        System.out.println(" Sum Result: "+sumOperation(arr));
    }

    public static int sumOperation(int arr[]) {
        Map<Integer, Integer> hMap = new HashMap<>();
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (!hMap.containsKey(arr[i])) {
                sum = sum + arr[i];
                hMap.put(arr[i], arr[i]);
            }
        }
        return sum;
    }
}
