
import java.io.*;
import java.util.Set;
import java.util.Collections;
import java.util.SortedSet;
import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;
import java.util.NavigableSet;
import java.util.Iterator;

public class Day10_TreeSet {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> list = List.of(1,2,4,5,6,7,88,9,1100);

        // declaration
        // general
        Set<Integer> ts1 = new TreeSet<Integer>();
        // with a comparator
        Set<Integer> ts2 = new TreeSet<Integer>(Comparator.reverseOrder());
        Comparator<Integer> comp = new Comparator<Integer>(){
            public int compare(Integer a, Integer b) {
                return b-a;
            }
        };
        Set<Integer> ts3 = new TreeSet<Integer>(comp);
        // another collection
        Set<Integer> ts4 = new TreeSet<Integer>(list);
        // navigable set interface
        NavigableSet<Integer> ts5 = new TreeSet<Integer>(list);
        // sorted set
        SortedSet<Integer> ts6 = new TreeSet<Integer>(list);

        // methods practice
        // common to hashset, linkedhashset
        // add
        ts4.add(112);
        ts4.add(114);
        ts4.addAll(List.of(45,54,65,76,87,1212));
        // remove
        ts4.remove(3223);
        ts4.remove(45);
        ts4.removeAll(List.of(45,54,65,76,87,1212));
        // retain
        ts4.retainAll(List.of(45,54,65,76,87,1212));
        // size
        ts4.size();
        // empty check
        ts4.isEmpty();
        // iterator
        Iterator<Integer> it = ts4.iterator();
        while(it.hasNext()) {
            it.next();
        }
        // object conversion
        Object[] object = ts4.toArray();
        // typed array conversion
        Integer[] array = ts4.toArray(new Integer[0]);
        // for each 
        for (int a : ts4) {
            System.out.println(a);
        }
        // contain element
        ts4.contains(45);
        ts4.containsAll(list);
        // clone set
        Set<Integer> ts7 = new TreeSet<Integer>(ts4);

        // sortedSet methods
        // first element - lower element
        ts5.first();
        // last element - higher element
        ts5.last();
        // comparator
        Comparator<Integer> comp_new = new Comparator<Integer>() {
            public int compare(Integer a, Integer b) {
                return b-a;
            }
        };
        SortedSet<Integer> ts8 = new TreeSet<Integer>(comp_new);
            // if already a tree set and then want to resort 
        List<Integer> list1 = new ArrayList<Integer>(ts5);
        Collections.sort(list, comp_new); // print 
        // subset - returns a subset from - to elements in the sorted set 
        SortedSet<Integer> s1 = ts5.subSet(4,88);
        // headset - return elements smaller than or equal to
        SortedSet<Integer> s2 = ts5.headSet(66);
        // tailset - return elements greater than or equal to
        SortedSet<Integer> s3 = ts5.tailSet(2);

    }
}
