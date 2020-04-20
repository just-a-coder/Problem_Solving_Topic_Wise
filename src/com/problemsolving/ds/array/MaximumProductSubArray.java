package com.problemsolving.ds.array;

public class MaximumProductSubArray {
    public static void main(String[] args) {
        int arr[] = new int[]{0,-1,-1};
        long product = maxProduct(arr);
        System.out.println(product);
    }

    static int maxProduct(int arr[]) {
        int value = Integer.MIN_VALUE;
        int max = 1, min = 1;

        int zeroCount = 1;
        boolean zeroFlag = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                max = 1;
                min = 1;
            } else if (arr[i] > 0) {
                zeroFlag = true;
                zeroCount = 1;
                max = arr[i]*max;
                min = Math.min(min*arr[i],1);
            } else {
                if(!zeroFlag)
                zeroCount = -zeroCount;
                int temp = max;
                max = Math.max(min*arr[i],1);
                min = temp * arr[i];
            }
            if(value<max)
                value = max;
        }
        if(zeroCount>0)
        return value;
        else
            return 0;
    }

}
