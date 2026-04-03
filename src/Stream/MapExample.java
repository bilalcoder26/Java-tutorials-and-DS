package Stream;

import java.util.Arrays;
import java.util.List;

public class MapExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("bilal","ravi","aman");

        names.stream()
                .map(String::toUpperCase) // method reference
                //lambda function .map(name -> name.toUpperCase())
                //map() : transform each element --> convert to uppercase
                .forEach(result -> System.out.println("Upper case : " + result));
    }
}
