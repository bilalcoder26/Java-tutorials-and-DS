package collection.Map.concurrentSkipListSet;

import java.util.concurrent.ConcurrentSkipListSet;

public class ConcurrentSkipListSetDemo {

    public static void main(String[] args) {
        ConcurrentSkipListSet<String> set  = new ConcurrentSkipListSet<>();
        set.add("apple");
        set.add("banana");
        set.add("orange");
        System.out.println(set);
    }
}
