package collection.Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetTutorials {
//the order of element in HashSet is not guaranteed
    static void createHashSet(){
        Set<String> set = new HashSet<>();
        set.add("Apple");
        set.add("bananna");
        set.add("cherry");
        set.add("mango");
        set.add("Apple");

        System.out.println("setElement : " + set);

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

    //TreeSet : stores elements in sorted order

    static  void createTreeSet(){

    }

    public static void main(String[] args) {
        createHashSet();
    }
}
