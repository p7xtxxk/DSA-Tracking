import java.io.*;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;

public class Day1_arraylist {
    public static void nain(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // basic
        List<Integer> list1 = new ArrayList<Integer>();
        // non modifiable at all
        List<Integer> list2 = List.of(1, 2, 3, 4, 5, 6);
        // fixed size; element modification only
        List<Integer> list3 = Arrays.asList(1, 2, 3, 4, 5, 6, 677, 8, 8, 8);
        // initial capacity: size is 1.5x once the capacity is full
        List<Integer> list4 = new ArrayList<Integer>(20);
        // collection
        List<Integer> list5 = new ArrayList<Integer>(list1);

        // add all elements
        list1.add(22);
        list1.add(2, 232);
        // add collection
        list1.addAll(list5);
        // obtain element at index
        list1.get(3);
        // element contain check
        list1.contains(3);
        // size of the list
        list1.size();
        // remove element at index
        list1.remove(3);
        // remove element
        list1.remove(Integer.valueOf(3));
        // change the value at index
        list1.set(3, 55);
        // find the first index of any element
        list1.indexOf(4);
        // find the last index of any element
        list1.lastIndexOf(5);
        // empty check
        list1.isEmpty();
        // clear the list
        list1.clear();
        // sort by comparator
        Comparator<Integer> comp = new Comparator<Integer>() {
            public int compare(Integer a, Integer b) {
                if (a > b)
                    return 1;
                else if (a == b)
                    return 0;
                else
                    return -1;
            }
        };
        list1.sort(comp);
        // conversion to array
        String[] arr1 = list1.toArray(new String[0]);
        Integer[] arr2 = list1.toArray(new Integer[0]);
    }

    public ArrayList<Integer> findDuplicates(int[] arr) {
        HashSet<Integer> checked = new HashSet<Integer>();
        ArrayList<Integer> duplicates = new ArrayList<Integer>();

        for (int x : arr) {
            boolean flag = checked.add(x);
            if (!flag)
                duplicates.add(x);
        }

        return duplicates;
    }
}

// User function Template for Java

class Solution {
    static void reArrange(int[] arr, int N) {
        ArrayList<Integer> list = new ArrayList<Integer>(N);
        int lastEven = 0, lastOdd = 1;
        for (int x : arr) {
            list.add(x);
        }
        for(int x: list) {
            if(x%2==0){
                arr[lastEven] = x;
                lastEven+=2;
            }
            else {
                arr[lastOdd] = x;
                lastOdd += 2;
            }
        }
    }
};