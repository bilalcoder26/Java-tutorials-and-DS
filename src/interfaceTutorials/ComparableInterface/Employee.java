package interfaceTutorials.ComparableInterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Employee implements Comparable<Employee>{
    int id;
    String name;
    Employee(int id, String name){
        this.id = id;
        this.name = name;
    }
    @Override
    public int compareTo(Employee other) {
        return this.id - other.id; // natural order : ascending by ID
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee(3,"ALI"));
        list.add(new Employee(1,"Bilal"));
        list.add(new Employee(2,"Manoj"));

        Collections.sort(list);
        System.out.println(list);
    }
}
