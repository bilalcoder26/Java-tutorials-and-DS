package collection.Map.HashTable;

import java.util.Hashtable;

public class HashTableDemo {
    public static void main(String[] args) {
        Hashtable<Integer,String> table = new Hashtable<>();
        table.put(1, "A");
        table.put(2, "B");
        table.put(3, "C");
        System.out.println("table " + table);
        System.out.println("value for key 2 : " + table.get(2));
    }
}
