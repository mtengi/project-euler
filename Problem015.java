/******************************************************************************
 * Mark Tengi
 * Written: Jul 20, 2013
 * 
 * Project Euler: Problem015 - Lattice paths
 * 
 * 
 * Starting in the top left corner of a 2×2 grid, and only being able to move to
 * the right and down, there are exactly 6 routes to the bottom right corner.
 * 
 * How many such routes are there through a 20×20 grid?
 * 
 * 
 * Answer: 137846528820
 * 
 *****************************************************************************/

public class Problem015 {
    public static void main(String[] args) {
        long t = System.currentTimeMillis();
        int n = 20;
        long[][] paths = new long[n + 1][n + 1];
        for (int i = 0; i <= n; i++) {
            paths[0][i] = 1;
            paths[i][0] = 1;
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                paths[i][j] = paths[i - 1][j] + paths[i][j - 1];
            }
        }
        System.out.println(paths[n][n]);
        System.out.println(System.currentTimeMillis() - t);
    }
}