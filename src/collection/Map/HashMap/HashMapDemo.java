package collection.Map.HashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    static void mapDemo(){
        Map<Integer, String> map = new HashMap<>();
        map.put(1,"Apple");
        map.put(2,"banana");
        map.put(3,"cherry");
        System.out.println("after insertion  " + map);
        System.out.println("key 2 : " + map.get(2));

        //Iterate map
        for(Map.Entry<Integer,String> entry : map.entrySet()){
            System.out.println("key " + entry.getKey() + " --> " + entry.getValue());
        }
    }
    public static void main(String[] args) {
        mapDemo();

    }
}
