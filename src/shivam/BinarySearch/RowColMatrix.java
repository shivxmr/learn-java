package shivam.BinarySearch;

// Binary Search in 2D Matrix
// Matrix is sorted row-wise and col-wise, and we have search target element
// We will use Binary Search since it is sorted

import java.util.Arrays;

public class RowColMatrix {
    public static void main(String[] args) {
        int[][] arr = {
                {10, 20, 30, 40},
                {15, 25, 35, 45},
                {28, 29, 37, 49},
                {33, 34, 38, 50}
        };
        int tar = 37;
        System.out.println(Arrays.toString(search(arr, tar)));
    }


    static int[] search (int[][] matrix, int target) {
        int r = 0;
        int c = matrix.length - 1;

        while (r < matrix.length && c>0) {
            if (matrix[r][c] == target) {
                return new int[]{r, c};
            }

            if (matrix[r][c] < target) {
                r++;
            } else c--;
        }

        return new int[]{-1, -1};
    }
}
