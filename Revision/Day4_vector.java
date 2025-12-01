import java.io.*;
import java.util.*;

public class Day4_vector {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(
                5, 10, 15, 20, 25, 30, 35, 40, 45, 50,
                55, 60, 65, 70, 75, 80, 85, 90, 95, 100));

        // Vector declarations
        Vector<Integer> v1 = new Vector<Integer>();
        // capacity
        Vector<Integer> v2 = new Vector<Integer>(20);
        // capacity and increment
        Vector<Integer> v3 = new Vector<Integer>(20, 10);
        // from another collection
        Vector<Integer> v4 = new Vector<Integer>(numbers);

        // methods
        v4.add(22);
        v4.add(8, 11);
        v4.addAll(numbers);
        v4.addAll(3, numbers);
        v4.get(1);
        v4.set(1, 55);
        v4.firstElement();
        v4.lastElement();
        v4.remove(3); // index removal
        v4.remove(Integer.valueOf(44)); // element matching and removal
        v4.removeAll(numbers);
        v4.capacity();
        v4.ensureCapacity(80); // ensures this much capacity is present
        v4.trimToSize();
        v4.indexOf(33);
        v4.lastIndexOf(33);
        Iterator<Integer> it = v4.iterator();
        while (it.hasNext()) {
            it.next();
        }
        ListIterator<Integer> lit1 = v4.listIterator();
        while (lit1.hasNext()) {
            lit.next();
        }
        ListIterator<Integer> lit2 = v4.ListIterator(size() - 1);
        while (lit2.hasPrevious()) {
            lit2.previous();
        }
        v4.clear();

        System.out.println(v4);
    }
}
