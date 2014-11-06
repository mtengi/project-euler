import java.util.Iterator;

/******************************************************************************
 * Mark Tengi
 * Written: Jul 23, 2013
 * 
 * Project Euler: Problem079 - **TITLE**
 * 
 * 
 * **DESCRIPTION GOES HERE** USE THAT DEPENDENCY TREE WITH DIJKSTRA'S ALGO
 * 
 * 
 * Answer: 73162890
 * 
 *****************************************************************************/

public class Problem079 {
    public static void main(String[] args) {
        In nums = new In("keylog.txt");
        int[] first = new int[10];
        int[] second = new int[10];
        int[] third = new int[10];
        int[][] following = new int[10][10];
        int[][] follows=new int[10][10];
        LinkedList[] adjList=new LinkedList[10];
        for(int i=0; i<10; i++) {
            adjList[i]=new LinkedList();
        }
        while (!nums.isEmpty()) {
            String num = nums.readLine();
            int[] ints=new int[3];
            int i=0;
            for(char c : num.toCharArray()) {
                ints[i++]=Integer.parseInt(c+"");
            }
            first[Integer.parseInt(num.substring(0, 1))]++;
            second[Integer.parseInt(num.substring(1, 2))]++;
            third[Integer.parseInt(num.substring(2, 3))]++;
            following[Integer.parseInt(num.substring(0, 1))][Integer
                    .parseInt(num.substring(1, 2))]++;
            following[Integer.parseInt(num.substring(1, 2))][Integer
                    .parseInt(num.substring(2, 3))]++;
            follows[Integer.parseInt(num.substring(2,3))][Integer.parseInt(num.substring(1,2))]++;
            follows[Integer.parseInt(num.substring(1,2))][Integer.parseInt(num.substring(0,1))]++;
            adjList[ints[0]].insert(ints[1]);
            adjList[ints[1]].insert(ints[2]);
        }
        System.out.print("\t");
        for (int i = 0; i < 10; i++) {
            System.out.print(i + "\t");
        }
        System.out.print("\nfirst:\t");
        for (int i = 0; i < 10; i++) {
            System.out.print(first[i] + "\t");
        }
        System.out.print("\nsecond:\t");
        for (int i = 0; i < 10; i++) {
            System.out.print(second[i] + "\t");
        }
        System.out.print("\nthird:\t");
        for (int i = 0; i < 10; i++) {
            System.out.print(third[i] + "\t");
        }
        
      //following
        System.out.println("\n\n\n");

        System.out.print("\t");
        for (int i = 0; i < 10; i++) {
            System.out.print(i + "\t");
        }
        System.out.println();
        for (int i = 0; i < 10; i++) {
            System.out.print(i+"\t");
            for (int j = 0; j < 10; j++) {
                System.out.print(following[i][j]+"\t");
            }
            System.out.println();
        }
        
      //follows
        System.out.println("\n\n\n");

        System.out.print("\t");
        for (int i = 0; i < 10; i++) {
            System.out.print(i + "\t");
        }
        System.out.println();
        for (int i = 0; i < 10; i++) {
            System.out.print(i+"\t");
            for (int j = 0; j < 10; j++) {
                System.out.print(follows[i][j]+"\t");
            }
            System.out.println();
        }
        
        //adjlist
        
        //compress
        for(int i=0; i<10; i++) {
            for (int j : adjList[i]) {
                
            }
        }
        
        System.out.println();
        for (int i=0; i<10; i++) {
            System.out.println(i+"\t"+adjList[i]);
        }
    }

    private static class LinkedList implements Iterable<Integer>{
        Node root = null;
        Node last = root;
        int len = 0;

        public void insert(int i) {
            if (root == null) {
                root = new Node(i);
                last = root;
                len++;
                return;
            }
            if (!contains(i)) {
                last.next = new Node(i);
                last = last.next;

                len++;
            }
        }

        public int[] get() {
            int[] vals = new int[len];
            Node n = root;
            int i = 0;
            while (n != null) {
                vals[i++] = n.val;
                n = n.next;
            }
            return vals;
        }

        public boolean contains(int c) {
            Node n = root;
            while (n != null) {
                if (n.val == c) {
                    return true;
                }
                n = n.next;
            }
            return false;
        }
        
        public Iterator<Integer> iterator(){
            return new Iterator<Integer>() {
                Node n=root;

                @Override
                public boolean hasNext() {
                    return n!=null && n.next!=null;
                }

                @Override
                public Integer next() {
                    int i=n.val;
                    n=n.next;
                    return i;
                }

                @Override
                public void remove() {
                    // TODO Auto-generated method stub
                    
                }
            };
        }
        
        public String toString() {
            StringBuilder sb=new StringBuilder();
            for (int n : get()) {
                sb.append(n+" -> ");
            }
            return sb.toString();
        }

        private class Node {
            int val;
            Node next;

            Node(int val) {
                this.val = val;
                // this.next = next;
            }
        }
    }
}
