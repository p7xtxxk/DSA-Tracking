import java.io.*;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class Day11_SortedSet {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // declaration
        // natural ordering
        SortedSet<Integer> s1 = new TreeSet<Integer>();
        // with a comparator
        SortedSet<Integer> s2 = new TreeSet<Integer>(Comparator.reverseOrder());
        Comparator<Integer> comp = new Comparator<Integer>() {
            public int compare(Integer a, Integer b) {
                if (a % 10 > b % 10)
                    return 1;
                else if (a % 10 == b % 10)
                    return 0;
                else
                    return -1;
            }
        };
        SortedSet<Integer> s3 = new TreeSet<Integer>(comp);
        // another collection
        SortedSet<Integer> s4 = new TreeSet<Integer>(
                List.of(1, 2, 3, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 35, 36, 37, 38, 40));
        // another sortedset
        SortedSet<Integer> s5 = new TreeSet<Integer>(s4);

        // methods implementation
        // comparator
        System.out.println(s1.comparator());
        System.out.println(s2.comparator());
        System.out.println(s3.comparator());
        System.out.println(s4.comparator());
        System.out.println(s5.comparator());

        // first - lowest element
        s5.first();
        // last - highest element
        s5.last();
        // subset
        System.out.println(s5.subSet(1, 7));
        // headset
        System.out.println(s5.headSet(50));
        // tailset
        System.out.println(s5.tailSet(4));

        for (int x : s5) {
            x++;
        }
        

        // safe removal practice-1
        Iterator<Integer> it = s5.iterator();
        while(it.hasNext()) {
            Integer x = it.next();
            if(x%2 == 0) it.remove();
        }
        // safe removal practice-2
        s5.removeIf(x -> x%2==0);
        System.out.println(s5);
    }
}
