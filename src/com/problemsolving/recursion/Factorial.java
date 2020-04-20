package com.problemsolving.recursion;

public class Factorial {
    public static void main(String[] args) {
        int n = 13;
        for(int i=0; i<15; i++)
        System.out.println("Factorial of "+i+" :: "+fact(i));

    }

    public static long fact(long n) {
        if(n==1 || n==0)
            return 1;
        else
            return n*fact(n-1);
    }
}
