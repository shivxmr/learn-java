package shivam;

import java.util.Scanner;

public class SwitchCase_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number:");
        int num = in.nextInt();
        switch (num) {
            case 1:
                System.out.println("Weekend");
                break;
            case 2:
                System.out.println("Weekend");
                break;
            case 3, 4, 5, 6, 7:
                System.out.println("Weekday");
                break;
            default:
                System.out.println("Week contains 7 days so enter value between 1-7.");
        }

        //Enhanced switch - Same as above code - Alt + Shift + Enter to enhance your switch statement.
        /*
        switch (num) {
            case 1 -> System.out.println("Weekend");
            case 2 -> System.out.println("Weekend");
            case 3, 4, 5, 6, 7 -> System.out.println("Weekday");
            default -> System.out.println("Week contains 7 days so enter value between 1-7.");
        }
         */
    }
}
