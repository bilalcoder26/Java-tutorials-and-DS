package collection.Vector;

import java.util.Vector;

public class VectorDemo {
    static void vectorFun(){
        Vector<Integer> v  = new Vector<>();
        v.add(10);
        v.add(20);
        v.add(30);
        v.addElement(40); //legacy method

        System.out.println("vetor list " + v);
        System.out.println(v.get(1));
    }
    public static void main(String[] args) {
        vectorFun();

    }
}
