package com.problemsolving.dynamic_programming.fibonacci;

public class Staircase {
    private int staircaseWays(int n) {
        if (n == 0) return 1;
        if (n == 1) return 1;
        if (n == 2) return 2;

        int takeway1 = staircaseWays(n - 1);
        int takeway2 = staircaseWays(n - 2);
        int takeway3 = staircaseWays(n - 3);

        return takeway1 + takeway2 + takeway3;
    }

    private int staircaseWaysDP(int n) {
        int dp[] = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3];
        }
        return dp[n];
    }

    public static void main(String[] args) {
        Staircase st = new Staircase();
        int n = 3;
        System.out.println(st.staircaseWaysDP(n));
    }
}
