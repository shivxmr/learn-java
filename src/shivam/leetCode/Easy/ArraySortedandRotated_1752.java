package shivam.leetCode.Easy;

//https://leetcode.com/problems/check-if-array-is-sorted-and-rotated/

public class ArraySortedandRotated_1752 {
    public static void main(String[] args) {
        int[] nums = {3, 4, 5, 1, 2};
        System.out.println(check(nums));
    }

    static boolean check(int[] nums) {
        int n = nums.length;
        boolean rotated = false;

        for (int i = 0; i < n; i++) {
            if (nums[i] > nums[(i + 1) % n]) {
                if (rotated) {
                    return false;
                }
                rotated = true;
            } else if (nums[i] == nums[(i + 1) % n]) {
                continue;
            }
        }
        return true;
    }
}
