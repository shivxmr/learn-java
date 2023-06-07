package shivam.leetCode.Easy;

//https://leetcode.com/problems/valid-perfect-square/

public class ValidPerfectSquare_367 {
    public static void main(String[] args) {
        int num = 25;
        System.out.println(isPerfectSquare(num));
    }

    static boolean isPerfectSquare(int num) {
    int left = 0, right = num;
    if(num==1) return true;
    while (left<=right) {
        long mid = left + (right-left)/2;
        if (num/mid < mid) {
            right = (int) (mid-1);
        } else if (num/mid > mid) {
            left = (int)(mid+1);
        } else return true;
    }
    return false;




//        long temp =num;
//        while(temp > num/temp){
//            temp = (temp + num/temp)/2;
//        }
//        return temp * temp == num;
    }
}

