package com.problemsolving.array;

public class CircularArray {
    public static void printCircularSubarray(char arr[], int n) {
        int len = arr.length;
        for (int i = 3; i < len+n; i++) {
            System.out.print(arr[i % len]+" ");
        }
    }

    public static void main(String[] args) {
        char ch[] = new char[]{'A','B','C','D','E','F'};
        int n = 3;
        // Print From 3rd
        printCircularSubarray(ch,n);
    }
}
