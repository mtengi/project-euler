/******************************************************************************
 * Mark Tengi
 * Written: May 7, 2013
 * 
 * Project Euler: Problem005 - Smallest multiple
 * 
 * 
 * 2520 is the smallest number that can be divided by each of the numbers from 1
 * to 10 without any remainder.
 * 
 * What is the smallest positive number that is evenly divisible by all of the
 * numbers from 1 to 20?
 * 
 * 
 * Answer: 232792560
 * 
 *****************************************************************************/

public class Problem005 {
    public static void main(String[] args) {
        int n = 20;
        long product = 1;

        // enumerate the values from 1 to n
        int[] multipliers = new int[n + 1];
        for (int i = 0; i < multipliers.length; i++) {
            multipliers[i] = i;
        }
        for (int i = 2; i < multipliers.length; i++) {
            product *= multipliers[i];
            // find all multiples of i and, if multi[j] is evenly divisible by
            // multi[i], divide it by multi[i]. Thus, multi[6] will be 1 when we
            // get to it (and therefore the product will stay the same) because
            // we've already multiplied the product by 2 and 3, ensuring that
            // the value in product is divisible by 6
            for (int j = 2 * i; j < multipliers.length; j += i) {
                if (multipliers[j] % multipliers[i] == 0) {
                    multipliers[j] /= multipliers[i];
                }
            }
        }
        System.out.println(product);
    }
}