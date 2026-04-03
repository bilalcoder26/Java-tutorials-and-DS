package collection.Map.concurrentSkipListMap;

import java.util.concurrent.ConcurrentSkipListMap;

public class ConcurrentSkipListMapDemo {

    public static void main(String[] args) {
        ConcurrentSkipListMap<Integer, String> map = new ConcurrentSkipListMap<>();
        map.put(3,"c");
        map.put(1,"a");
        map.put(2,"b");
        map.put(4,"d");
        System.out.println(map);
    }
}
