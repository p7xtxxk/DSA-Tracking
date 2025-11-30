
import java.io.*;
import java.util.*;

public class Day3_LinkedList {
    public static void main(String[] args) {
        // basic - best and preferred
        LinkedList<Integer> list1 = new LinkedList<Integer>();
        // with initial elements
        LinkedList<Integer> list2 = new LinkedList<Integer>(List.of(1, 2, 3, 4, 5, 5));
        LinkedList<Integer> list3 = new LinkedList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 5));
        // from another collection
        LinkedList<Integer> list4 = new LinkedList<Integer>(list3);
        // list as interface
        List<Integer> list5 = new LinkedList<Integer>();
        // queue as interface
        Queue<Integer> list6 = new LinkedList<Integer>();
        // deque as interface
        Deque<Integer> list7 = new LinkedList<Integer>();
        // anonymous declaration - double braces at end
        LinkedList<Integer> list8 = new LinkedList<Integer>() {
            {
                add(32);
                add(43);
                add(54);
            }
        };

        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(
                5, 10, 15, 20, 25, 30, 35, 40, 45, 50,
                55, 60, 65, 70, 75, 80, 85, 90, 95, 100));

        LinkedList<Integer> list = new LinkedList<Integer>(numbers);

        // List methods
        list.add(3332);
        list.add(13, 7887);
        list.addAll(list2);
        list.set(1, 44);
        list.get(12);
        list.remove(33);
        list.remove(Integer.valueOf(33));
        list.isEmpty();
        list.contains(33);
        list.indexOf(33);
        list.lastIndexOf(33);

        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            it.next();
            it.remove();
        }
        ListIterator<Integer> lit = list.listIterator();
        while (lit.hasNext()) {
            lit.next();
            lit.set(43);
            lit.remove();
            lit.add(12);
            lit.nextIndex();
            lit.previousIndex();
        }
        Iterator<Integer> dit = list.descendingIterator();
        while (dit.hasNext()) {
            dit.next();
            dit.remove();
        }
        list.addAll(numbers);
        list.addAll(12, numbers);
        list.removeAll(numbers);
        list.retainAll(numbers);
        list.containsAll(numbers);
        list.subList(2, 14); // from 2 to 3 - view copy - changes made of anyone will be visible in both
        Integer[] arr = list.toArray(new Integer[0]); // only wrapper classes
        list.clear();

        // Queue methods
        // unsafe methods
        list.add(23);
        list.remove();
        list.element();
        // safe methods
        list.offer(44);
        list.poll();
        list.peek();

        // Deque methods
        // unsafe methods
        list.addFirst(23);
        list.addLast(32);
        list.removeFirst();
        list.removeLast();
        list.getFirst();
        list.getLast();
        // safe methods
        list.offerFirst(12);
        list.offerLast(44);
        list.pollFirst();
        list.pollLast();
        list.getFirst();
        list.getLast();

        System.out.println(list);

    }
}
