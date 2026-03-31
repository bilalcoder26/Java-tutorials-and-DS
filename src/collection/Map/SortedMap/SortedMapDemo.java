package collection.Map.SortedMap;

import java.util.Comparator;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapDemo {
    static void sortedMapFun(){
        SortedMap<Integer,String> map = new TreeMap<>();
        map.put(20, "Ali");
        map.put(5, "Bilal");
        map.put(15, "Manoj");
        System.out.println("The keys are automatically sorted " + map);

    }
    static void basicUsecase(){
        SortedMap<Integer, String> map = new TreeMap<>();
        map.put(10, "A");
        map.put(20, "B");
        map.put(30, "C");
        map.put(40, "D");
        map.put(50, "E");
        System.out.println("subMap useCase " + map.subMap(10,30));
        System.out.println("headMap useCase " + map.headMap(30));
        System.out.println("tailmap useCase " + map.tailMap(20));
    }
    static void CustomSortingUsingComparator(){
        SortedMap<Integer, String> map = new TreeMap<>(Comparator.reverseOrder());
        map.put(1,"one");
        map.put(3,"three");
        map.put(2,"two");
        System.out.println("CustomSortingUsingComparator " + map);
    }
    public static void main(String[] args) {
        sortedMapFun();
        basicUsecase();
        CustomSortingUsingComparator();

    }

}
