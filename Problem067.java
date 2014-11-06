/******************************************************************************
 * Mark Tengi
 * Written: Jun 14, 2013
 * 
 * Project Euler: Problem067 - Maximum path sum II
 * 
 * 
 * By starting at the top of the triangle below and moving to adjacent numbers
 * on the row below, the maximum total from top to bottom is 23.
 * 
 *    3
 *   7 4
 *  2 4 6
 * 8 5 9 3
 * 
 * That is, 3 + 7 + 4 + 9 = 23.
 * 
 * Find the maximum total from top to bottom in triangle.txt, a 15K text file
 * containing a triangle with one-hundred rows.
 * 
 * 
 * Answer: 7273
 * 
 *****************************************************************************/

public class Problem067 {
    public static void main(String[] args) {
        int[][] rows = new int[100][];
        In file = new In("triangle.txt");
        for (int i = 0; i < rows.length; i++) {
            rows[i] = new int[i + 1];
            String[] nums = file.readLine().split(" ");
            for (int j = 0; j < nums.length; j++) {
                rows[i][j] = Integer.parseInt(nums[j]);
            }
        }
        for (int i = rows.length - 2; i >= 0; i--) {
            for (int j = 0; j < rows[i].length; j++) {
                rows[i][j] += Math.max(rows[i + 1][j], rows[i + 1][j + 1]);
            }
        }
        System.out.println(rows[0][0]);
    }
}