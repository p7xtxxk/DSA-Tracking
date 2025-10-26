import java.io.*;
import java.util.*;

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


public class ArrayList_D1 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        List<Student> list = new ArrayList<>();
        list.add(new Student(12, "Pgtds", 18));
        list.add(new Student(13, "Rwerhrwerthrthh", 20));
        list.add(new Student(14, "Arwgwthtrher", 18));
        list.add(new Student(15, "Tertherth", 19));

        
        Comparator<Student> SortByName = new Comparator<Student>() {
            public int compare(Student s1, Student s2) {
                // if (s1.name.length() > s2.name.length())
                // return 1;
                // else if (s1.name.length() == s2.name.length())
                // return 0;
                // else
                // return 0;

                return s1.name.length() - s2.name.length();
            }
        };
        Collections.sort(list, SortByName);
        // System.out.println(list);

        for (Student s : list) {
            System.out.println(s);
        }
    }
}
