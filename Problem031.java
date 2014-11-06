/******************************************************************************
 * Mark Tengi
 * Written: Jun 29, 2013
 * 
 * Project Euler: Problem031 - Coin sums
 * 
 * 
 * In England the currency is made up of pound, £, and pence, p, and there are
 * eight coins in general circulation:
 * 
 * 1p, 2p, 5p, 10p, 20p, 50p, £1 (100p) and £2 (200p).
 * It is possible to make £2 in the following way:
 * 
 * 1x£1 + 1x50p + 2x20p + 1x5p + 1x2p + 3x1p
 * How many different ways can £2 be made using any number of coins?
 * 
 * 
 * Answer: 
 * 
 *****************************************************************************/

public class Problem031 {
    public static void main(String[] args) {
        int goal = 200;
        int[] coinValues = new int[] { 200, 100, 50, 20, 10, 5, 2, 1 };
        int[] waysToMakeTotals = new int[goal+1];
        for (int i = 0; i < coinValues.length; i++) {
            for (int j = coinValues[i]; j < waysToMakeTotals.length; j += coinValues[i]) {
                waysToMakeTotals[j]++;
            }
        }
        for (int i = 1; i<201; i++) {
            System.out.println(i+": "+waysToMakeTotals[i]);
        }
        int totalWays = 0;
    }
}
