package com.problemsolving.ds.array.imp;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int arr[] = new int[]{1,2,2,3,3,3,4,5,5};
        int length = removeDuplicates(arr, arr.length);
        System.out.println(length);
    }

    private static int removeDuplicates(int[] arr, int n) {
        int j = 0;//for next element
        for (int i=0; i < n-1; i++){
            if (arr[i] != arr[i+1]){
                arr[j] = arr[i];
                j++;
            }
        }
        arr[j++] = arr[n-1];
        return j;
    }

}
