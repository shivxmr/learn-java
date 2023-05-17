// arr = [18, 12, -7, 3, 68,69, 90, 87]
// Search for 3 in the range [1,4]

package shivam.linearSearch;

public class LinearSearchInRange {
    public static void main(String[] args) {
        int[] arr = {18, 12, -7, 3, 68,69, 90, 87};
        int target = -7;
        System.out.println(linearSearch(arr, target, 1, 4));
    }

    static int linearSearch(int[] arr, int target, int start, int end) {
        if (arr.length == 0) {
            return -1;
        }

        //run for loop
        for (int index = start; index <= end; index++) {
            // check if element is equal to target element
            int element = arr[index];
            if (element == target) {
                return index;
            }
        }
        return -1;
    }
}
