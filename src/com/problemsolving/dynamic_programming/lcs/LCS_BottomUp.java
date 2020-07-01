package com.problemsolving.dynamic_programming.lcs;

public class LCS_BottomUp {

    public static int lcs(String x, String y, int m, int n) {
        int t[][] = new int[m + 1][n + 1];
        for (int i = 0; i < m + 1; i++) {
            for (int j = 0; j < n + 1; j++) {
                if (i == 0 || j == 0) {
                    t[i][j] = 0;
                } else {
                    if (x.charAt(i - 1) == y.charAt(j - 1)) {
                        t[i][j] = 1 + t[i - 1][j - 1];
                    } else {
                        t[i][j] = Math.max(t[i - 1][j], t[i][j - 1]);
                    }
                }
            }
        }
        return t[m][n];
    }

    public static void main(String[] args) {
        String x = "abcdh";
        String y = "abdhr";
        System.out.println(lcs(x, y, x.length(), y.length()));
    }
}
