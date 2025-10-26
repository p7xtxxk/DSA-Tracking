
import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Collections;

public class Day9_Comparator {

    // comparable implemented
    public static class Student implements Comparable<Student>{
        private String name;
        private int age;
        private int marks;

        public Student(String name, int age, int marks) {
            this.name = name;
            this.age = age;
            this.marks = marks;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public int getMarks() {
            return marks;
        }

        @Override
        public String toString() {
            return name + " | Age: " + age + " | Marks: " + marks;
        }

        @Override
        public int compareTo(Student that) {
            if (this.age>that.age) return 1;
            else if (this.age<that.age) return -1;
            else return 0;
        }
        
    }

    public static class SortbyRollAsc implements Comparator<Student> {
        public int compare(Student a, Student b) {
            if (a.marks > b.marks)
                return 1;
            else if (a.marks < b.marks)
                return -1;
            else
                return 0;
        }
    }

    public static class SortbyRollDesc implements Comparator<Student> {
        public int compare(Student a, Student b) {
            if (a.marks > b.marks)
                return -1;
            else if (a.marks < b.marks)
                return 1;
            else
                return 0;
        }
    }

    public static class SortByNameLengthDesc implements Comparator<Student> {
        public int compare(Student a, Student b) {
            return b.name.length() - a.name.length();
        }
    }

    public static class SortByNameLengthAsc implements Comparator<Student> {
        public int compare(Student a, Student b) {
            return a.name.length() - b.name.length();
        }
    }

    public static class MarksSecondDigitDesc implements Comparator<Student> {
        public int compare(Student a, Student b) {
            if (a.marks%10 > b.marks%10) return -1;
            else if (a.marks%10 > b.marks%10) return 1;
            else return 0;
        }
    }

    public static class MarksSecondDigitAsc implements Comparator<Student> {
        public int compare(Student a, Student b) {
           if (a.marks%10>b.marks%10) return 1;
           else if (a.marks%10>b.marks%10) return -1;
           else return 0;
        }
    }

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        List<Student> students = new ArrayList<>();
        students.add(new Student("Ravi", 21, 85));
        students.add(new Student("Anita", 20, 92));
        students.add(new Student("Kiran", 22, 78));

        // comparable implemented 
        students.sort(null);
        Collections.sort(students);
        
        
        // type - 1: using class : remember use 'new' keyword
        Collections.sort(students, new SortbyRollAsc());
        Collections.sort(students, new SortbyRollDesc());
        Collections.sort(students, new SortByNameLengthDesc());
        Collections.sort(students, new SortByNameLengthAsc());
        Collections.sort(students, new MarksSecondDigitDesc());
        Collections.sort(students, new MarksSecondDigitAsc());

        // type - 2 : using anonymous class
        // type - 2a
        Comparator<Student> compAsc = new Comparator<Student>(){
            public int compare(Student a, Student b) {
                if (a.age > b.age) return 1;
                else if (a.age < b.age) return -1;
                else return 0;
            }
        };
        Comparator<Student> compDesc = new Comparator<Student>() {
            public int compare(Student a, Student b) {
                if (a.age < b.age) return 1;
                else if (a.age > b.age) return -1;
                else return 0;
            }
        };

        Collections.sort(students, compAsc);
        Collections.sort(students, compDesc);

        // type - 2b
        Collections.sort(students, new Comparator<Student>() {
            public int compare(Student a, Student b) {
                if(a.age > b.age) return 1;
                else if(a.age < b.age) return -1;
                else return 0;
            }
        });

        Collections.sort(students, new Comparator<Student>() {
            public int compare(Student a, Student b) {
                if (a.age<b.age) return 1;
                else if (a.age<b.age) return -1;
                else return 0;
            }
        });

        // System.out.println(students);
    }
}
