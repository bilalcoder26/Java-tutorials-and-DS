package collection.Map.weakHashMap;

import java.util.WeakHashMap;

public class WeakHashMapDemo {
    public static void main(String[] args) {
        WeakHashMap<Object, String> map = new WeakHashMap<>();
        Object key = new Object();
        map.put(key, "some value");

        key = null; // remove the strong reference
        System.gc(); // request garbage collection
        try{
            Thread.sleep(100);
        }catch (Exception ignored){

        }
        System.out.println(map);
        /*
        Expected output
        {}
        Key had no strong reference
        GC CLEARED IT
        Map entry automatically removed
         */
    }
}

