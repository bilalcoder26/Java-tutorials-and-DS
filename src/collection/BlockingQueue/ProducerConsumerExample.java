package collection.BlockingQueue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ProducerConsumerExample {
    public static void main(String[] args) {
        BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(5);

        //Producer
        new Thread(() -> {
            try{
                queue.put(10);
                System.out.println("Producer");

            }catch(InterruptedException e){
                e.printStackTrace();

            }
        }).start();

        //consumer
        new Thread(() -> {
            try{
                Integer value = queue.take();
                System.out.println("Consumer : " + value);

            }catch(InterruptedException e){
                e.printStackTrace();

            }
        }).start();
    }
}
