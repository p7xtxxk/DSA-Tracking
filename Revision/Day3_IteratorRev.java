
import java.io.*;
import java.util.*;

public class Day3_IteratorRev {
    public static void main(String[] args) {
        System.out.println("Hello Geek!");

        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        // Iterator
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            it.next();
        }

        // ListIterator
        ListIterator<Integer> lit1 = list.listIterator();
        while (lit1.hasNext()) {
            int x = lit1.next();
            // add method
            if (x == 20 || x == 40) {
                lit1.add(5767);
            }
            System.out.println(lit1.nextIndex()); // 1,3,4,6,7
            System.out.println(lit1.previousIndex()); // 0,2,3,5,6
        }
        // [10, 20, 5767, 30, 40, 5767, 50]

        ListIterator<Integer> lit2 = list.listIterator(list.size());
        while (lit2.hasPrevious()) {
            int x = lit2.previous();
            // add method
            if (x == 20 || x == 40) {
                lit2.add(5767);
            }
        }
        // [10, 5767, 20, 30, 5767, 40, 50]

        //  descending  iterator
        Iterator<Integer> dit = list.descendingIterator();
        while(dit.hasNext()) {
            dit.next();
        }
    }
}
