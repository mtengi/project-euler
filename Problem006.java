/******************************************************************************
 * Mark Tengi
 * Written: May 7, 2013
 * 
 * Project Euler: Problem006 - Sum square difference
 * 
 * 
 * The sum of the squares of the first ten natural numbers is,
 * 
 * 1^2 + 2^2 + ... + 10^2 = 385
 * 
 * The square of the sum of the first ten natural numbers is,
 * 
 * (1 + 2 + ... + 10)^2 = 55^2 = 3025
 * 
 * Hence the difference between the sum of the squares of the first ten natural
 * numbers and the square of the sum is 3025 - 385 = 2640.
 * 
 * Find the difference between the sum of the squares of the first one hundred
 * natural numbers and the square of the sum.
 * 
 * 
 * Answer: 25164150
 * 
 *****************************************************************************/

public class Problem006 {
    public static void main(String[] args) {
        int n = 100;
        int sumOfSquares = 0, sum = 0;
        for (int i = 1; i <= n; i++) {
            sumOfSquares += i * i;
            sum += i;
        }
        System.out.println(sum * sum - sumOfSquares);
    }
}