package shivam;

import java.util.Scanner;
public class LoopsSyntax {


    //Take input from user and print all nos below it using while loop.
    /*
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Number:");
        int num = input.nextInt();
        int num1 = num;
        while (num>=1) {
            num-= 1;
            System.out.println(num);
        }
    }
     */



    //Take input from user and print next 5 integers
/*
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number:");
        int num = input.nextInt();
        int num1 = num+5;
        int i = 0;
        for (i=num+1; i<=num1; i+= 1) {
            System.out.println(i);
        }
    }
 */



//Take 3 inputs from user and print max and min number.
    /*
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number 1:");
        int num1 = input.nextInt();
        System.out.print("Enter number 2:");
        int num2 = input.nextInt();
        System.out.print("Enter number 3:");
        int num3 = input.nextInt();

        int max = num1;

        if (num2>max) {
            max = num2;
        }
        if (num3>max) {
            max = num3;
        }
        System.out.println(max);
    }

     */


    //Take input as a character and check if the first letter is uppercase or lowercase.
    /*
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char ch = in.next().trim().charAt(0);
        if (ch >='a' && ch <= 'z') {
            System.out.println("Lowercase");
        }
        else {
            System.out.println("Uppercase");
        }
    }
     */





}