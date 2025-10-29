import java.io.*;
import java.util.List;
import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class Day10_LinkedHashSet {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Set<String> hs = new HashSet<>();
        hs.add("Apple");
        hs.add("Banana");
        hs.add("Cherry");
        System.out.println(hs);
        // Output : [Apple, Cherry, Banana] and it can be something else too

        // maintains insertion order
        Set<String> lhs = new LinkedHashSet<>();
        lhs.add("Apple");
        lhs.add("Banana");
        lhs.add("Cherry");
        System.out.println(lhs);
        // [Apple, Banana, Cherry]

        // declaration
        // general
        Set<Integer> lhs1 = new LinkedHashSet<Integer>();
        // capacity intiial
        Set<Integer> lhs2 = new LinkedHashSet<Integer>(55);
        // capacity intiial + loadfactor
        Set<Integer> lhs3 = new LinkedHashSet<Integer>(55, .8f);
        // collection
        Set<Integer> lhs4 = new LinkedHashSet<Integer>(List.of(1,23,42,53,2,442,35,34,2,62,24,523,23121));

        // add element
        lhs4.add(212121);
        lhs4.addAll(List.of(55,66,777,334,2323,2352,34));

        // remove 
        lhs4.remove(212121);
        lhs4.removeAll(List.of(55, 66, 777, 334, 2323, 2352, 34));

        // retain 
        lhs4.retainAll(List.of(55, 66, 777, 334, 2323, 2352, 34));

        // contains
        lhs4.contains(232);
        lhs4.containsAll(List.of(55, 66, 777, 334, 2323, 2352, 34));

        // size
        lhs4.size();

        // isEmpty()
        lhs4.isEmpty();

        // iterator
        Iterator<Integer> it = lhs4.iterator();
        while(it.hasNext()) {
            it.next();
        }

        // to object 
        Object[] object = lhs4.toArray();

        // to typed array
        Integer[] array = lhs4.toArray(new Integer[0]);

        // hashCode
        Set<Integer> lhs5 = new LinkedHashSet<Integer>(List.of(1, 23, 42, 53, 2, 442, 35, 34, 2, 62, 24, 523, 23121));
        System.out.println(lhs5.hashCode());
        
        // clear the linked hash set
        lhs4.clear();
    }
}
