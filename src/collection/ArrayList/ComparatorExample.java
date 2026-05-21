package collection.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ComparatorExample {
        public static void main(String[] args) {
         ArrayList<Student> students = new ArrayList<>();
            students.add(new Student(103, "John"));
            students.add(new Student(101, "Alice"));
            students.add(new Student(102, "Bob"));

         System.out.println("Original: " + students);  // [103:John, 101:Alice, 102:Bob]

         // Sort by name using NameComparator
         Collections.sort(students, new NameComparator());
         System.out.println("By name: " + students);   // [101:Alice, 102:Bob, 103:John]

         // Sort by id using IdComparator
         Collections.sort(students, new IdComparator());
         System.out.println("By id: " + students);     // [101:Alice, 102:Bob, 103:John]
     }
}
