/******************************************************************************
 * Mark Tengi
 * Written: May 4, 2013
 * 
 * Project Euler: Problem001 - Multiples of 3 and 5
 * 
 * 
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we
 * get 3, 5, 6 and 9. The sum of these multiples is 23.
 * 
 * Find the sum of all the multiples of 3 or 5 below 1000.
 * 
 * 
 * Answer: 233168
 * 
 *****************************************************************************/

public class Problem001 {
    public static void main(String[] args) {
        // generalize the solution for any a and b where gcf(a,b) == 1
        int a = 3, b = 5;
        int[] intervals = new int[a + b - 1];

        // find all the multiples of either a or b
        for (int i = 1, j = 0; i <= a * b; i++) {
            if (i % a == 0 || i % b == 0) {
                intervals[j++] = i;
            }
        }
        // find the intervals between multiples of a and b
        for (int i = 1, sum = 0; i < intervals.length; i++) {
            sum += intervals[i - 1];
            intervals[i] -= sum;
        }

        // for a = 3 and b = 5, intervals = { 3, 2, 1, 3, 1, 2, 3 }, which are
        // the intervals between multiples of 3 or 5 (0 -> 3 -> 5 -> 6 -> 9...)
        
        int sum = 0, max = 1000;
        // move i between all the multiples of either a or b
        for (int i = 0, j = 0; i < max; i += intervals[(j++) % intervals.length]) {
            sum += i;
        }
        System.out.println(sum);
    }
}