package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class CollectExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Bilal","Aman","Ahmed","Rohan","Bilal");

        List<String> list = names.stream()
                .collect(Collectors.toList());
        // collect() : terminate stream and return a list

        Set<String> set = names.stream().collect(Collectors.toSet());
        System.out.println("list : " + list);
        System.out.println("set : " + set);
    }
}
