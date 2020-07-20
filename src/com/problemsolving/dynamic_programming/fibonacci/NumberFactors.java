package com.problemsolving.dynamic_programming.fibonacci;

public class NumberFactors {
    public int numberFactors(int n) {
        if(n == 0) return 1;
        if(n == 1) return 1;
        if(n == 2) return 1;
        if(n == 3) return 2;

        int subtract1 = numberFactors(n - 1);
        int subtract3 = numberFactors(n - 3);
        int subtract4 = numberFactors(n - 4);
        return subtract1 + subtract3 + subtract4;
    }

    public int numberFactorsDP(int n) {
        int dp[] = new int[n+1];
        dp[0] = 1;
        dp[1] = 1;
        dp[2] = 1;
        dp[3] = 2;

        for (int i = 4; i <= n; i++) {
           dp[i] = dp[i-1] + dp[i-3]+ dp[i-4];
        }

        return dp[n];
    }

    public static void main(String[] args) {
        NumberFactors nf = new NumberFactors();
        System.out.println(nf.numberFactors(6));
        System.out.println(nf.numberFactorsDP(6));
    }
}
