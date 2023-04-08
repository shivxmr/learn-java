package shivam;

public class LoopsSyntax_2 {


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


// Take input and show that Fibonacci number
    /*
public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int a = 0;
    int b = 1;
    int count = 2;
    while (count <= n) {
        int temp = b;
        b = b+a;
        a = temp;
        count++;
    }
    System.out.println(b);
}
     */


    // User will give a number and then will ask for how many times a digit occurred in that number.


    /*
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int num = in.nextInt();
        System.out.print("Enter the digit you want to count in that number: ");
        int dig = in.nextInt();
        int count = 0;

        while (num > 0) {
            if (num % 10 == dig) {
                count++;
                num = num / 10;
            }
            if (num % 10 != dig) {
                num = num / 10;
            }
        }
        System.out.println("The number of times " + dig + " occurs is "  + count);
       }


           // Although this code can handle only single digit as dig as of now!


     */





}