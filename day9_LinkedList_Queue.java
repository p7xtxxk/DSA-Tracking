import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Deque;
import java.util.List;

public class day9_LinkedList_Queue {
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

        // LinkedList methods for Queue

        // add element at the tail
        ll1.add(1);
        ll1.add(2);
        ll1.add(3);
        ll1.add(4);
        ll1.add(5);
        ll1.add(6);
        ll1.add(7);
        ll1.add(8);
        ll1.add(9);
        ll1.add(11);
        ll1.add(12);
        ll1.add(10);

        // insert element at the tail - preferred
        ll1.offer(30);
        ll1.offer(31);
        ll1.offer(32);
        ll1.offer(33);
        ll1.offer(34);
        ll1.offer(35);
        ll1.offer(36);
        ll1.offer(38);
        ll1.offer(39);
        ll1.offer(37);
        ll1.offer(40);

        // remove the head element
        ll1.removeFirst();
        ll1.pollFirst(); 
        
        // remove the last element
        ll1.removeLast();
        ll1.pollLast();

        // peek element
        ll1.getFirst();
        ll1.getLast();

        ll1.peekLast();
        ll1.peekFirst();

        // standard methods - returns exception
        ll1.addFirst(75);
        ll1.addLast(56);

        ll1.removeFirst();
        ll1.removeLast();

        ll1.getFirst();
        ll1.getLast();

        // preferred methods which returns false or null 
        ll1.offerFirst(123);
        ll1.offerLast(321);

        ll1.pollFirst();
        ll1.pollLast();

        ll1.peekFirst();
        ll1.peekLast();

        System.out.println(ll1);


    }

}
