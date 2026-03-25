package collection.HashSet;
/*
treeSet is a sorted , unique NavigableSet implementation in java
it stores elements in sorted (ascending) order automatically
internally it uses a Red-Black Tree ( a type of self-balancing binary search tree)

TreeSet is built on TreeMap , which uses a Red-Black Tree

when to use TreeSet
you need sorted data

you want unique element
you want range operation(higher, lower, floor, ceiling)
performance O(log n) is acceptable
 */

import java.util.Arrays;
import java.util.TreeSet;

public class TreeSetTutorials {
    static void createExampleOfTreeSet (){
        TreeSet<Integer> set = new TreeSet<>();
        set.add(20);
        set.add(5);
        set.add(15);
        System.out.println("set " + set); //sorted ascending order


        TreeSet<String> set1 = new TreeSet<>();
        set1.add("java");
        set1.add("Billa");
        set1.add("developer");
        System.out.println("set with string " + set1);// sorted alphabetically

        TreeSet<Integer> set2 = new TreeSet<>(Arrays.asList(10,20,30,40));


        System.out.println("set lower value to set2 " +  set2.lower(25));
        System.out.println("set lower value to set2 " +  set2.higher(25));

    }

    public static void main(String[] args) {
        createExampleOfTreeSet();

    }

}
