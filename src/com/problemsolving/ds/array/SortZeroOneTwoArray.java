package com.problemsolving.ds.array;

import java.util.Arrays;


public class SortZeroOneTwoArray {

    public static void main(String[] args) {
        int arr[] = new int[]{2, 1, 1, 0, 1, 2, 1, 2};
        System.out.println(" Before Sorting");
        Arrays.stream(arr).forEach(i -> System.out.print(i + " "));
       // sortArrayCountSort(arr);
        sortArrayInSingleTraversal(arr);
        System.out.println("\n After Sorting");
        Arrays.stream(arr).forEach(i -> System.out.print(i + " "));

    }

    private static void sortArrayInSingleTraversal(int[] arr) {
        int low = 0, mid =0, high = arr.length -1;
        while (mid <= high) {
            if (arr[mid] == 2) {
                swap(arr, mid, high);
                --high;
            } else if (arr[mid] == 0) {
                swap(arr, mid, low);
                ++low;
                ++mid;
            } else {
                ++mid;
            }
        }
    }

    private static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    private static void sortArrayCountSort(int[] arr) {
        int countZero = 0, countOne = 0, countTwo = 0;
        for (int i = 0; i < arr.length; i++) {
            switch (arr[i]) {
                case 0:
                    countZero++;
                    break;
                case 1:
                    countOne++;
                    break;
                case 2:
                    countTwo++;
                    break;
            }
        }

        int index = 0;
        for (int i = countZero; countZero > 0; countZero--) {
            arr[index++] = 0;
        }
        for (int i = countOne; countOne > 0; countOne--) {
            arr[index++] = 1;
        }
        for (int i = countTwo; countTwo > 0; countTwo--) {
            arr[index++] = 2;
        }
    }
}
