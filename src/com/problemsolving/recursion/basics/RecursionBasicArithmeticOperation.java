package com.problemsolving.recursion.basics;

public class RecursionBasicArithmeticOperation {
    public static void descending(int n) {
        if(n == 0) return;
        System.out.print(n+" ");
        descending(n-1);
    }

    public static int printSum(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n+ printSum(n-1);
        }

    }

    public static int exp(int x, int m) {
        if (m == 0) {
            return 1;
        } else {
            return x * exp(x,m-1);
        }
    }

    public static void main(String[] args) {
        descending(4);
        System.out.println("\n PrintSum: "+printSum(4));
        System.out.println("Exponential of 2 ^ 4 is: "+exp(2, 4));
    }
}
