package shivam.leetCode.Medium;

//https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/

import java.util.Arrays;

public class TwoSumII_167 {
    public static void main(String[] args) {
        int[] numbers = {2,7,11,15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(numbers, target)));
    }

    static int[] twoSum(int[] numbers, int target) {
        int start = 0, end = numbers.length - 1;
        while (start < end) {
            if (numbers[start] + numbers[end] < target) {
                start++;
            } else if (numbers[start] + numbers[end] > target) {
                end--;
            } else return new int[]{start + 1, end + 1};
        }
    return new int[]{-1,-1};
    }
}

// My first solution but it beats only 5% people
//        for (int i = 0; i < numbers.length-1; i++) {
//            for (int j = i+1; j < numbers.length; j++) {
//                if (numbers[i] + numbers[j] == target) {
//                    return new int[]{i+1,j+1};
//                }
//            }
//        }
//        return new int[]{-1, -1};