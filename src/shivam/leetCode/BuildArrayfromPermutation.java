package shivam.leetCode;

//Easy
// https://leetcode.com/problems/build-array-from-permutation/

import java.util.Arrays;

public class BuildArrayfromPermutation {

    public static void main(String[] args) {
        int[] nums = {0, 2, 1, 5, 3, 4};
        System.out.println(Arrays.toString(buildArray(nums)));
    }
    static int[] buildArray(int[] nums) {

//        int[] ans = {};
//        The error you encountered is caused by the fact that you initialized the ans array with an empty array {}. An empty array has a length of 0, so when you try to access ans[i] in the for loop, you're trying to access an index that is out of bounds. To fix this issue, you should initialize the ans array with a length equal to the length of the nums array.

        int[] ans = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[nums[i]];
        }

        return ans;
    }
}
