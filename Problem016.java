/******************************************************************************
 * Mark Tengi
 * Written: Jul 20, 2013
 * 
 * Project Euler: Problem016 - Power digit sum
 * 
 * 
 * 2^15 = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.
 * 
 * What is the sum of the digits of the number 2^1000?
 * 
 * 
 * Answer: 
 * 
 *****************************************************************************/

public class Problem016 {
    public static void main(String[] args) {
        double pow = Math.pow(2, 1000);
        int sum=0;
        while(pow>=1) {
            sum+=pow%10;
            pow/=10;
        }
        System.out.println(sum);
    }
}
