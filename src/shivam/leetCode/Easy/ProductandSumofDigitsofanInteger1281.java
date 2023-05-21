package shivam.leetCode.Easy;

// Very Easy
// https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/

import java.util.Scanner;

public class ProductandSumofDigitsofanInteger1281 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter Input: ");
        int inp = input.nextInt();
        int mul = 1;
        int addi = 0;
        int r = 0;

        while (inp > 0) {
            r = inp % 10;
            mul = mul * r;
            addi = addi + r;
            inp = inp / 10;
        }

        System.out.println(mul-addi);
    }

}
