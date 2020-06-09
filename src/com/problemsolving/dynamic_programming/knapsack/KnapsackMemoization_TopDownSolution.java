package com.problemsolving.dynamic_programming.knapsack;

import java.util.Arrays;

public class KnapsackMemoization_TopDownSolution {
    static int t[][];
    public static int knapsack(int wt[], int val[], int W, int n) {
        if (n == 0 || W == 0) return 0;
        if (t[n][W] != -1) {
            return t[n][W];
        }

        if (wt[n - 1] <= W) {
            return t[n][W] = Math.max(val[n - 1] + knapsack(wt, val, W - wt[n - 1],n - 1),
            knapsack(wt, val, W, n - 1));
        } else {
            return t[n][W] = knapsack(wt, val, W, n - 1);
        }
    }

    public static void main(String[] args) {
        int wt[] = new int[]{1, 3, 4, 5};
        int val[] = new int[]{1, 4, 5, 7};
        int W = 7;
        int n = 4;
        t = new int[n + 1][W + 1];
        for (int i = 0; i < n+1; i++)
            Arrays.fill(t[i], -1);
        System.out.println(knapsack(wt, val, W, n));
    }
}
