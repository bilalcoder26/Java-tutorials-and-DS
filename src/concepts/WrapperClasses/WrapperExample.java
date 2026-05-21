package concepts.WrapperClasses;

public class WrapperExample {
    static void utilityMethod(){
//        Utility Methods
//        Wrapper classes provide useful methods:
        int x = Integer.parseInt("123");   // convert String → int
        String s = Integer.toString(100);  // int → String
        System.out.println("x-->" + x +" " + " s -->" + s);

    }

    static void boxingAndUnboxing(){
    //        ➤ Boxing
    //        Converting primitive → wrapper object

            int a = 10;
            Integer obj = Integer.valueOf(a);  // manual boxing
        System.out.println("a --> "+  a + " obj --> " + obj);
//        Autoboxing (automatic)
        Integer obj1 = 10;  // compiler automatically converts
//        ➤ Unboxing

//        Converting wrapper → primitive

        Integer obj2 = 20;
        int x = obj2.intValue();  // manual unboxing
    }


    public static void main(String[] args) {
        utilityMethod();
        boxingAndUnboxing();

    }
}
