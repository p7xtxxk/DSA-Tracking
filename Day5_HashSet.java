import java.io.*;
import java.util.*;


public class Day5_HashSet {
    public static void main(String[] args) {
        
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(
                5, 10, 15, 20, 25, 30, 35, 40, 45, 50,
                55, 60, 65, 70, 75, 80, 85, 90, 95, 100));
        
        // declarations
        // basics
        HashSet<Integer> h1 = new HashSet<Integer>();
        // capacity
        HashSet<Integer> h2 = new HashSet<Integer>(100);
        // capacity + load factor
        HashSet<Integer> h3 = new HashSet<Integer>(100, 55);
        // from another collection
        HashSet<Integer> h4 = new HashSet<Integer>(numbers);
        // inline anonymous
        HashSet<Integer> h5 = new HashSet<Integer>() {{
            add(1);
            add(2);
            add(3);
            add(4);
            add(5);
            add(6);
            add(7);
            add(8);
            add(9);
        }};
        
        
        // methods
        h5.add(12);
        h5.addAll(numbers);
        h5.remove(33);
        h5.remove(35);
        h5.removeAll(numbers);
        h5.isEmpty();
        h5.contains(12);
        h5.clear();
        h5.retainAll(numbers);
        
        Iterator<Integer> it = h5.iterator();
        while (it.hasNext()) {
            int curr = it.next();
            if(curr == 5 || curr==35)
                it.remove();
            System.out.println(curr);
        }
        
        @SuppressWarnings("unchecked")
        HashSet<Integer> clonedHash = (HashSet<Integer>) h5.clone();

        System.out.println(clonedHash);
        
        Integer[] arr = h5.toArray(new Integer[0]);
        for (int x: arr) {
            
        System.out.print(x+" ");
        }
    }
}
