package shivam.leetCode.Easy;

// https://leetcode.com/problems/pascals-triangle/

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle_118 {
    public static void main(String[] args) {
        int numRows = 5;
        // Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
        System.out.println(generate(numRows));
    }

    static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();

        // row
        for (int row = 1; row <= numRows+1; row++) {
            for (int col = 1; col < 3; col++) {

            }
        }

        return triangle;
    }
}
