package collection.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class SortingExample {
    static void simpleSorting(){
        ArrayList<Integer> numbers = new ArrayList<>();
                numbers.add(5);
                 numbers.add(2);
                 numbers.add(8);
                 numbers.add(1);

        Collections.sort(numbers);
        System.out.println("Sort in ascending order (natural order)" + numbers);

        System.out.println("sorting in alphabetically order");
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Mango");
        fruits.add("Kiwi");
        fruits.add("Apple");
        fruits.add("Banana");
        Collections.sort(fruits);
        System.out.println("sorting in alphabetically order " + fruits);
        Collections.sort(numbers, Collections.reverseOrder());
        System.out.println("REVERSE " + numbers);  // [8, 5, 2, 1]
    }
    static void customSortingWithObject(){
        ArrayList<Person> pepole = new ArrayList<>();
        pepole.add(new Person("Bilal", 101));
        pepole.add(new Person("Arman", 99));
        pepole.add(new Person("Chobey", 18));
        pepole.add(new Person("Don", 12));
        pepole.add(new Person("EKTA", 9));
        System.out.println("sort by age via custom logic");
        pepole.sort((p1,p2)-> p1.age - p2.age );
        System.out.println("after sorting " + pepole);
        System.out.println("sort by name");
        pepole.sort((p1,p2) -> p1.name.compareTo(p2.name));
        System.out.println("after name sorting of people" + pepole);

    }
    public static void main(String[] args) {
        simpleSorting();
        customSortingWithObject();

    }
}

class Person {
    String name;
    int age;
    Person(String name,int age){
        this.name = name;
        this.age = age;
    }
    public String toString() {
         return name + ":" + age;
        }


}
