import java.util.LinkedList;

/******************************************************************************
 * Mark Tengi
 * Written: May 7, 2013
 * Project Euler: Problem007 - 10001st prime
 * 
 * 
 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see
 * that the 6th prime is 13.
 * 
 * What is the 10001st prime number?
 * 
 * 
 * Answer: 104743
 * 
 *****************************************************************************/

public class Problem007 {
    public static void main(String[] args) {
        int n = 10001;
        LinkedList<Integer> primes = new LinkedList<Integer>();
        primes.add(2);
        for (int i = 3; primes.size() < n; i += 2) {
            // check if each subsequent odd number is prime by looking for prime
            // factors
            for (int j : primes) {
                if (i % j == 0) {
                    break;
                }
                if (j > Math.sqrt(i)) {
                    primes.add(i);
                    break;
                }
            }
        }
        System.out.println(primes.getLast());
    }
}