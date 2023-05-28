package shivam.leetCode.Easy;

public class sqrt_x_69 {
    public static void main(String[] args) {
        System.out.println(sqrt(1225));
    }

    static int sqrt(int x){
    int low = 1, high = x, ans = 0;

    // x is the input and mid is the square root
    // we did not do x = mid * mid to avoid integer overflow and did x/mid = mid instead

        while(low <=high) {

        int mid = low + (high - low) / 2;

        if (x / mid == mid) return mid;
        else if (x / mid < mid) high = mid - 1;
        else {
            low = mid + 1;
            ans = mid;
        }
    }
        return ans;
    }
}
