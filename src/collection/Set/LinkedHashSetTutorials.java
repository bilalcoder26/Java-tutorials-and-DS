package collection.Set;
/*
linkedHashSet is a class in java that implements the set interface just like HashSet but
with one important difference

#--> it preserves the insertion order
 linkedHashset combines two data structures;
 1) Hash table
    --> provide fast lookup , add remove in o(1) time;
 2) Doubly linked list
    --> Maintain the order in which element were inserted

    Because of this internal structure;
     --> order is maintained
     --> lookups are still fast
     --> slightly more memory is used (because of linked list pointers)

  key properties
  1) No duplicate
  2) Maintain insertion order
  3) allow null (only one)
  4)Time complexity:o(1) for add , remove contains
  5) slightly higher memory usage than HashSet

  internal working example
  add("A") -> linked list : A
  add("C") -> A-> C
  add("B") -> A->C->B

  EVEN if hashing stores them in random buckets, iteration always follows the linked list order;
  A,C,B

  SUMMARY
  LINKEDHASHSET is best when you want;
  unique element
  fast operation
  predictable iteration order
 */

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetTutorials {
    static void createExampleOfLinkedHashSet(){
        Set<String> set = new LinkedHashSet<>();
        set.add("Bilal");
        set.add("sonu");
        set.add("java");
        System.out.println("set "+ set);
        System.out.println("remove element from set : " + set.remove("mango"));
        System.out.println("adding element in set : " + set.add("pinapple"));
        System.out.println("checking if it contain the element : " + set.contains("Apple"));
        System.out.println("size of set : " + set.size());
        System.out.println("checking if the it is empty : " +    set.isEmpty());
        System.out.println("----------//////////--------------------");
        for (String item : set) {
            System.out.println("looping using enchaned loop in set :" + item);
        }
        System.out.println("----------//////////--------------------");

        Iterator<String> it = set.iterator();

        while (it.hasNext()){
            System.out.println("looping using while loop :" + it.next());
        }
        System.out.println("----------//////////--------------------");
        set.forEach(item -> System.out.println("using java 8 :" + item));

        System.out.println("----------//////////------using stream ------------");

        set.stream().forEach(System.out::println);
    }

    public static void main(String[] args) {
        createExampleOfLinkedHashSet();
    }

}
