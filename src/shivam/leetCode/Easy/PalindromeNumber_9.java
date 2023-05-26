package shivam.leetCode.Easy;

// https://leetcode.com/problems/palindrome-number/
/*
Given an integer x, return true if x is a palindrome, and false otherwise.
 */

public class PalindromeNumber_9 {
    public static void main(String[] args) {
        int num = 121;
        System.out.println(isPalindrome(num));
    }

    static boolean isPalindrome(int num) {
        // this question gives number so first we will convert it into string to access values
        String num_as_string = Integer.toString(num);
        for (int i = 0; i < num_as_string.length()/2; i++) {
                int start = num_as_string.charAt(i);
                // now end check whether it from back. if start = end then it is a palindrome.
                int end = num_as_string.charAt(num_as_string.length()-1-i);

                if (start != end) {
                    return false;
                }

        }
        return true;
    }
}
