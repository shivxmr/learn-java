package shivam;

import java.util.Scanner;

/*
Always type casting is done for comparable types - like float and int - and not string and int.
*/

// Here we ask for float but if we give int then it does not show error as float can store int so no need to type cast.
/*
public class TypeCasting_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float num = input.nextFloat();
        System.out.println(num);
    }
}
*/

// Here we ask for int but if we give float then it shows error as int can't store float value.
/*
public class TypeCasting_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        System.out.println(num);
    }
}
*/

// Therefore we need to type cast - we take value as double and then type cast them into long and int data types
public class TypeCasting_1 {
    public static void main(String[] args) {
        double d = 166.66;
//converting double data type into long data type
        long l = (long)d;
//converting long data type into int data type
        int i = (int)l;
        System.out.println("Before conversion: " + d);
//fractional part lost
        System.out.println("After conversion into long type: " + l);
//fractional part lost
        System.out.println("After conversion into int type: " + i);
    }
}
