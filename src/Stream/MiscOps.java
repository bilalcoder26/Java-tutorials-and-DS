package Stream;

import java.util.Arrays;
import java.util.List;

public class MiscOps {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5,2,8,2,9,1,5);
        numbers.stream()
                .distinct()
                //removes duplicates --> [5,2,8,9,1]
                .sorted()
                .limit(3)
                // Take only first 3 - > [1,2,5]
                .forEach(n-> System.out.println("Value : " + n));
    }
}
