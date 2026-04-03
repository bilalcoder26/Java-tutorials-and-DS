package Stream;

import java.util.Arrays;
import java.util.List;

public class MatchExample {
    public static void main(String[] args) {

        List<Integer> numbers  = Arrays.asList(10,20,30);
        boolean anyDivisibleBy3 = numbers.stream().anyMatch(n-> n %3 == 0);
        boolean allEven = numbers.stream().allMatch(n -> n % 2 ==0);
        boolean noneNegative = numbers.stream().noneMatch(n -> n < 0);

        System.out.println(anyDivisibleBy3);
        System.out.println(allEven);
        System.out.println(noneNegative);

    }
}
