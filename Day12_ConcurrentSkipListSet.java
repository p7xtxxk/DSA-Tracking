
import java.io.*;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.NavigableSet;
import java.util.Comparator;
import java.util.ArrayList;

public class Day12_ConcurrentSkipListSet {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // declaration
        // general
        ConcurrentSkipListSet<Integer> c1 = new ConcurrentSkipListSet<Integer>();
        // comparator - custom or natural
        Comparator<Integer> comp = new Comparator<Integer>() {
            public int compare(Integer a, Integer b) {
                if (a % 10 > b % 10)
                    return -1;
                if (a % 10 > b % 10)
                    return 1;
                else
                    return 0;
            }
        };
        ConcurrentSkipListSet<Integer> c2 = new ConcurrentSkipListSet<Integer>(comp);
        ConcurrentSkipListSet<Integer> c3 = new ConcurrentSkipListSet<Integer>(Comparator.reverseOrder());
        // from another collection
        ConcurrentSkipListSet<Integer> c4 = new ConcurrentSkipListSet<Integer>(List.of(1,2,3,4,5,6,6,7,7,8,8,88,8));
        System.out.println(c4);
        // navigable set interface
        NavigableSet<Integer> c5 = new ConcurrentSkipListSet<Integer>();
    }
}
