package shivam.initialPrograms;

import java.util.Scanner;
public class Main {
//    public static void main(String[] args) {
//        System.out.println("Hello Java");
//    String name = "Shivam";
//    String myname = name;
//        System.out.println(myname);
//        System.out.println(name);

/* Primitive Data Types
        long number = 12354678809L;
*/
// Non-primitive Data Types

       /* String name = "Shivam";
        System.out.println(name.length());
        System.out.println(name.charAt(2));
        System.out.println(name.replace('a', 'i')); */

        // Important - Strings are immutable in JAVA.
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter your Roll No. : ");
            int roll = input.nextInt();
            System.out.println("Your roll no. is " + roll);
        }
}





