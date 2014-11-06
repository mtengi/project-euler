/******************************************************************************
 * Mark Tengi
 * Written: Jun 24, 2013
 * 
 * Project Euler: Problem083 - **TITLE**
 * 
 * 
 * **DESCRIPTION GOES HERE**
 * 
 * 
 * Answer: 
 * 
 *****************************************************************************/

public class Problem083 {
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
    }
}
