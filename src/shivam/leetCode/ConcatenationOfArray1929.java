package shivam.leetCode;

// Easy
// https://leetcode.com/problems/concatenation-of-array/


import java.util.Arrays;

public class ConcatenationOfArray1929 {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        System.out.println(Arrays.toString(getConcatenation(nums)));
    }

    static int[] getConcatenation(int[] nums) {
        int[] ans = new int[nums.length * 2];
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            ans[i] = nums[i];
            ans[i+n] = nums[i];
        }
        
        return ans;
    }

}
