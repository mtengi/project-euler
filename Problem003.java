import java.util.LinkedList;

/******************************************************************************
 * Mark Tengi
 * Written: May 7, 2013
 * 
 * Project Euler: Problem003 - Largest prime factor
 * 
 * 
 * The prime factors of 13195 are 5, 7, 13 and 29.
 * 
 * What is the largest prime factor of the number 600851475143?
 * 
 * 
 * Answer: 6857
 * 
 *****************************************************************************/

public class Problem003 {
    public static void main(String[] args) {
        long target = 600851475143L;
        LinkedList<Integer> primes = new LinkedList<Integer>();
        primes.add(2);
        for (int i = 3; i < Math.sqrt(target); i += 2) {
            boolean isPrime = true;
            for (int p : primes) {
                if (i % p == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                primes.add(i);
                if (target % i == 0) {
                    target /= i; // borrowed from Project Euler user lassevk
                }
            }
        }
        System.out.println(target);
    }
}