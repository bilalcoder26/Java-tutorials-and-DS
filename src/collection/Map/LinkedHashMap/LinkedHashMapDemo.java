package collection.Map.LinkedHashMap;

import java.util.LinkedHashMap;
import java.util.Map;

//insertion order maintained

public class LinkedHashMapDemo {
    public static void main(String[] args) {
        Map<String,Integer> scores = new LinkedHashMap<>();
        scores.put("Bilal",90);
        scores.put("AMIT",98);
        scores.put("Ravi", 85);
        System.out.println(scores);

    }
}
