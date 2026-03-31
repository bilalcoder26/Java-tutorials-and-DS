package collection.Map.HashMap;

import java.util.HashMap;
import java.util.Map;

public class WordCount {

    public static void main(String[] args) {
        String text = "apple banana apple mango banana apple";
        Map<String,Integer> freq = new HashMap<>();
        for(String word : text.split(" ")){
            freq.put(word, freq.getOrDefault(word,0) +1);
        }
        System.out.println(freq);

    }
}
