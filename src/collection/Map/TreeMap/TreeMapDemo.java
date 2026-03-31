package collection.Map.TreeMap;
//using sorted keys


import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(30,"delhi");
        treeMap.put(10,"mumbai");
        treeMap.put(20,"pune");

        System.out.println(treeMap);
    }
}
