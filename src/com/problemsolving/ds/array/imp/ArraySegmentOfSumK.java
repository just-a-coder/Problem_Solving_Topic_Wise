package com.problemsolving.ds.array.imp;

public class ArraySegmentOfSumK {
    public static void main(String[] args) {
        int arr[] = new int[]{135,101,170,125,79,159,163,65,106,146,82,28,162,92,196
                ,143,28,37,192,5,103,154,93,183,22
                ,117,119,96,48,127,172,139,70,113,68,100,36,95,104,12,123,134};
        int k = 468;
//        int arr[] = new int[]{1,2,3,7,5};
        findSubArrayOfSumK(arr, k);
    }

    private static void findSubArrayOfSumK(int[] arr, int k) {
        int n = arr.length;
        int wsum = 0;
        boolean flag = false;
        int start = 0;
        int end = 0;
        while(end < n) {
            if (wsum == k) {
                flag = true;
                System.out.println("Start: "+(start)+" End: "+end);
                break;
            } else if (wsum > k) {
                wsum = wsum - arr[start];
                start++;
            } else if(end+1<n){
                wsum += arr[end];
                end++;
            }
        }

        if (!flag) {
            System.out.println(-1);
        }
    }
}
