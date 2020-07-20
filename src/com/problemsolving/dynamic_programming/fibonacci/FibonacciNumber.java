package com.problemsolving.dynamic_programming.fibonacci;

public class FibonacciNumber {
    public static int findFibonacci(int n) {
        if (n < 2)
            return n;
        int temp1 = 0, temp2 = 1, fib;
        for (int i = 2; i <= n; i++) {
            fib = temp1 + temp2;
            temp1 = temp2;
            temp2 = fib;
        }
        return temp2;
    }

    public static void main(String[] args) {
        System.out.println(findFibonacci(5));
        System.out.println(findFibonacci(6));
        System.out.println(findFibonacci(7));
    }
}
