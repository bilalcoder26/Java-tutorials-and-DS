package Stream;

import java.util.Arrays;
import java.util.List;

public class CombinedExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Bilal","Aman","Ahmed","Rohan");
            names.stream()
                    .filter(n-> n.startsWith("A")) //KEEP only names starting with "A"
                    .map(String::toUpperCase) //.map(n-> n.toUpperCase());
                    .sorted() // sorted alphabetically
                    .forEach(n-> System.out.println("Result : " + n));
    }
}
