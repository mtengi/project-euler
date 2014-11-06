/******************************************************************************
 * Mark Tengi
 * Written: Jul 22, 2013
 * 
 * Project Euler: Problem019 - Counting Sundays
 * 
 * 
 * You are given the following information, but you may prefer to do some
 * research for yourself.
 * 
 * 1 Jan 1900 was a Monday.
 * Thirty days has September,
 * April, June and November.
 * All the rest have thirty-one,
 * Saving February alone,
 * Which has twenty-eight, rain or shine.
 * And on leap years, twenty-nine.
 * A leap year occurs on any year evenly divisible by 4, but not on a century
 * unless it is divisible by 400.
 * 
 * How many Sundays fell on the first of the month during the twentieth century
 * (1 Jan 1901 to 31 Dec 2000)?
 * 
 * 
 * Answer: 
 * 
 *****************************************************************************/

public class Problem019 {
    public static void main(String[] args) {
        int[] days = new int[] { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        int count = 0, daysPassed = 0, monthsPassed = 0, yearsPassed = 0;
        while (yearsPassed <= 100) {
            if ((daysPassed + 1) % 7 == 0) {
                count++;
            }
            daysPassed += days[monthsPassed];
            monthsPassed++;
            if (monthsPassed == 12) {
                yearsPassed++;
                monthsPassed = 0;
                System.out.println(daysPassed);
            }
            // leap years
            if (monthsPassed == 1 && yearsPassed % 4 == 0
                    && (yearsPassed % 100 != 0 || yearsPassed % 400 == 0)) {
                daysPassed++;
            }
        }
        System.out.println(count);
    }
}