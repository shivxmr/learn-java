package shivam.leetCode.Easy;

// https://leetcode.com/problems/two-sum/description/

import java.util.Arrays;

public class TwoSum1 {

    public static void main(String[] args) {
        int[] nums = {1, 2, 4, 5};
        int target = 5;
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }
    static int[] twoSum(int[] arr, int target) {
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                sum = arr[i] + arr[j];
                if (sum == target) {
                    return new int[]{i, j};
                }
//                else i=i+1;
            }

        }

        return new int[]{-1, -1};
    }
}
