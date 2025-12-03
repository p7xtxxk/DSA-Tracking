import java.io.*;
import java.util.*;

public class Day5_treeSet {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(
                5, 10, 15, 20, 25, 30, 35, 40, 45, 50,
                55, 60, 65, 70, 75, 80, 85, 90, 95, 100));

        // declarations
        // basics
        TreeSet<Integer> t1 = new TreeSet<Integer>();
        // polymorphic declarations
        // sortedset
        SortedSet<Integer> t2 = new TreeSet<Integer>();
        // navigableset
        NavigableSet<Integer> t3 = new TreeSet<Integer>();
        // from another collection
        TreeSet<Integer> t4 = new TreeSet<Integer>(numbers);
        // using custom comparator
        Comparator<Integer> comp = new Comparator<Integer>() {
            public int compare(Integer a, Integer b) {
                return a % 10 - b % 10;
            }
        };
        TreeSet<Integer> t5 = new TreeSet<Integer>(comp);
        // using comparator from Comparator class
        TreeSet<Integer> t6 = new TreeSet<Integer>(Comparator.reverseOrder());
        // inline anonymous
        TreeSet<Integer> t7 = new TreeSet<Integer>() {
            {
                add(1);
                add(2);
                add(3);
                add(4);
                add(5);
                add(6);
                add(7);
                add(8);
                add(9);
                add(0);
            }
        };

        // methods
        t7.add(12);
        t7.addAll(numbers);
        t7.remove(5);
        t7.contains(3344);
        t7.containsAll(numbers);
        t7.retainAll(numbers);
        t7.first();
        t7.last();

        // subset
        System.out.println(t7.subSet(2, 8));
        // headSet
        System.out.println(t7.headSet(4));
        // tailSet
        System.out.println(t7.tailSet(4));

        // lower returns the element strictly less than input
        System.out.println(t7.lower(5));
        // higer returns the element strictly higher than input
        System.out.println(t7.higher(5));
        // floor return the element less than or equal to the input
        System.out.println(t7.floor(5));
        // ceiling return the element greater than or equal to the input
        System.out.println(t7.ceiling(5));

        Integer[] arr = t7.toArray(new Integer[0]);

        t7.removeAll(numbers);
        t7.isEmpty();
        t7.clear();
    }
}