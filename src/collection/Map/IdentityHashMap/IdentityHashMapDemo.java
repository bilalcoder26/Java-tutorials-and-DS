package collection.Map.IdentityHashMap;

import java.util.IdentityHashMap;

public class IdentityHashMapDemo {
    public static void main(String[] args) {
        IdentityHashMap<String, String> map = new IdentityHashMap<>();
        String key1 = new String("Hello");
        String key2 = new String("Hello"); // same content , different object

        System.out.println("identityhascode key1 " + System.identityHashCode(key1));
        System.out.println("identityhascode key2 " + System.identityHashCode(key2));
        System.out.println("hashcode simple map key1 " + key1.hashCode());
        System.out.println("hashcode simple map key2 " + key2.hashCode());

        map.put(key1, "value1");
        map.put(key2, "value2");
        System.out.println(map.size()); // 2

        /*
        Explanation
            * key1 and key2 have same value , but are different objects
            * IdentityHashMap Treats them as two separate keys
            * In normal HashMap ---> size would be 1.
         */
    }
}
