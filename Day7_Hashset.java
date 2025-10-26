
import java.io.*;
import java.util.*;
import java.util.concurrent.*;

public class Day7_Hashset {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Set<Integer> set = Set.of(1, 2, 3, 4, 5, 6, 7, 8);
        Set<Integer> h = new HashSet<Integer>(set);
        System.out.println(h.size());

        // add element
        h.add(112);
        System.out.println(h.size());
        h.add(112);
        System.out.println(h.size());

        // remove element
        System.out.println(h.remove(11232)); // return false
        h.remove(112); // return true

        // element check
        h.contains(3);

        // empty check
        h.isEmpty();

        // iterator
        Iterator<Integer> it = h.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        int[] arr = { 1, 2, 2, 3, 4, 4, 5 };
        int[] arr1 = Duplicates(arr);
        System.out.println(Arrays.toString(arr1));

    }

    // remove duplicates
    public static int[] Duplicates(int[] array) {
        Set<Integer> h = new HashSet<Integer>();
        for (int i : array) {
            h.add(i);
        }
        int[] result = new int[h.size()];
        int i = 0;
        for (int num : h) {
            result[i++] = num;
        }
        return result;
    }

    // Check for Subset
    public static boolean SubsetCheck(int[] main, int[] subset) {
        Set<Integer> mainHS = new HashSet<Integer>();
        for (int i : main) {
            mainHS.add(i);
        }
        for (int i : subset) {
            if (!(mainHS.contains(i)))
                return false;
        }

        return true;
    }

    // Count Distinct Elements in a Sliding Window
    public static int[] DistinctElements(int[] array, int k) {
        int start = 0, end = start + k;
        List<Integer> list = new ArrayList<Integer>();

        while (end <= array.length) {
            Set<Integer> hash = new HashSet<Integer>();
            for (int i = start; i < end; ++i) {
                hash.add(array[i]);
            }
            list.add(hash.size());
            start++;
            end++;
        }

        Integer[] temp = list.toArray(new Integer[0]);
        int[] result = new int[temp.length];
        for (int i = 0; i < temp.length; ++i) {
            result[i] = temp[i];
        }

        return result;
    }

    // Union and Intersection of Two Arrays
    public static int[] Union(int[] a, int[] b) {
        Set<Integer> hash = new HashSet<Integer>();

        for (int x : a) {
            hash.add(x);
        }
        for (int x : b) {
            hash.add(x);
        }

        Integer[] temp = hash.toArray(new Integer[0]);
        int[] result = new int[temp.length];
        for (int i = 0; i < temp.length; ++i) {
            result[i] = temp[i];
        }

        return result;
    }

    public static int[] InterSection(int[] a, int[] b) {
        Set<Integer> hash1 = new HashSet<Integer>();
        for (int x : a) {
            hash1.add(x);
        }
        Set<Integer> hash2 = new HashSet<Integer>();
        for (int x : b) {
            hash2.add(x);
        }

        Set<Integer> hash3 = new HashSet<Integer>();
        for (int x : hash1) {
            if (hash2.contains(x))
                hash3.add(x);
        }
        for (int x : hash2) {
            if (hash1.contains(x))
                hash3.add(x);
        }

        Integer[] temp = hash3.toArray(new Integer[0]);
        int[] result = new int[temp.length];
        for (int i = 0; i < temp.length; ++i) {
            result[i] = temp[i];
        }

        return result;

    }

    // Longest Consecutive Sequence
    public static int longestConsecutive1(int[] nums) {
        // solution - 1
        Set<Integer> set1 = new HashSet<Integer>();
        for (int x : nums) {
            set1.add(x);
        }
        List<Integer> list1 = new ArrayList<Integer>(set1);
        Collections.sort(list1);
        int longest1 = 1, current1 = 1;
        for (int i = 0; i < list1.size(); ++i) {
            if (list1.get(i + 1) == list1.get(i) + 1) {
                current1++;
                longest1 = Math.max(longest1, current1);
            } else {
                current1 = 1;
            }
        }
        return longest1;
    }

    public static int longestConsecutive2(int[] nums) {
        // solution - 2
        if (nums == null || nums.length == 0)
            return 0;
        Set<Integer> set = new HashSet<Integer>();
        for (int x : nums) {
            set.add(x);
        }
        int finalLength = 0;
        for (int num : set) {
            if (!(set.contains(num - 1))) {
                int currentNum = num;
                int currentLength = 1;

                while (set.contains(currentNum + 1)) {
                    currentNum++;
                    currentLength++;
                }

                finalLength = (currentLength > finalLength) ? currentLength : finalLength;
            }
        }

        return finalLength;
    }

}
