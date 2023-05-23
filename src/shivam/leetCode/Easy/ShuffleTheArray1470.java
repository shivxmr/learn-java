package shivam.leetCode.Easy;

//https://leetcode.com/problems/shuffle-the-array/

/*
Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].
Return the array in the form [x1,y1,x2,y2,...,xn,yn]

Constraints:

1 <= n <= 500
nums.length == 2n
1 <= nums[i] <= 10^3

 */

import java.util.Arrays;

public class ShuffleTheArray1470 {

    public static void main(String[] args) {
        int[] nums = {2, 5, 1,3, 4, 7};
        System.out.println(Arrays.toString(shuffle(nums, 3)));
    }

    static int[] shuffle(int[] nums, int n) {
        n = nums.length/2;
        int[] shuffledArray1 = new int [n];
        int[] shuffledArray2 = new int [n];
        int[] shuffledArray = new int [nums.length];


        // First I stored from 1 to n in shuffledArray1 and then from n to 2n in shuffledArray2
        System.arraycopy(nums, 0, shuffledArray1, 0, n);

        for (int i = n; i < nums.length; i++) {
            int a = i - nums.length/2;
            shuffledArray2[a] = nums[i];
        }

        // Now I need to place properly from shuffledArray1 & shuffledArray2 in shuffledArray
        for (int i = 0; i < nums.length/2; i++) {
            int b = i*2;
            int c = i*2 + 1;
            shuffledArray[b] = shuffledArray1[i];
            shuffledArray[c] = shuffledArray2[i];
        }

        return shuffledArray;

    }
}
