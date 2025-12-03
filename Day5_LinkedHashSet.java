import java.io.*;
import java.util.*;

public class Day5_LinkedHashSet {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(
                5, 10, 15, 20, 25, 30, 35, 40, 45, 50,
                55, 60, 65, 70, 75, 80, 85, 90, 95, 100));

        // declarations
        // basics
        LinkedHashSet<Integer> l1 = new LinkedHashSet<Integer>();
        // capacity
        LinkedHashSet<Integer> l2 = new LinkedHashSet<Integer>(20);
        // capacity + load factor
        LinkedHashSet<Integer> l3 = new LinkedHashSet<Integer>(20, 15);
        // another collection
        LinkedHashSet<Integer> l4 = new LinkedHashSet<Integer>(numbers);
        // anonymous inline declaration
        LinkedHashSet<Integer> l5 = new LinkedHashSet<Integer>() {
            {
                add(0);
                add(1);
                add(2);
                add(3);
                add(4);
                add(5);
                add(6);
                add(7);
                add(8);
                add(9);
            }
        };

        // methods
        l5.add(12);
        l5.addAll(numbers);
        l5.remove(12);
        l5.removeAll(numbers);
        l5.retainAll(numbers);
        l5.contains(5);
        l5.containsAll(numbers);
        l5.size();
        l5.isEmpty();
        l5.clear();
        Iterator<Integer> it = l5.iterator();
        while (it.hasNext()) {
            int curr = it.next();
            if (curr % 3 == 0)
                it.remove();
            System.out.println(curr);
        }

        System.out.println(l5);
    }
}