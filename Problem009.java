/******************************************************************************
 * Mark Tengi
 * Written: May 29, 2013
 * 
 * Project Euler: Problem009 - Special Pythagorean triplet
 * 
 * 
 * A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
 * 
 * a^2 + b^2 = c^2
 * 
 * For example, 3^2 + 4^2 = 9 + 16 = 25 = 5^2.
 * 
 * There exists exactly one Pythagorean triplet for which a + b + c = 1000.
 * Find the product abc.
 * 
 * 
 * Answer: 
 * 
 *****************************************************************************/

public class Problem009 {
    public static void main(String[] args) {
        long t = System.currentTimeMillis();
        int sum = 1000;
        long checked = 0;
        for (int a = 1; a < sum / 3; a++) {
            for (int b = a + 1; b < sum / 2; b++) {
                checked++;
                double c = Math.sqrt(a * a + b * b);
                if(a+b+c>sum) {
                    break;
                }
                if (a + b + c == sum) {
                    System.out.println(a + " * " + b + " * " + (int) c + " = "
                            + a * b * (int) c);
                    a = sum;
                }
            }
        }
        System.out.println(System.currentTimeMillis() - t);
        System.out.println(checked);
    }
}