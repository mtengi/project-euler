/******************************************************************************
 * Mark Tengi
 * Written: Jul 23, 2013
 * 
 * Project Euler: Problem024 - **TITLE**
 * 
 * 
 * **DESCRIPTION GOES HERE**
 * 
 * 
 * Answer: 
 * 
 *****************************************************************************/

public class Problem024 {
    public static void main(String[] args) {
        int[] perm = new int[10];
        int[] remainingDigits = new int[10];
        int[] factorials = new int[10];
        int remaining = 1000000;
        int found = 0;
        for (int i = 0; i < 10; i++) {
            perm[i] = -1;
            remainingDigits[i] = i;
            factorials[i] = factorial(i);
            System.out.println(factorials[i]);
        }
        while (true) {
            int index = remaining / factorial(9 - found);
            perm[found] = remainingDigits[index];
            for (int i = index; i < 9; i++) {
                remainingDigits[i] = remainingDigits[i + 1];
            }
            found++;
            for (int i = 0; i < 10; i++) {
                System.out.print(perm[i]);
            }
            System.out.println();
        }
    }

    public static int factorial(int n) {
        if (n <3) {
            return n;
        }
        return n * factorial(n - 1);
    }
}
