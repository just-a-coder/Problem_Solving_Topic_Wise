package com.problemsolving.mathematical;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MaximumCircleCuts {
/*    public static void main(String[] args) {
        System.out.println(" Maximum no of cuts: "+maximumNoOfCuts(3));
    }*/

    public static void main(String[] args) throws IOException {
        // Using BufferedReader class to take input
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // taking input of number of testcase
        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            // n : size of array
            int n = Integer.parseInt(br.readLine());
            double result = maximumNoOfCuts(n);
            System.out.println((long)result);

        }
        br.close();
    }

    /**
     * Mathematical Expression for Max number of cuts
     * f(n) = 1/2*(n+n^2+2)
     */
    public static double maximumNoOfCuts(int n) {
        return (n+Math.pow(n,2)+2)/2;
    }
}
