package shivam.leetCode.Easy;

//https://leetcode.com/problems/final-value-of-variable-after-performing-operations/

public class finalValueAfterOperations_2011 {
    public static void main(String[] args) {
        String[] operations = {"X++","++X","--X"};
        System.out.println(finalValueAfterOperations(operations));;
    }

    static int finalValueAfterOperations(String[] operations) {

        int x = 0;
        for(String o : operations) x += (44 - o.charAt(1));
        return x;

        /*
        int ans = 0;
        for (String i: operations) {
            if (i.contains("X++") || i.contains("++X"))
                ans++;
            else ans--;
        }

        return ans;
         */

    }
}
