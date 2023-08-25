package shivam.leetCode.Medium;

//https://leetcode.com/problems/reverse-integer/

public class Reverse_Integer_7 {
    public static void main(String[] args) {
        int y = 1234;
        System.out.println(reverse(y));
    }

    static int reverse(int x) {
        long reversedx=0;
        int remainder=0;

        int temp = x;

        while (temp != 0) {
            remainder = temp % 10;
            reversedx = (reversedx * 10) + remainder;
            temp /= 10;
        }
        if(reversedx > Integer.MAX_VALUE || reversedx < Integer.MIN_VALUE)
            return 0;
        return (int)reversedx;
    }
}
