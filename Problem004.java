/******************************************************************************
 * Mark Tengi
 * Written: May 7, 2013
 * 
 * Project Euler: Problem004 - Largest palindrome product
 * 
 * 
 * A palindromic number reads the same both ways. The largest palindrome made
 * from the product of two 2-digit numbers is 9009 = 91 x 99.
 * 
 * Find the largest palindrome made from the product of two 3-digit numbers.
 * 
 * 
 * Answer: 906609
 * 
 *****************************************************************************/

public class Problem004 {
    /**
     * Find the largest factor of n less than or equal to the square root of n
     * which can be multiplied by a three-digit number to get n. If none exists,
     * return 1.
     */
    public static int factor(int n) {
        for (int i = (int) Math.sqrt(n); i > n / 999; i--) {
            if (n % i == 0) {
                return i;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 900; i++) {
            // generate palindromes in order of decreasing size
            int p = 999000 - 1000 * i + (9 - i % 10) * 100
                    + (9 - (i / 10) % 10) * 10 + 9 - (i / 100) % 10;
            int factor = factor(p);
            // when we find a qualifying factor, we're done
            if (factor > 1) {
                System.out.printf("%d * %d = %d\n", factor, p / factor, p);
                break;
            }
        }
    }
}