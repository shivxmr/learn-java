package shivam;

public class LinearSearch {
    public static void main(String[] args) {
        int[] nums = {3, 5, 7, 19, 29, 9, 90};
        int target = 9;
        int ans = linearSearch(nums, target);
        System.out.println(ans);
    }
    static int linearSearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }

        //run for loop
        for (int index = 0; index < arr.length; index++) {
            // check if element is equal to target element
            int element = arr[index];
            if (element == target) {
                return index;
            }
        }
        return -1;
    }
}
