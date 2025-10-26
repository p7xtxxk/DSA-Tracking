import java.io.*;
import java.util.*;

public class Day3_AL {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        List<Student> students = new ArrayList<Student>();
        students.add(new Student(12, "Pgtds", 18));
        students.add(new Student(13, "Rwerhrwerthrthh", 20));
        students.add(new Student(14, "Arwgwthtrher", 18));
        students.add(new Student(15, "Tertherth", 19));

        System.out.println(students.contains(new Student(15, "Tertherth", 19)));

        List<Integer> list1 = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 0);
        List<Integer> list = new ArrayList<Integer>(list1);

        list.add(123);
        list.add(1234);
        list.add(12345);
        list.add(123456);
        list.add(1234567);

        System.out.println(list.contains(Integer.valueOf(12345)));

        Student[] newArray = students.toArray(new Student[0]);
        for(Student x : newArray)
            System.out.println(x);

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

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(this instanceof Student))
            return false;
        Student s = (Student) o;
        return (rollNo == s.rollNo && age == s.age & name.equals(s.name));
    }

    @Override
    public int hashCode() {
        return Objects.hash(rollNo, age, name);
    }
}
