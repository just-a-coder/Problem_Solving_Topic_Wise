package com.problemsolving.dynamic_programming.lcs;

public class LCS_TopDown {
    static int t[][];

    public static int lcs(String x, String y, int n, int m) {
        if (n == 0 || m == 0) {
            return 0;
        }
        if (t[m][n] == -1) {
            return t[m][n];
        }

        if (x.charAt(n - 1) == y.charAt(m - 1)) {
            return t[m][n] = 1 + lcs(x, y, n - 1, m - 1);
        } else {
            return t[m][n] = Math.max(lcs(x,y,n-1,m), lcs(x,y,n,m-1));
        }
    }

    public static void main(String[] args) {
        String x = "abcdh";
        String y = "abdhr";
         t = new int[x.length()+1][y.length()+1];
        System.out.println(lcs(x, y, x.length(), y.length()));
    }
}
