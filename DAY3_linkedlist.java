
import java.io.*;
import java.util.*;

public class DAY3_linkedlist {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // declaration
        LinkedList<Integer> list = new LinkedList<Integer>();

        // add elements
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(5);
        list.add(6);
        list.add(17);
        list.add(18);
        list.add(91);
        List<Integer> listx = List.of(1, 2, 4, 5, 6, 6, 7);
        list.addAll(listx);

        // add elements at index
        list.add(5, 88777);

        // extract element at index
        System.out.println(list.get(10));

        // modify the element at the index
        list.set(10, 5544554);

        // check for empty, clear the list
        System.out.println(list.isEmpty());
        // list.clear();

        // remove element instance at index or by the element
        list.remove(1);
        list.remove(Integer.valueOf(91));

        // size
        System.out.println(list.size());

        // print the linkedlist
        // for (int x: list)
        // System.out.print(x + "->");
        // System.out.print("END");

        // Iterator
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // Descending Iterator
        Iterator<Integer> dit = list.descendingIterator();
        while (dit.hasNext()) {
            System.out.println(dit.next());
        }

        // List Iterator
        ListIterator<Integer> lit1 = list.listIterator();
        while (lit1.hasNext()) {
            System.out.println(lit1.next());
        }
        
        ListIterator<Integer> lit2 = list.listIterator(list.size());
        while(lit2.hasPrevious()) {
            System.out.println(lit2.previous());
        }


    }
}
