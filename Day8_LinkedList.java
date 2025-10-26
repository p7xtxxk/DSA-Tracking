
import java.io.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.Collection;

public class Day8_LinkedList {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // declaration
        // direct - linkedlist - preferred
        LinkedList<Integer> ll1 = new LinkedList<Integer>();
        // implementing list interface
        List<Integer> ll2 = new LinkedList<Integer>();
        // implementing via Queue interface
        Queue<Integer> ll3 = new LinkedList<Integer>();
        // implementing via Deque interface
        Deque<Integer> ll4 = new LinkedList<Integer>();

        // list methods for LinkedList

        // add elements
        ll1.add(120);
        ll1.add(137);
        ll1.add(1333);
        ll1.add(1332);
        ll1.add(132);
        ll1.add(123);
        ll1.add(131);
        ll1.add(132);
        ll1.add(143);
        ll1.add(43);
        ll1.add(23);
        ll1.add(1);
        ll1.add(1, 43);

        // access element
        ll1.get(12);

        // access and set element
        ll1.set(4,566);

        // remove element
        // by index
        ll1.remove(12);

        // by id
        ll1.remove(Integer.valueOf(23));

        // size
        ll1.size();

        // contains element
        ll1.contains(1234);
        ll1.contains(1333);

        // index of element
        ll1.indexOf(1234);

        // last index
        ll1.lastIndexOf(1333);

        // clear all elements
        ll1.clear();

        // empty check
        ll1.isEmpty();

        // --------------------------------------------------------
        // Iterator Methods

        // iterator
        Iterator<Integer> it = ll1.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // Descending iterator
        Iterator<Integer> dit = ll1.descendingIterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // start from beginning
        ListIterator<Integer> lit1 = ll1.listIterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // start from end
        ListIterator<Integer> lit2 = ll1.listIterator(ll1.size());
        while (lit2.hasPrevious()) {
            System.out.println(lit2.previous());
        }
        for (int x : ll1) {
            System.out.println(x);
        }

        // --------------------------------------------------------
        List<Integer> list = new ArrayList<Integer>(List.of(1,2,3,4,54,6,7,8,8,5,345,33,3,2,23));
        
        // add collection
        ll2.addAll(list);

        // add collection at index
        ll1.addAll(10, list);

        // retain matching elements
        ll1.retainAll(list);

        // remove the matching elements
        ll1.removeAll(list);

        // checks if contains all 
        ll1.containsAll(list);

        // --------------------------------------------------------
        // sublist
        ll1.subList(0,12);

        // toArray conversion
        Integer[] arr = ll1.toArray(new Integer[0]);

        //--------------------------------------------------------
        // sorting 
        // ascending
        Collections.sort(ll1);

        // descending order
        Collections.sort(ll1, Collections.reverseOrder());

        // comparators
        Collections.sort(ll1, new integerComparator1());

        // type - 2
        Comparator<Integer> integerComparator2 = new Comparator<Integer>(){
            public int compare(Integer a, Integer b) {
                return a-b;
            }
        };
        Collections.sort(ll1, integerComparator2); // no parenthesis

        // type - 3
        Collections.sort(ll1, new Comparator<Integer>(){
            public int compare (Integer a, Integer b) {
                return a-b;
            }
        });

    }
    // type - 1
    // implements comparator
    public static class integerComparator1 implements Comparator<Integer> {
        @Override
        public int compare(Integer a, Integer b) {
            return a-b;
        }

        // @Override
        // public int equals()
    }
}
