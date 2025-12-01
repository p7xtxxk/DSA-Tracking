import java.io.*;
import java.util.*;

public class Day4_Stack {
    public static void main(String args[]) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(
                5, 10, 15, 20, 25, 30, 35, 40, 45, 50,
                55, 60, 65, 70, 75, 80, 85, 90, 95, 100));

        // normal declaration - access to stack and vector methods
        Stack<Integer> s1 = new Stack<Integer>();
        // list interface - list+stack methods
        List<Integer> s2 = new Stack<Integer>();
        // vector interface - cannot call STACK methods
        Vector<Integer> s3 = new Stack<Integer>();
        // deque using arraydeque - preferred
        Deque<Integer> s5 = new ArrayDeque<Integer>();

        s1.addAll(numbers);

        // stack methods
        s1.push(12);
        s1.pop();
        s1.peek();
        s1.empty();
        s1.search(Integer.valueOf(30));

        // vector methods
        s1.add(122);
        s1.add(3, 122);
        s1.addAll(numbers);
        s1.addAll(5, numbers);
        s1.remove(4);
        s1.remove(Integer.valueOf(35));
        s1.firstElement();
        s1.lastElement();
        s1.ensureCapacity(40);
        s1.capacity();
        s1.trimToSize();
        s1.indexOf(33);
        s1.lastIndexOf(33);
        s1.clear();
        Iterator<Integer> it = s1.iterator();
        while (it.hasNext()) {
            it.next();
        }
        ListIterator<Integer> lit1 = s1.listIterator();
        while (lit1.hasNext()) {
            lit1.next();
        }
        ListIterator<Integer> lit2 = s1.listIterator(s1.size() - 1);
        while (lit2.hasPrevious()) {
            lit2.previous();
        }

        // System.out.println(s1.search(Integer.valueOf(345)));

    }
}
