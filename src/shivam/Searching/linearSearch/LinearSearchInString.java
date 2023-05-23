package shivam.Searching.linearSearch;

// check if any character is present in a string. Return True or False.

import java.util.Scanner;

public class LinearSearchInString {
    public static void main(String[] args) {

        // Take the input String
        Scanner in = new Scanner(System.in);
        System.out.println("Enter String: ");
        String name = in.nextLine();

        // Take target from user
        Scanner ta = new Scanner(System.in);
        System.out.println("Enter the character you want to search in String: ");
        char target = in.next().charAt(0);
        System.out.println(search(name, target));
    }
    static boolean search(String str, char target) {
        if (str.length() == 0) {
            // str.length() has brackets because it is a function and arr.length does not have brackets because it is a variable
            return false;
        }

        for (int i = 0; i < str.length(); i++) {
            if (target == str.charAt(i)) {
                return true;
            }

        }

        return false;
    }
}
