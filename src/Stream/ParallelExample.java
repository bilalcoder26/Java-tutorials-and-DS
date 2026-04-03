package Stream;

import java.util.Arrays;
import java.util.List;

public class ParallelExample {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);
        list.parallelStream()
                .forEach(n-> System.out.println("Thread : " +
                        Thread.currentThread().getName() + "Value : " + n));
    }
}
