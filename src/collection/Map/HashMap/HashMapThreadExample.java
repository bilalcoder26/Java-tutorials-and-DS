package collection.Map.HashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMapThreadExample {
    static Map<Integer,Integer> map = new HashMap<>();
    static int[] data = {1,2,3,4,5,6,7,8,9,10};

    public static void main(String[] args) throws  InterruptedException{
        Thread t1 = new Thread(new Worker(), "T1");
        Thread t2 = new Thread(new Worker(), "T2");
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("Final HashMap size = " + map.size());
        System.out.println("HashMap content : " + map);

    }

    static  class Worker implements  Runnable {
        @Override
        public void run() {
            for(int num :data){
                map.put(num,num); // multiple thread modifying same map
                try{
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
