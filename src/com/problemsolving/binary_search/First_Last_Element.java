package com.problemsolving.binary_search;

public class First_Last_Element {
    private static int findFirstElement(int[] arr, int k) {
        int start = 0, end = arr.length, mid;
        while (start < end) {
            mid = start + (end-start)/2;
            if (arr[mid] >= k) {
                end = mid;
            } else {
                start = mid+1;
            }
        }
        return start;
    }

    private static int findLastElement(int[] arr, int k) {
        int start = 0, end = arr.length, mid;
        while (start < end) {
            mid = start + (end-start)/2;
           // mid = start + (end-start)/2 +1;
            if (arr[mid] > k) {
                end = mid - 1;
            } else {
                start = mid;
            }
        }
        return start;
    }

    public static void main(String[] args) {
        int arr1[] = new int[]{1, 2, 2, 2, 3};
        int arr2[] = new int[]{1, 1, 2, 2, 3};
        int k = 2;
        System.out.println(findFirstElement(arr1,k));
        System.out.println(findLastElement(arr1,k));
    }

}
