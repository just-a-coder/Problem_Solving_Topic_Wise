package com.problemsolving.random;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Input : n = 3
 * <p>
 * Output :
 * 1*2*3*10*11*12
 * --4*5*8*9
 * ----6*7
 */

public class PrintPattern {

    public static void main(String[] args) {
        int n = 5;
        printCorrespondingPattern(n);
    }

    public static void printCorrespondingPattern(int n) {
        int noCount = n;
        int x = 1;
        int yCal = (int) (Math.pow(n, 2) + 1);
        int dashCount = 2 * (n - noCount);

        for (int i = 1; i <= n; i++) {

            for (int d = 1; d <= dashCount; d++) {
                System.out.print("-");
            }

            for (int j = 1; j <= noCount; j++) {
                System.out.print(x + "*");
                x++;
            }

            int y = yCal;
            for (int k = 1; k < noCount; k++) {
                System.out.print(y + "*");
                y++;
            }
            System.out.println(y);
            --noCount;
            yCal = yCal - noCount;
            dashCount = 2 * (n - noCount);
        }

    }
}
