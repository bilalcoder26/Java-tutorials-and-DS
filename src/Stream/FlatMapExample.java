package Stream;

import java.util.Arrays;
import java.util.List;

public class FlatMapExample {
    public static void main(String[] args) {
        List<List<Integer>> listOfLists = Arrays.asList(
                Arrays.asList(1,2),
                Arrays.asList(3,4),
                Arrays.asList(5,6)
        );
        listOfLists.stream()
                .flatMap(list -> list.stream())
                //flatMap : flattens sublists into a single continuous stream
                .forEach(n -> System.out.println(n + " "));
    }
}
