// Java - Vector

import java.io.*;
import java.util.*;



public class Day4_Vector {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> list = List.of(1,2,3,4,5,6,7,7,88,8,8,99,97);

        // normal declaration
        Vector<Integer> vec1 = new Vector<Integer>();

        // capacity intial
        Vector<Integer> vec2 = new Vector<Integer>(20);

        // capacity - initial and increment
        Vector<Integer> vec3 = new Vector<Integer>(20, 10);

        // vector with collection frameworks
        Vector<Integer> vec4 = new Vector<Integer>(list);

        // add elements
        vec4.add(1);
        vec4.add(3);
        vec4.add(2);
        vec2.addAll(list);

        // access elements
        vec4.get(10);
        vec4.set(4, 76776);
        vec4.firstElement();
        vec4.lastElement();

        // remove elements
        vec4.remove(6);
        vec4.remove(Integer.valueOf(76776));

        // capacity management
        vec4.capacity();
        vec4.ensureCapacity(500);
        vec4.trimToSize();

        // element containing check
        System.out.println(vec4.contains(99));
        vec4.indexOf(83);
        vec4.lastIndexOf(83);

        // iterators
        Iterator<Integer> it = vec4.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // ListIterator
        // forward traverse
        ListIterator<Integer> lit_f = vec4.listIterator();
        while(lit_f.hasNext()) {
            System.out.println(lit_f.next());
        }
        System.out.println("----------------");
        // backward traverse
        ListIterator<Integer> lit_b = vec4.listIterator(vec4.size());
        while(lit_b.hasPrevious()) {
            System.out.println(lit_b.previous());
        }
    }
}
