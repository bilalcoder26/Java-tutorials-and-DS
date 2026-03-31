package collection.Map.HashTable;


import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class HashTableThreadExample {
    static Map<Integer,Integer> map = new Hashtable<>();
    static int[] data = {1,2,3,4,5,6,7,8,9,10};

    public static void main(String[] args) throws  InterruptedException{
        Thread t1 = new Thread(new Worker(), "T1");
        Thread t2 = new Thread(new Worker(), "T2");
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("Final HashTable size = " + map.size());
        System.out.println("HashTable content : " + map);

    }

    static  class Worker implements  Runnable {
        @Override
        public void run() {
            for(int num :data){
                map.put(num,num); // synchronized method in Hashtable
                try{
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}

