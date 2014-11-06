import java.util.Arrays;

/******************************************************************************
 * Mark Tengi
 * Written: Jun 24, 2013
 * 
 * Project Euler: Problem082 - **TITLE**
 * 
 * 
 * **DESCRIPTION GOES HERE**
 * 
 * 
 * Answer: 
 * 
 *****************************************************************************/

public class Problem082 {
    public static void main(String[] args) {
        int sideLength = 80;
        In file = new In("matrix.txt");
        int[][] master = new int[sideLength][sideLength];

        for (int i = 0; i < sideLength; i++) {
            String[] line = file.readLine().split(",");
            for (int j = 0; j < sideLength; j++) {
                master[i][j] = Integer.parseInt(line[j]);
            }
        }
        for (int row = 0; row < sideLength; row++) {
            int[][] sums = Arrays.copyOf(master, master.length);
            for (int i = sideLength - 2; i >= 0; i--) {
                for (int j = row, dist = sums[i+1][j]; j >= 0; j--) {
                    
                }
                for (int j = row + 1; j < sideLength; j++) {

                }
            }
        }
    }
}
