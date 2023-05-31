package shivam.leetCode.Medium;

//https://leetcode.com/problems/single-element-in-a-sorted-array/description/

public class SingleElementSortedArray_540 {
    public static void main(String[] args) {
        int[] nums = {1,1,2,3,3,4,4,8,8};
        System.out.println(singleNonDuplicate(nums));
    }

    static int singleNonDuplicate(int[] nums) {
        int left = 0,
                right = nums.length-1;

        while (left < right) {
            int mid = left + (right-left)/2;
            if (mid % 2 == 1) {
                mid--;
            }
            if (nums[mid] != nums[mid + 1]) {
                right = mid;
            } else {
                left = mid + 2;
            }
        }
        return nums[left];
    }
}
