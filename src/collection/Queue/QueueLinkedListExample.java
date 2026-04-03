package collection.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueLinkedListExample {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        //adding elements
        queue.add("Apple");
        queue.add("Banana");
        queue.add("Mango");
        System.out.println(queue);

        //remove element
        System.out.println("remove element : " + queue.poll());

        //peek element
        System.out.println("peek element (front) " + queue.peek());

        System.out.println("after removal " + queue);

    }
}
