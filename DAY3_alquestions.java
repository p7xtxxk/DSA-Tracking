import java.io.*;
import java.util.*;

class Student {
    String name;
    int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return name + " - " + marks;
    }
}

class Employee {
    private int id;
    private String name;
    private double salary;

    // Constructor
    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // Getters
    public int getId() { return id; }
    public String getName() { return name; }
    public double getSalary() { return salary; }

    // toString for clean printing
    @Override
    public String toString() {
        return id + " | " + name + " | " + salary;
    }
}

public class DAY3_alquestions {

    // Q1: Write a Java program that takes an ArrayList<Integer> and reverses it in
    // place without using Collections.reverse().
    // public static ArrayList reverse(ArrayList<Integer> a) {
    // int start = 0, end = a.size() - 1;
    // while (start < end) {
    // int temp = a.get(start);
    // a.set(start, a.get(end));
    // a.set(end, temp);
    // start++;
    // end--;
    // }
    // return a;
    // }

    // Q2: Given an ArrayList<String>, remove all duplicate elements while preserving
    // the original order of first occurrences.
    // Example: ["apple", "banana", "apple", "orange", "banana"] → ["apple",
    // "banana", "orange"].
    // public static ArrayList duplicate(ArrayList<String> a) {
    // for (int i = 0; i < a.size(); ++i) {
    // String temp = a.get(i);
    // while (a.lastIndexOf(temp) != i) {
    // a.remove(a.lastIndexOf(temp));
    // }
    // }

    // return a;
    // }

    
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        List<Integer> listx = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 0);
        ArrayList<Integer> list = new ArrayList<Integer>(listx);
        
        list.add(123);
        list.add(1234);
        list.add(12345);
        list.add(123456);
        list.add(1234567);
        
        // ArrayList<String> list = new ArrayList<String>();
        // list.add("Apple");
        // list.add("Banan");
        // list.add("Cow");
        // list.add("Apple");
        // list.add("Apple");
        // list.add("Cow");
        // list.add("Cow");
        // list.add("Apple");
        // list.add("Banan");
        
        // list = duplicate(list);
        
        // Question 3: Create a class Student with fields name and marks.
        // Store multiple list in an ArrayList<Student>.
        // Sort them in descending order of marks, and if marks are equal, sort
        // alphabetically by name.

        List<Student> list1 = new ArrayList<Student>();
        list1.add(new Student("Ramesh", 85));
        list1.add(new Student("Suresh", 92));
        list1.add(new Student("Amit", 92));
        list1.add(new Student("Rana Naidu", 92));
        list1.add(new Student("Neha", 78));
        list1.add(new Student("Anita", 85));

        Comparator<Student> Compare = new Comparator<Student>() {
            public int compare(Student s1, Student s2) {
                int cmp = Integer.compare(s2.marks, s1.marks);
                if (cmp != 0) return cmp;
                return s2.name.compareTo(s1.name);
            }
        };

        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(101, "Ramesh", 50000));
        employees.add(new Employee(102, "Suresh", 70000));
        employees.add(new Employee(103, "Amit", 70000));
        employees.add(new Employee(104, "Neha", 45000));
        employees.add(new Employee(105, "Anita", 50000));


        // Sort Employees by Descending Salary, then by ascending Name
        Comparator<Employee> CompareEmp = new Comparator<Employee> () {
            public int compare (Employee e1, Employee e2) {
                int cmp = Double.compare(e2.getSalary(), e1.getSalary());
                if (cmp != 0) return cmp;
                return e1.getName().compareTo(e2.getName());
            }
        };


        Collections.sort(employees, CompareEmp);

        for (Employee x: employees) {
            System.out.println(x);
        }
/*
        * Splits an ArrayList<Integer> into two sublists (first half and second half).
        * Merges them back into a single list but in alternating order (one element
        * from first half, then one from second half, etc.).
*/      
        int mid = list.size()/2;
        List<Integer> sub1 = list.subList(0, mid);
        List<Integer> sub2 = list.subList(mid, list.size());


        List<Integer> listn = new ArrayList<Integer>();
 
        int i = 0;
        while (i < sub1.size()) {
            listn.add(sub1.get(i));
            listn.add(sub2.get(i));
            ++i;
        }

        if (list.size() % 2 != 0) {
            listn.add(sub2.get(sub2.size()-1));
        }


    }
}

/*
 * 
 * 🔹 5. Sublist and Merge
 * Question: Write a program that:
 * 
 
 * 
 * Example: [1,2,3,4,5,6] → [1,4,2,5,3,6].
 */