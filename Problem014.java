/******************************************************************************
 * Mark Tengi
 * Written: May 7, 2013
 * 
 * Project Euler: Problem014 - Longest Collatz sequence
 * 
 * 
 * The following iterative sequence is defined for the set of positive integers:
 * 
 * n -> n/2 (n is even)
 * n -> 3n + 1 (n is odd)
 * 
 * Using the rule above and starting with 13, we generate the following sequence:
 * 
 * 13 -> 40 -> 20 -> 10 -> 5 -> 16 -> 8 -> 4 -> 2 -> 1
 * It can be seen that this sequence (starting at 13 and finishing at 1) contains
 * 10 terms. Although it has not been proved yet (Collatz Problem), it is thought
 * that all starting numbers finish at 1.
 * 
 * Which starting number, under one million, produces the longest chain?
 * 
 * NOTE: Once the chain starts the terms are allowed to go above one million.
 * 
 * 
 * Answer: 837799
 * 
 *****************************************************************************/

public class Problem014 {
    /**
     * Recursively apply the function until we find a number whose path length
     * to 1 we already know. Then cache all found values all the way up the call
     * stack
     */
    public static int condense(int[] lengths, long i) {
        if (i < lengths.length && lengths[(int) i] > 0) {
            return lengths[(int) i];
        }
        if (i % 2 == 0) {
            int length = condense(lengths, i / 2) + 1;
            if (i / 2 < lengths.length) {
                lengths[(int) i / 2] = length;
            }
            return length;
        } else {
            int length = condense(lengths, 3 * i + 1) + 1;
            if (3 * i + 1 < lengths.length) {
                lengths[3 * (int) i + 1] = length;
            }
            return length;
        }
    }

    public static void main(String[] args) {
        long t=System.currentTimeMillis();
        int n = 999999;
        int[] lengths = new int[n + 1];
        lengths[1] = 1;
        int longest = 0;
        for (int i = 2; i <= n; i++) {
            lengths[i] = condense(lengths, i);
            if (lengths[i] > lengths[longest]) {
                longest = i;
            }
        }
        System.out.println(longest);
        System.out.println(System.currentTimeMillis()-t);
    }
}