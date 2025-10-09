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

public class Comparator_DAY2 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        List<Student> students = new ArrayList<Student>();
        students.add(new Student(101, "Ryu", 21));
        students.add(new Student(101, "Ryu", 21));
        // students.add(new Student(102, "Alex", 20));
        // students.add(new Student(103, "Jonathan", 22));
        // students.add(new Student(104, "Meera", 19));
        // students.add(new Student(105, "Satoshi", 23));

        Comparator<Student> SortByName = new Comparator<Student>() {
            public int compare(Student s1, Student s2) {
                // return s1.name.length() - s2.name.length();
                if (s1.name.length() > s2.name.length())
                    return 1;
                else if (s1.name.length() == s2.name.length())
                    return 0;
                else
                    return -1;
                // if 1 then paramater-1 comes after parameter - 2
                // if 1 then paramater-1 comes before parameter - 2
                // if 0 then no change
            }
        };

        Comparator<Student> SortByRoll = new Comparator<Student>() {
            public int compare(Student s1, Student s2) {
                // return s1.rollNo - s2.rollNo;
                if (s1.rollNo % 10 < s2.rollNo % 10)
                    return 1;
                else if (s1.rollNo % 10 == s2.rollNo % 10)
                    return 0;
                else
                    return -1;
            }
        };


        // Collections.sort(students, SortByRoll);

        for (Student s : students)
            System.out.println(s);
    }
}
