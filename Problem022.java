import java.util.Arrays;
import java.util.LinkedList;

/******************************************************************************
 * Mark Tengi
 * Written: Jul 23, 2013
 * 
 * Project Euler: Problem022 - Names scores
 * 
 * 
 * Using names.txt, a 46K text file containing over five-thousand first names,
 * begin by sorting it into alphabetical order. Then working out the
 * alphabetical value for each name, multiply this value by its alphabetical
 * position in the list to obtain a name score.
 * 
 * For example, when the list is sorted into alphabetical order, COLIN, which is
 * worth 3 + 15 + 12 + 9 + 14 = 53, is the 938th name in the list. So, COLIN
 * would obtain a score of 938 × 53 = 49714.
 * 
 * What is the total of all the name scores in the file?
 * 
 * 
 * Answer: 871198282
 * 
 *****************************************************************************/

public class Problem022 {
    public static void main(String[] args) {
        long t=System.currentTimeMillis();
        String nameList = new In("names.txt").readAll();
        LinkedList<String> names = new LinkedList<String>();
        int start = 1, end = 0;
        while (start < nameList.length() - 1) {
            end = nameList.indexOf("\"", start + 1);
            names.add(nameList.substring(start, end));
            start = end + 3;
        }
        String[] array = names.toArray(new String[] {});
        Arrays.sort(array);
        long sum = 0;
        for (int i = 0; i < array.length; i++) {
            String s = array[i];
            for (int j = 0; j < s.length(); j++) {
                sum += (s.charAt(j) - 64) * (i + 1);
            }
        }
        System.out.println(sum);
        System.out.println(System.currentTimeMillis()-t);
    }
}