import java.util.*;


public class Day2_arraylist {
    public static void main(String args[]) {
        List<Integer> list1 = List.of(1,2,3,4,5,6,7,8,9,0);
        List<Integer> list2 = Arrays.asList(1,2,3,4,5,6,7,78,8,8,9);

        List<Integer> list = new ArrayList<Integer>(list1);

        // add elements
        list.add(123);
        list.add(10, 123);
        list.addAll(list2);

        // extract elements from index
        // list.get(2);

        // change element at index
        // list.set(12, 12414);

        // size, clear and empty
        list.size();
        list.isEmpty();
        list.clear();
        
        // typecasting from list to arraylist
        ArrayList<Integer> list4 = (ArrayList<Integer>)list;
        
        // match capacity to current size
        ((ArrayList<Integer>)list).trimToSize();
        
        
        List<Student> list6 = new ArrayList<Student>();
        list6.add(new Student(12, "Pgtds", 18));
        list6.add(new Student(13, "Rwerhrwerthrthh", 20));
        list6.add(new Student(14, "Arwgwthtrher", 18));
        list6.add(new Student(15, "Tertherth", 19));

        // presence check - object and element
        list.contains(Integer.valueOf(123));
        // boolean x = list.contains(123); // output is false
        System.out.println(list.contains(Integer.valueOf(2))); // returns false
        
        
        
        // remove element and element at the index
        System.out.println(list6.contains(new Student(15, "Tertherth", 19)));
        
        System.out.println(list);
    }
}

class Student {
    int rollNo;
    String name;
    int age;

    Student(int rollNo, String name, int age) {
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return rollNo + " " + name + " " + age;
    }
}