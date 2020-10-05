package com.problemsolving.contest;

import com.problemsolving.heap.FrequencySort;

import java.util.*;

public class ContestTest {

    public static int sumOddLengthSubarrays(int[] arr) {
        int s = 0;
        for(int i=0;i<arr.length;++i){
            System.out.println("i: "+i);
            for(int j=i+1;j<=arr.length;j+=2){
                System.out.println("J: "+j);
                for(int k=i;k<j;++k){
                    System.out.println("k: "+k);
                    s+=arr[k];
                }

            }
        }


        return s;
    }

    public static void main(String[] args) {
        int arr[] = new int[]{1,4,2,5,3};
        System.out.println(sumOddLengthSubarrays(arr));
    }
}
