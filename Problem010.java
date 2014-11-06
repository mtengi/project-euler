/******************************************************************************
 * Mark Tengi
 * Written: Jun 2, 2013
 * 
 * Project Euler: Problem010 - Summation of primes
 * 
 * 
 * The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
 * 
 * Find the sum of all the primes below two million.
 * 
 * 
 * Answer: 142913828922
 * 
 *****************************************************************************/

public class Problem010 {
    public static void main(String[] args) {
        long t = System.currentTimeMillis();
        int limit = 2000000;
        // find all of the primes using a prime sieve
        boolean[] marked = new boolean[limit];
        for (int i = 3; i < Math.sqrt(limit); i += 2) {
            if (!marked[i]) {
                for (long j = (long) i * i; j < limit; j += i) {
                    marked[(int) j] = true;
                }
            }
        }
        // sum them
        long total = 2;
        for (int i = 3; i < limit; i += 2) {
            if (!marked[i]) {
                total += i;
            }
        }
        System.out.println(total);
        System.out.println(System.currentTimeMillis() - t);
    }
}