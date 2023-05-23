package shivam.Searching.BinarySearch;

public class binarySearch {
    // works in sorted array only. Ascending or Descending
    // below code works only for ascending order
    // if you wish a code which does not depend on asc or desc then use orderAgnosticBinarySearch code. Array should be sorted though.

    public static void main(String[] args) {
        int[] arr = {2, 4, 5, 7, 8, 9, 10, 80, 98, 900};
        int target = 5;
        System.out.println(binarySearch(arr, target));
    }

    // return the index
    // return -1 if it does not exist

    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;


        while (start <= end) {
            int mid = start + (end - start)/2;

            if (target < arr[mid]) {
                end = mid -1 ;
            }
            else if (target>arr[mid]) {
                start = mid + 1;
            }
            else
            return mid;
        }

        return -1;
    }

}
