package collection.Deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeExample {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();
        deque.addFirst(10); // front
        deque.addLast(20); // Rear
        deque.addLast(30);
        deque.addFirst(5);
        System.out.println(deque);

        //rEMOVE Element
        System.out.println("remove element " + deque.removeFirst());
        System.out.println("remove last " +  deque.removeLast());

        System.out.println(deque);
    }
}
