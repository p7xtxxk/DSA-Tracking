import java.io.*;
import java.util.*;

public class Day5_StackMethods {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // stack as vector
        Stack<Integer> s1 = new Stack<Integer>();
        // stack as list
        List<Integer> s2 = new Stack<Integer>();
        // stack as arraydeque
        Deque<Integer> s3 = new ArrayDeque<Integer>();
        // stack as linkedlist
        Deque<Integer> s4 = new LinkedList<Integer>();

        s1.push(1);
        s1.push(2);
        s1.push(3);
        s1.push(4);

        // pop the top element
        s1.pop();

        // return the top element without pop
        s1.peek();

        // check if stack empty
        s1.empty();

        // clear stack
        s1.clear();

        // look for element in stack
        s1.search(55);
        s1.search(3);

        // based on the declaration as a form : vector, list or deque , all properties apply to stack as well
    }
}
