package collection.Queue;

import java.util.PriorityQueue;
import java.util.Queue;

/*
PriorityQueue does not follow FIFO Strictly
element are removed based on priority (Smallest first)
 */
public class PriorityQueueExample {
    public static void main(String[] args) {
        Queue<Integer> pq = new PriorityQueue<>();
        pq.add(40);
        pq.add(30);
        pq.add(50);
        while(!pq.isEmpty()){
            System.out.println(pq.poll());
        }
    }
}
