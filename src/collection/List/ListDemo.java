package collection.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo {
    static void listExample(){
        List<String> languages  = new ArrayList<>();
        languages.add("java");
        languages.add("python");
        languages.add("javascript");
        languages.add("java");
        System.out.println("languages list : " + languages);

        //enhanced loop
        for(String lang : languages){
            System.out.println(lang);
        }
        //using Iterator
        Iterator<String> it = languages.iterator();
        while(it.hasNext()){
            System.out.println("while loop using iteratot " + it.next());
        }





    }

    static void listIndexingExample(){
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add(1,"B");
        System.out.println("index before updatation " + list);
        list.set(0,"Z");
        System.out.println("index AFTER updatation " + list);
        String first = list.get(0);
        System.out.println("search first element " + first);
        System.out.println("CHECK IF VALUES CONTAINS " + list.contains("B"));
        System.out.println("find indexof " + list.indexOf("B"));
        System.out.println("find last indexof " + list.lastIndexOf("B"));

    }
    public static void main(String[] args) {
        listExample();
        listIndexingExample();

    }
}
