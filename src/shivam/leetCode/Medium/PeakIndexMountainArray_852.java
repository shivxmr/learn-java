package shivam.leetCode.Medium;

//https://leetcode.com/problems/peak-index-in-a-mountain-array/

public class PeakIndexMountainArray_852 {
    public static void main(String[] args) {
        int[] arr = {0,1, 0};
        System.out.println(peakIndexInMountainArray(arr));
    }

    static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        int mid = 0;
        for (int i = 0; i <= arr.length-1; i++) {
            mid = start + (end-start)/2;

            if (arr[mid]>arr[mid+1]) {
                end = mid;
            }
            if (arr[mid]<arr[mid+1]) {
                start = mid+1;
            }
        }
        return mid;
    }
}


/*
Solution copied from Leetcode: My solution is better memorywise but this solution has a better runtime.

class Solution {
    public int peakIndexInMountainArray(int[] arr) {
       int start = 0;
       int end = arr.length;
       while(start < end){
           int mid = start + (end - start) / 2;
           if(arr[mid] < arr[mid + 1]){
               start = mid + 1;
           } else{
               end = mid;
           }
       }
       return start;
    }
}
 */
