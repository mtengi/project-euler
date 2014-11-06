/******************************************************************************
 * Mark Tengi
 * Written: Jun 23, 2013
 * 
 * Project Euler: Problem081 - **TITLE**
 * 
 * 
 * **DESCRIPTION GOES HERE**
 * 
 * 
 * Answer: 
 * 
 *****************************************************************************/

public class Problem081 {
    public static void main(String[] args) {
        int sideLength = 80;
        In file = new In("matrix.txt");
        int[][] sums = new int[sideLength][sideLength];

        for (int i = 0; i < sideLength; i++) {
            String[] line = file.readLine().split(",");
            for (int j = 0; j < sideLength; j++) {
                sums[i][j] = Integer.parseInt(line[j]);
            }
        }
        for (int i = sideLength - 1; i > 0; i--) {
            sums[sideLength - 1][i - 1] += sums[sideLength - 1][i];
            sums[i - 1][sideLength - 1] += sums[i][sideLength - 1];
        }
        for (int i = sideLength - 2; i >= 0; i--) {
            sums[i][i] += Math.min(sums[i + 1][i], sums[i][i + 1]);
            for (int j = i - 1; j >= 0; j--) {
                sums[i][j] += Math.min(sums[i + 1][j], sums[i][j + 1]);
                sums[j][i] += Math.min(sums[j + 1][i], sums[j][i + 1]);
            }
        }
        System.out.println(sums[0][0]);
    }
}