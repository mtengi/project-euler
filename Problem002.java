/******************************************************************************
 * Mark Tengi
 * Written: May 4, 2013
 * 
 * Project Euler: Problem002 - Even Fibonacci numbers
 * 
 * 
 * Each new term in the Fibonacci sequence is generated by adding the previous
 * two terms. By starting with 1 and 2, the first 10 terms will be:
 * 
 * 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
 * 
 * By considering the terms in the Fibonacci sequence whose values do not exceed
 * four million, find the sum of the even-valued terms.
 * 
 * 
 * Answer: 4613732
 * 
 *****************************************************************************/
public class Problem002 {
    public static void main(String[] args) {
        // switch between these two when storing terms of the series
        int[] sums = new int[2];
        sums[0] = 1;
        int max = 4000000, evensum = 0;
        // sum the two terms we have stored in sums, and store these alternately
        // in sums[0] and sums[1]
        for (int i = 0; sums[i % 2] <= max; i++) {
            sums[i % 2] += sums[(i + 1) % 2];
            if (sums[i % 2] % 2 == 0) {
                evensum += sums[i % 2];
            }
        }
        System.out.println(evensum);
    }
}