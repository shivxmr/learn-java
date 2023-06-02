package shivam.leetCode.Medium;

//https://leetcode.com/problems/maximum-subarray/

public class Max_Subarrayy_53 {
    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(nums));
    }

    static int maxSubArray(int[] nums) {
        int sum = 0 , maxi = Integer.MIN_VALUE;;
        int i = 0 , j = 0;
        while(j<nums.length){

            if(sum < 0 && nums[j] >= sum){
                sum = 0;
                i = j;
            }
            sum += nums[j];
            maxi = Math.max(maxi , sum);
            j++;
        }
        return maxi;

    }
}
