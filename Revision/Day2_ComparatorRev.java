import java.io.*;
import java.util.*;

public class Day2_ComparatorRev {
    public static void main(String args[]) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Student> list = new ArrayList<Student>();
        list.add(new Student(22, "Prateek", 33));
        list.add(new Student(19, "Ryu", 554));
        list.add(new Student(25, "Yogi",234));
        list.add(new Student(21, "Amit", 72));

        // separate class implementation
        Collections.sort(list, new SortByRollAsc());
        Collections.sort(list, new SortByRollDesc());
        Collections.sort(list, new SortByNameLengthDesc());
        Collections.sort(list, new SortByNameLengthAsc());
        Collections.sort(list, new SortByAgeDesc());
        Collections.sort(list, new SortByAgeAsc());


        // anonymous class impleemntation
        Comparator<Student> SortByRollAsc = new Comparator<Student>() {
            public int compare(Student a, Student b) {
                return a.roll - b.roll;
            }
        };
        Comparator<Student> SortByNameLengthDesc = new Comparator<Student>() {
            public int compare(Student a, Student b) {
                return b.name.length() - a.name.length();
            }
        };

        Collections.sort(list, SortByRollAsc);
        Collections.sort(list, SortByNameLengthDesc);
    }
}

class Student {
    int age;
    int roll;
    String name;

    Student(int age, String name, int roll) {
        this.age = age;
        this.roll = roll;
        this.name = name;
    }
}

class SortByRollAsc implements Comparator<Student> {
    public int compare(Student a, Student b) {
        return a.roll - b.roll;
    }
}

class SortByRollDesc implements Comparator<Student> {
    public int compare(Student a, Student b) {
        return b.roll - a.roll;
    }
}

class SortByNameLengthDesc implements Comparator<Student> {
    public int compare(Student a, Student b) {
        return b.name.length() - a.name.length();
    }
}

class SortByNameLengthAsc implements Comparator<Student> {
    public int compare(Student a, Student b) {
        return a.name.length() - b.name.length();
    }
}

class SortByAgeDesc implements Comparator<Student> {
    public int compare(Student a, Student b) {
        return b.age - a.age;
    }
}

class SortByAgeAsc implements Comparator<Student> {
    public int compare(Student a, Student b) {
        return a.age - b.age;
    }
}