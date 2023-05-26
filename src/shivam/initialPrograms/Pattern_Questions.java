package shivam.initialPrograms;
/*
3 Rules while solving a pattern question:
1. See no. of Rows
2. See no. of Columns
3. See what needs to be printed
 */
public class Pattern_Questions {
    public static void main(String[] args) {
        pattern5(4);
    }
/* Print this pattern:

*
* *
* * *
* * * *
* * *
* *
*

 */
    static void pattern5(int n) {
        for (int row = 0; row <= 2 * n - 1; row++) {
            int colTotal;
            if (row>n) {
                colTotal = 2 * n - row;
            }
            else colTotal = row;
            for (int col = 0; col < colTotal; col++) {
                System.out.print("* ");
            }
        System.out.println();
        }
    }
}
