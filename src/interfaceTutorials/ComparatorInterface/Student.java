package interfaceTutorials.ComparatorInterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Student {
    int age;
    String name;

    Student(int age, String name){
        this.age = age;
        this.name = name;
    }

    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student(25,"Bilal"));
        list.add(new Student(20,"raju"));
        list.add(new Student(35,"kalu"));
        list.add(new Student(15,"sumit"));

        Comparator<Student> ageComparator = (s1,s2) -> s1.age -s2.age;
            // sorting based on age
        Collections.sort(list, ageComparator);

        for(Student s : list){
            System.out.println(s.name + "-" + s.age);
        }


        //sorting based on name
        Comparator<Student> nameComparator = (s1,s2) -> s1.name.compareTo(s2.name);

        Collections.sort(list, nameComparator);

        for(Student s :list){
            System.out.println("sorted by name " + s.name);
        }

        //multilevel sorting
        Comparator<Student> multiSort = Comparator.comparingInt((Student s) -> s.age)
                .thenComparing(s -> s.name);


    }
}
