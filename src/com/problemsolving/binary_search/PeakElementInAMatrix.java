package com.problemsolving.binary_search;

/**
 * 1 2 3 4 5
 * 1 9 7 5 3
 * 2 3 6 5 3
 * 3 2 4 8 1
 * 1 9 2 3 7
 * 1. Divide the matrix (2-D array) into 4 equal parts, divided on mid row and mid column.
 * 2. Find the local peak (highest element) in row and column.
 * 3 a. If local peak is found in horizontal column (we know left and right are small),
 * check if top and bottom are small, if yes current element is 2-D peak, if no,
 * choose the sub matrix which has higher (top or bottom) number than current element.
 * 3 b. If local peak is found in vertical row (we know top and bottom are small),
 * check if right and left are small, if yes current element is 2-D peak, if no,
 * choose the sub matrix which has higher (left or right) number than current element.
 * 4. After 3, we have got a matrix of N/4*N/4 size of inital matrix. Repeat from 1 with new matrix.
 */
public class PeakElementInAMatrix {
    public static int findPeakElement(int matrix[][], int startRow,
                                      int endRow, int startColumn, int endColumn) {
        int result = 0;
        while (startRow <= endRow && startColumn <= endColumn) {
            int m = (endRow-startRow);
            int n = (endColumn-startColumn);
            int i = m / 2;
            int j = n / 2;
            int maxIndexRowWise = findRowWisePeak(matrix, i, n);
            int maxIndexColumnWise = findColumnWisePeak(matrix, j, m);
            if (matrix[i][maxIndexRowWise] >= matrix[i-1][maxIndexRowWise]
                    && matrix[i][maxIndexRowWise] >= matrix[i+1][maxIndexRowWise]) {
                result = matrix[i][maxIndexRowWise];
                break;
            }
            if (matrix[maxIndexColumnWise][j] >= matrix[maxIndexColumnWise][j-1]
                    && matrix[maxIndexColumnWise][j] >= matrix[maxIndexColumnWise][j+1]) {
                result = matrix[maxIndexColumnWise][j];
                break;
            }

            if (matrix[i][maxIndexRowWise] < matrix[i-1][maxIndexRowWise]) {
                endRow = m / 2;
            } else {
                startRow = m / 2;
            }
            if (matrix[maxIndexColumnWise][j] < matrix[maxIndexColumnWise][j-1])
                endColumn = n / 2;
            else
                startColumn = n / 2;
        }
        return result;
    }


    private static int findRowWisePeak(int matrix[][], int row, int n) {
        int maxIndex = 0;
        for (int j = 1; j < n; j++) {
            if (matrix[row][j] > matrix[row][maxIndex]) {
                maxIndex = j;
            }
        }
        return maxIndex;
    }

    private static int findColumnWisePeak(int matrix[][], int column, int m) {
        int maxIndex = 0;
        for (int i = 1; i < m; i++) {
            if (matrix[i][column] > matrix[maxIndex][column]) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    public static int findPeak(int matrix[][]) {
        int m = matrix.length;
        int n = matrix[0].length;
        return findPeakElement(matrix,0,m,0,n);
    }

    public static void main(String[] args) {
       // int matrix[][] = new int[][]{{1, 2, 3, 4, 5}, {1, 9, 7, 5, 3}, {2, 3, 6, 5, 3}, {3, 2, 4, 8, 1}, {1, 9, 2, 3, 7}};
        int matrix[][] = new int[][]{   {10, 8, 10, 10},
                {14, 13, 12, 11},
                {15, 9, 11, 21},
                {16, 17, 19, 20}};
        System.out.println(findPeak(matrix));
    }
}
