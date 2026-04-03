package Stream;

import java.util.Arrays;
import java.util.List;

public class ReduceExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5,10,15);
        int sum = numbers.stream()
                .reduce(0,(a,b) -> a+b);
        // reduce (0,...) : start with 0 , then add each number
        System.out.println("Sum = " + sum);
    }
}
