import java.io.*;
import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class Day5_CopyOnWriteArrayList {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // empty list
        CopyOnWriteArrayList<Integer> c1 = new CopyOnWriteArrayList<Integer>();

        // from another collection
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 7, 8, 9, 99, 121);
        CopyOnWriteArrayList<Integer> c2 = new CopyOnWriteArrayList<Integer>(list);

        // interface as reference
        List<Integer> c3 = new CopyOnWriteArrayList<Integer>();

        // add elements
        c1.add(1);
        c1.add(2);
        c1.add(3);
        c1.add(4);

        // add collection
        c2.addAll(c1);

        // add unique elements from collection only
        c1.addAllAbsent(c1);

        // access elements
        c2.get(1);
        c2.set(3,553);

        // remove from index
        c2.remove(4);

        // remove the element
        c2.remove(Integer.valueOf(121));

        // remove collection interface
        c2.removeAll(list);
        c2.retainAll(list);

        // search for element
        c1.indexOf(1);

        // last index of element
        c1.lastIndexOf(1);

        // iterator
        Iterator<Integer> it = c2.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // ListIterator
        ListIterator<Integer> lit1 = c2.listIterator();
        while (lit1.hasNext()) {
            System.out.println(lit1.next());
        }

        ListIterator<Integer> lit2 = c2.listIterator(c2.size());
        while (lit2.hasPrevious()) {
            System.out.println(lit2.previous());
        }
     }
}
