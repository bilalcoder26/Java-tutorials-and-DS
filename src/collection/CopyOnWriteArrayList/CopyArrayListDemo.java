package collection.CopyOnWriteArrayList;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyArrayListDemo {
    static void demo(){
        CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        System.out.println("list " + list);
        list.remove("B");
        System.out.println("update list " + list);
    }
    static void threadSafeIteration(){
        CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<>(List.of(1,2,3));
        for(Integer i : list){
            list.add(100); // No concurrentModificationException
            System.out.println(i);
            //iteration works on old snapshot
        }
        System.out.println("iteration " + list);
    }
    public static void main(String[] args) {
        demo();
        threadSafeIteration();

    }
}
