package collection.LinkedList;

import java.util.LinkedList;

public class LinkedListDemo {

    static void basicLinkedListFun(){
        LinkedList<String> list = new LinkedList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.addFirst("START");
        list.addLast("END");
        System.out.println("inserted list " + list);
        System.out.println("remove c element "+     list.remove("C"));
        System.out.println("remove first element " + list.removeFirst());
        System.out.println("updated list " + list);

    }
    public static void main(String[] args) {
        basicLinkedListFun();

    }
}
