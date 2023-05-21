package shivam.leetCode.Easy;

// https://leetcode.com/problems/running-sum-of-1d-array/

import java.util.Arrays;

public class RunningSumof1dArray1480 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        System.out.println(Arrays.toString(sum(nums)));
    }

    static int[] sum(int[] nums) {
        int[] sum1 = new int[nums.length];
        int n = nums.length;
        int i = 0;

        while ( i < n && i>=0) {
            if (i==0) {
                sum1[i] = nums[i] + sum1[i];
            }
            else sum1[i] = nums[i] + sum1[i-1];
            i = i+1;
        }

        return sum1;
    }


}
