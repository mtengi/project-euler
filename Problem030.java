/******************************************************************************
 * Mark Tengi
 * Written: Jul 23, 2013
 * 
 * Project Euler: Problem030 - **TITLE**
 * 
 * 
 * **DESCRIPTION GOES HERE**
 * 
 * 
 * Answer: 
 * 
 *****************************************************************************/

public class Problem030 {
    public static void main(String[] args) {
        int power = 5;
        int[] powers = new int[10];
        for (int i = 0; i < powers.length; i++) {
            powers[i] = (int) Math.pow(i, power);
        }
        for(int i : powers) {
            System.out.println(i);
        }
    }
}
