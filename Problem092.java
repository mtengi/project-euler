/******************************************************************************
 * Mark Tengi
 * Written: Jun 23, 2013
 * 
 * Project Euler: Problem092 - Square digit chains
 * 
 * 
 * A number chain is created by continuously adding the square of the digits in
 * a number to form a new number until it has been seen before.
 * 
 * For example,
 * 
 * 44 → 32 → 13 → 10 → 1 → 1
 * 85 → 89 → 145 → 42 → 20 → 4 → 16 → 37 → 58 → 89
 * 
 * Therefore any chain that arrives at 1 or 89 will become stuck in an endless
 * loop. What is most amazing is that EVERY starting number will eventually
 * arrive at 1 or 89.
 * 
 * How many starting numbers below ten million will arrive at 89?
 * 
 * 
 * Answer: 8581146
 * 
 *****************************************************************************/

public class Problem092 {
    static int max = 10000000;
    static int biggest = 570;
    static int[] next = new int[max + 1];
    static boolean[] reaches89 = new boolean[biggest];

    public static void main(String[] args) {
        long t = System.currentTimeMillis();
        for (int i = 1; i <= max; i++) {
            int j = i;
            do {
                next[i] += (j % 10) * (j % 10);
                j /= 10;
            } while (j > 0);
        }
        for (int i = 1; i < biggest; i++) {
            reaches89[i] = check(i);
        }
        int count = 0;
        for (int i = 1; i < max; i++) {
            if (reaches89[next[i]]) {
                count++;
            }
        }
        System.out.println(count);
        System.out.println(System.currentTimeMillis() - t);
    }

    public static boolean check(int i) {
        if (i == 1) {
            return false;
        }
        if (i == 89 || (i <= biggest && reaches89[i])) {
            return true;
        }
        reaches89[i] = check(next[i]);
        return reaches89[i];
    }
}