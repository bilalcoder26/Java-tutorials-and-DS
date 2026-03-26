package collection.ArrayList;

import java.util.*;

public class ArrayListDemo {

    static void arrayListExamples(){
        ArrayList<String> list = new ArrayList<>();
        list.add("Bilal");
        list.add("java");
        list.add("Bilal");
        System.out.println("arrayList " + list);
        System.out.println("get element " + list.get(1));
        System.out.println("remove element " + list.remove(0));
        System.out.println("updated list " + list);
    }

    static void arrayListSorting(){
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        Collections.sort(numbers);
        System.out.println("arrayListSorting " + numbers);
    }

    static void arrayAsListExample(){
        List<String> list  = Arrays.asList("A","B","C");
//        list.add("D"); //throw exception

        List<String> list1 = new ArrayList<>(Arrays.asList("A","B","C"));
        list1.add("D");
    }
    public static void main(String[] args) {
        arrayListExamples();
        arrayListSorting();
        arrayAsListExample();

    }
}
