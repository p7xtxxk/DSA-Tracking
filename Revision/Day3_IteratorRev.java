
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
            System.out.println(lit1.previousIndex());
            lit1.next();
        }
        System.out.println(list);
        ListIterator<Integer> lit2 = list.listIterator(list.size() - 1);
        while (lit2.hasPrevious()) {
            lit2.previous();
        }
    }
}
