package shivam.leetCode;

// https://leetcode.com/problems/richest-customer-wealth/

public class LinearSearchRichestCustomer1672 {
    public static void main(String[] args) {
        
    }
    public int maximumWealth(int[][] accounts) {
        /*
        person = row
        account = column
         */
        int ans = Integer.MIN_VALUE;
        for (int[] ints : accounts) {
            // when you start a new col take a new sum for that row
            int sum = 0;
            for (int anInt : ints) {
                sum += anInt;
            }
            if (sum > ans) {
                ans = sum;
            }
        }
        return ans;
    }
}
