import java.io.*;
import java.util.List;
import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;

public class Day10_hashSet {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8);
        // general declaration
        Set<Integer> hash1 = new HashSet<Integer>();
        // intital capacity
        Set<Integer> hash2 = new HashSet<Integer>(15);
        // intital capacity and load factor
        Set<Integer> hash3 = new HashSet<Integer>(15, 0.86f);
        // from another collection
        Set<Integer> hash5 = new HashSet<Integer>(list);
        // single line declaration
        Set<Integer> hash4 = Set.of(75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86);

        // add elements
        hash5.add(1);
        hash5.add(2);
        hash5.add(3);
        hash5.add(4);

        // add whole collection in hashSet
        hash5.addAll(list);

        // remove object if present
        hash5.remove(77);
        hash5.remove(777);

        // remove collection if present
        hash5.remove(list);

        // retain matching elements of collection
        hash5.retainAll(list);

        // element presence check
        hash5.contains(677);
        hash5.containsAll(list);

        // size
        hash5.size();

        // empty check
        hash5.isEmpty();

        // iterator
        Iterator<Integer> it = hash5.iterator();
        while (it.hasNext()) {
            it.next(); 
        }

        // array conversion
        // typed array conversion
        Integer[] array = hash5.toArray(new Integer[0]);

        // shallow copy = preferred
        HashSet<Integer> hashShallow = new HashSet<Integer>(hash5);
        // avoid clone
        // hashcode
        HashSet<Integer> hash7 = new HashSet<Integer>();
        hash7.addAll(List.of(1,2,3,5));
        System.out.println(hash7.hashCode()); //Output : 11

        // empty the hashset
        hash5.clear();
    }
    
    class Student {
        int id;
        int roll;
        String name;

        Student(int id, String name) {
            this.id = id;
            this.roll = roll;
            this.name = name;
        }

        @Override
        public int hashCode() {
            return roll; // uniqueness based on roll
        }

        @Override
        public boolean equals(Object o) {
            if (this == o)
                return true;
            if (!(o instanceof Student))
                return false;
            Student s = (Student) o;
            return this.roll == s.roll;
        }
    }
}
