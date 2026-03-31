package collection.Map.weakHashMap;

import java.lang.ref.WeakReference;

public class WeakRefExample {
    public static void main(String[] args) {
        Object strongObj = new Object();
        WeakReference<Object> weakRef = new WeakReference<>(strongObj);

        // Remove the strong reference
        strongObj = null;

        System.gc(); // suggest JVM TO RUN GC

        if(weakRef.get() == null){
            System.out.println("Object has been garbage collected");
        }else{
            System.out.println("Object is still alive");
        }
        /*
        weakRef.get() return the object only if it's not collected yet.
        once GC runs --> the object is removed from memory --> weakRef.get() become null.
         */
    }
}
