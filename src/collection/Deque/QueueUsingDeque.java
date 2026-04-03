package collection.Deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class QueueUsingDeque {
    public static void main(String[] args) {
        Deque<Integer> queue = new ArrayDeque<>();
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);

        while(!queue.isEmpty()){
            System.out.println(queue.poll());
        }
    }
}
