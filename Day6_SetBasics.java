import java.io.*;
import java.util.*;
import java.util.concurrent.*;

public class Day6_SetBasics {
    public static void main(String args[]) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // Types of set:
        // 1. Set.of()
        // 2. HashSet
        // 3. LinkedHashSet
        // 4. TreeSet
        // 5. SortedSet
        // 6. CopyOnWriteArraySet
        // 7. EnumSet

        // immutable set
        Set<Integer> set1 = Set.of(1,2,4,5,95,7);

        // hashset
        Set<Integer> set2 = new HashSet<Integer>(set1);

        // linkedhashset
        Set<Integer> set3 = new LinkedHashSet<Integer>(set2);

        // TreeSet
        Set<Integer> set4 = new TreeSet<Integer>(set3);

        // copy on write array set
        Set<Integer> set5 = new CopyOnWriteArraySet<Integer>(set4);
        set5.add(null);
        set5.add(null);
        set5.add(null);
        set5.add(null);
        // output:[1, 2, 4, 5, 7, 95, null]


        // HashSet
        Set<Integer> h1 = new HashSet<Integer>();
        Set<Integer> h2 = new HashSet<Integer>(10);
        Set<Integer> h3 = new HashSet<Integer>(10,55);
        Set<Integer> h4 = new HashSet<Integer>(set5);
        System.out.println(set5);
    }
}
