// Set basics 


import java.io.*;
import java.util.Set;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;
import java.util.List;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

public class Day10_SetBasics {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> list = List.of(88,66,44,33,22,54,12,5235,124,5234);
        // set declaration
        // set.of
        Set<Integer> set1 = Set.of(1,2,34,4,5,6,72,7,5,3,121);
        // hashset
        Set<Integer> set2 = new HashSet<Integer>();
        // linkedhashset
        Set<Integer> set3 = new LinkedHashSet<Integer>();
        // treeset
        Set<Integer> set4 = new TreeSet<Integer>();
        // copy on write array set 
        Set<Integer> set5 = new CopyOnWriteArraySet<Integer>();

        // add elements
        set1.add(122);
        set1.add(123);
        set1.add(124);

        // add all elements
        set1.addAll(list);

        // remove elements
        set1.remove(122);

        // remove all elements
        set1.remove(list);

        // retain all elements
        set1.retainAll(list);

        // element presence check
        set1.contains(7567);

        // size check
        set1.size();

        // empty check
        set1.isEmpty();
        
        // clear the set
        set1.clear();

        // iterators
        // normal iterator
        Iterator<Integer> it = set1.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }

        // descending iterator and ListIterator arent allowe
    }
}