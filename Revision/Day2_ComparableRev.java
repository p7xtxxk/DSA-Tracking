import java.io.*;
import java.util.*;

class Day2_ComparableRev {
    public static void main(String[] args) {
        System.out.println("Hello Geek!");
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student(22, "Prateek"));
        list.add(new Student(19, "Ryu"));
        list.add(new Student(25, "Yogi"));
        list.add(new Student(21, "Amit"));
        Collections.sort(list);
        for (Student x : list) {
            System.out.print(x.age + " ");
        }
    }
}

class Student implements Comparable<Student> {
    int age;
    String name;

    Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public int compareTo(Student that) {
        return that.age - this.age;
    }
}
