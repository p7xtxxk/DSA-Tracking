
import java.io.*;
import java.util.Set;
import java.util.List;
import java.util.ArrayList;
import java.util.NavigableSet;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.SortedSet;
import java.util.Comparator;
import java.util.Iterator;
import java.util.concurrent.ConcurrentSkipListSet;

public class Day11_NavigableSet {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // declaration - uses treeset or concurrentskiplistset
        // common
        NavigableSet<String> n1 = new TreeSet<String>();
        // comparator
        NavigableSet<String> n2 = new TreeSet<String>(Comparator.reverseOrder());
        Comparator<String> comp1 = new Comparator<String>(){
            public int compare(String a, String b) {
                if(a.length()%3 > b.length()%3) return -1;
                else if(a.length()%3 < b.length()%3) return 1;
                else return 0;
            }
        };
        NavigableSet<String> n3 = new TreeSet<String>(comp1);
        // another collection
        NavigableSet<String> n4 = new TreeSet<String>(List.of("banana","apple",  "cherry", "elderberry", "date"));
        // another navigable set
        NavigableSet<String> n5 = new TreeSet<String>(n3);
        // thread safe
        NavigableSet<String> n6 = new ConcurrentSkipListSet<String>();
        // thread safe with custom comparator
        NavigableSet<String> n7 = new ConcurrentSkipListSet<String>(Comparator.reverseOrder());
        NavigableSet<String> n8 = new ConcurrentSkipListSet<String>(comp1);

        n4.addAll(List.of("chicken", "mutton", "tandoor", "sandwich", "bhatore", "rice", "pulao", "schezwan"));

        // Navigation methods
        System.out.println(n4.lower("cherry")); // greatest element less than 
        System.out.println(n4.higher("cherry")); // smallest element greater than
        System.out.println(n4.ceiling("cherry")); // greatest element less than or the same element if exists - consider the element like a ceiling; we need just below the ceiling
        System.out.println(n4.floor("cherry")); // smallest element less than or the same element if exists - consider the element like a floor; we need above the floor 
        System.out.println(n4.pollFirst()); // first element
        System.out.println(n4.pollLast()); // last element
        Set<String> temp = n4.descendingSet(); // eturns a descending ordered SET
        System.out.println(temp);
        // returns a descending iterator
        Iterator<String> dit = n4.descendingIterator();
        while(dit.hasNext()) {
            System.out.println(dit.next());
        }
        System.out.println("----------------");
        // inclusivity variation
        System.out.println(n4.subSet("banana",false, "pulao", false));
        // equivalent to non inclusivity variation
        System.out.println(n4.subSet("banana",true, "pulao", false));
        // non inclusivity variation
        System.out.println(n4.subSet("apple", "pulao"));

        System.out.println(n4.headSet("bhatore", false));
        System.out.println(n4.headSet("bhatore"));
        System.out.println(n4.tailSet("chole", true));
        System.out.println(n4.tailSet("chole"));

        System.out.println(n4.comparator());
        System.out.println(n4.first());
        System.out.println(n4.last());
        
    }
}
