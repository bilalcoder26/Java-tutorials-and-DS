package Stream;

import java.util.Arrays;
import java.util.List;

public class FilterExample {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10,15,20,25,30);
        numbers.stream()
                .filter(n->n %2 == 0)
                //filter() :keeps only elements where condition is true--> even number
                .forEach(n -> System.out.println("Even: " + n));
    }

}
