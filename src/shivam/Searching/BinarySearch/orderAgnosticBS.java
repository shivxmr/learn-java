package shivam.Searching.BinarySearch;

public class orderAgnosticBS {

    // this is used when we know that array is sorted but we do not know if it is in ascending or descending order.

    public static void main(String[] args) {
//        int[] arr = {2, 4, 5, 7, 8, 9, 10, 80, 98, 900};
        int[] arr = {90, 78, 67, 56, 45, 45, 34, 23, 12, 11};
        int target = 45;
        System.out.println(binarySearch(arr, target));
    }
    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        //check asc or desc by comparing the first and the last element
        boolean isAsc;
        if (arr[start] < arr[end]) {
            isAsc = true;
        } else isAsc = false;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
            else {
                // this means it is in descending order
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }

        return  -1;
    }
}
