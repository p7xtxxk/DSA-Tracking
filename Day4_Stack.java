import java.io.*;
import java.util.*;


public class Day4_Stack {
    public static void main(String args[]) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // basic declaration
        Stack<Integer> s1 = new Stack<Integer>();
        
        // List version
        List<Integer> s2 = new Stack<Integer>();

        // Deque version
        Deque<Integer> s3 = new ArrayDeque<Integer>();

        // deque using LinkedList
        Deque<Integer> s4 = new LinkedList<Integer>();

        List<Integer> list = List.of(1,2,3,4,5,6,7);

        s1.addAll(list);
        s2.addAll(list);
        s3.addAll(list);
        s4.addAll(list);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);

        // pop 
        s1.pop();

        // push
        s1.push(1234);

        // peek
        s1.peek();

        // empty check
        s1.isEmpty();

        // search
        System.out.println(s1.search(1));

        // clear()
        s1.clear();
        System.out.println(s1);

        
    }
}
