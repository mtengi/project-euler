/******************************************************************************
 * Mark Tengi
 * Written: Jul 22, 2013
 * 
 * Project Euler: Problem021 - Amicable numbers
 * 
 * 
 * Let d(n) be defined as the sum of proper divisors of n (numbers less than n
 * which divide evenly into n).
 * If d(a) = b and d(b) = a, where a ≠ b, then a and b are an amicable pair and
 * each of a and b are called amicable numbers.
 * 
 * For example, the proper divisors of 220 are 1, 2, 4, 5, 10, 11, 20, 22, 44,
 * 55 and 110; therefore d(220) = 284. The proper divisors of 284 are 1, 2, 4,
 * 71 and 142; so d(284) = 220.
 * 
 * Evaluate the sum of all the amicable numbers under 10000.
 * 
 * 
 * Answer: 31626
 * 
 *****************************************************************************/

public class Problem021 {
    public static void main(String[] args) {
        long t = System.currentTimeMillis();
        int n = 10000;
        int[] divSums = new int[n];
        for (int i = 1; i < divSums.length; i++) {
            int sum = 1;
            for (int j = 2; j * j <= i; j++) {
                if (i % j == 0) {
                    sum += j;
                    if (j * j != i) {
                        sum += i / j;
                    }
                }
            }
            divSums[i] = sum;
        }

        int sum = 0;
        for (int i = 1; i < divSums.length; i++) {
            if (divSums[i] < divSums.length) {
                int j = divSums[divSums[i]];
                if (j == i && divSums[i] != i) {
                    sum += i;
                    sum += divSums[i];
                }
            }
        }
        System.out.println(sum / 2); // because each is added twice
        System.out.println(System.currentTimeMillis() - t);
    }
}