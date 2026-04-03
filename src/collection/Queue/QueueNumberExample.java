package collection.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueNumberExample {
    public static void main(String[] args) {
        Queue<Integer> numbers = new LinkedList<>();
        numbers.offer(10);
        numbers.offer(20);
        numbers.offer(30);
        while(!numbers.isEmpty()){
            System.out.println(numbers.poll());
        }
    }
}
