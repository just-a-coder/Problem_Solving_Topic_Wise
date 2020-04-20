package com.problemsolving.ds.array.imp;

public class PrintArrayInSpiralOrder {
    public static void main(String[] args) {
        int A[][] = new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        printSpiralArray(A, 4, 4);
    }

    private static void printSpiralArray(int[][] A, int m, int n) {
        int L = 0, R = n - 1, T = 0, B = m - 1;
        int dir = 0;
        while (T <= B && L <= R) {

            // Moving From Left To Right Direction
            if (dir == 0) {
                for (int i = L; i <= R; i++) {
                    System.out.print(A[T][i]+" ");
                }
                T++;
            }
            // Moving From Top To Bottom Direction
            else if (dir == 1) {
                for (int i = T; i <= B; i++) {
                    System.out.print(A[i][R]+" ");
                }
                R--;
            }
            // Moving From Right To Left Direction
            else if (dir == 2) {
                for (int i = R; i >= L; i--) {
                    System.out.print(A[B][i]+" ");
                }
                B--;
            }
            // Moving From Bottom To Top Direction
            else if (dir == 3) {
                for (int i = B; i >= T; i--) {
                    System.out.print(A[i][L]+" ");
                }
                L++;
            }
            dir = (dir+1)%4;
        }
    }
}
