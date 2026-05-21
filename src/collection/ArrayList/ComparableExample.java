package collection.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ComparableExample {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(110, "Bilal"));
        students.add(new Student(100, "Sumit"));
        students.add(new Student(101, "Rohit"));
        students.add(new Student(111, "Raju"));
        System.out.println("Before " + students);

        // Step 3: Sort using Collections.sort()
       Collections.sort(students);
        System.out.println("After: " + students);

//        ArrayList<Person> people = new ArrayList<>();
//        people.add(new Person("John", 30));
//        people.add(new Person("Alice", 25));
//        people.add(new Person("Bob", 35));
//
//             Collections.sort(people);
//             System.out.println(people);
    }
}

class Student implements Comparable<Student>{
    int id;
    String name;

    Student(int id, String name){
        this.id = id;
        this.name = name;

    }

    @Override
    public int compareTo(Student other) {
        // Sort by id (ascending)
      return this.id - other.id;
    }
    public String toString() {
         return id + ":" + name;
     }
}
