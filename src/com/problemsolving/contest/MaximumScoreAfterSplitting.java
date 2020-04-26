package com.problemsolving.contest;

public class MaximumScoreAfterSplitting {
    public static int maxScore(String s) {
        int n = s.length(), cz = 0, co = 0, result = 0;
        for (int i = 0; i < n; i++) {
            if(s.charAt(i)=='1')
                co++;
        }
        for (int i = 0; i < n-1; i++) {
            if(s.charAt(i)=='1')
                co--;
            else
                cz++;
            result = Math.max(result, cz+co);
        }
        return result;
    }

    public static void main(String[] args) {
        String s  = "011101";
        System.out.println(maxScore(s));
    }
}
