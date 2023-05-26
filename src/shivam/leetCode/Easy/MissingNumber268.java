package shivam.leetCode.Easy;

// https://leetcode.com/problems/missing-number/

/*
Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.

Input: nums = [3,0,1]
Output: 2
Explanation: n = 3 since there are 3 numbers, so all numbers are in the range [0,3]. 2 is the missing number in the range since it does not appear in nums.
 */

public class MissingNumber268 {

    public static void main(String[] args) {
        int[] nums = {4, 0, 2 ,1 };
        System.out.println(missingNumber(nums));
    }
    static int missingNumber(int[] nums) {
        // cyclic sort the array
        int i = 0;
        while (i < nums.length) {
            int correctIndex = nums[i];
            // If no. greater than 1 to n so nums[i] < nums.length will not take into account
            if (nums[i] < nums.length && nums[i] != nums[correctIndex]) {
                swap(nums, i, correctIndex);
            }
            else i++;
        }

        // now search for missing number
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index) {
                return index;
            }
        }
        return nums.length;
    }
    static void swap(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}