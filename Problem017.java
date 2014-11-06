import java.util.HashMap;

/******************************************************************************
 * Mark Tengi
 * Written: Jul 22, 2013
 * 
 * Project Euler: Problem017 - Number letter counts
 * 
 * 
 * If the numbers 1 to 5 are written out in words: one, two, three, four, five,
 * then there are 3 + 3 + 5 + 4 + 4 = 19 letters used in total.
 * 
 * If all the numbers from 1 to 1000 (one thousand) inclusive were written out
 * in words, how many letters would be used?
 * 
 * 
 * NOTE: Do not count spaces or hyphens. For example, 342 (three hundred and
 * forty-two) contains 23 letters and 115 (one hundred and fifteen) contains 20
 * letters. The use of "and" when writing out numbers is in compliance with
 * British usage.
 * 
 * 
 * Answer: 21124
 * 
 *****************************************************************************/

public class Problem017 {
    public static void main(String[] args) {
        long t = System.currentTimeMillis();
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        map.put(0, 0);
        map.put(1, 3);
        map.put(2, 3);
        map.put(3, 5);
        map.put(4, 4);
        map.put(5, 4);
        map.put(6, 3);
        map.put(7, 5);
        map.put(8, 5);
        map.put(9, 4);
        map.put(10, 3);
        map.put(11, 6);
        map.put(12, 6);
        map.put(13, 8);
        map.put(14, 8);
        map.put(15, 7);
        map.put(16, 7);
        map.put(17, 9);
        map.put(18, 8);
        map.put(19, 8);
        map.put(20, 6);
        map.put(30, 6);
        map.put(40, 5);
        map.put(50, 5);
        map.put(60, 5);
        map.put(70, 7);
        map.put(80, 6);
        map.put(90, 6);

        int sum = 0;
        for (int i = 1; i < 1000; i++) {
            int numcost = 0;
            // and
            if (i > 100 && i % 100 != 0) {
                numcost += 3;
            }
            if (i >= 100) {
                numcost += map.get(i / 100);
                numcost += 7; // hundred
            }
            // teens
            if (i % 100 >= 10 && i % 100 < 20) {
                numcost += map.get(i % 100);
            } else {
                numcost += map.get(i % 10); // ones
                numcost += map.get(((i % 100) / 10) * 10); // tens
            }
            System.out.println(i + "\t" + numcost);
            sum += numcost;
        }
        sum += 11; // 1000
        System.out.println(sum);
        System.out.println(System.currentTimeMillis() - t);
    }
}