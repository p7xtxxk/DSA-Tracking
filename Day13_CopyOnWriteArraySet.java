
import java.io.*;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.Comparator;
import java.util.Set;
import java.util.HashSet;
import java.util.List;

public class Day13_CopyOnWriteArraySet {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // declarations
        // general
        CopyOnWriteArraySet<Integer> a = new CopyOnWriteArraySet<Integer>();
        // from another collections
        CopyOnWriteArraySet<Integer> b = new CopyOnWriteArraySet<Integer>(List.of(1,2,3,4,5,6,7,77,7,777,7,7,7,7,77,76));
        // from another set
        Set<Integer> temp = new HashSet<Integer>();
        temp.addAll(List.of(1,2,3,4,5,6,7,77,7,777,7,7,7,7,77,76));
        CopyOnWriteArraySet<Integer> d = new CopyOnWriteArraySet<Integer>(temp);
        // System.out.println(d);

        // methods
        // same as sets and collections utility
    }
}
