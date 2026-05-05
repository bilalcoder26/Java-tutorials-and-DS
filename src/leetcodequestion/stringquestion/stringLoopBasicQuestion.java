package leetcodequestion.stringquestion;

public class stringLoopBasicQuestion {

    //simple loop
    static String simpleLoop(String str){
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            System.out.println(ch);

        }

        return str;
    }

    //enchaned loop
    static String enhancedLoop(String str){
        for(char ch: str.toCharArray()){
            System.out.println(ch);

        }
        return str;
    }

    //using while loop
     static String usingWhileLoop(String str){
        int i =0;
        while (i< str.length()){
            System.out.println(str.charAt(i));
            i++;
        }
        return str;
     }

     //USING JAVA8 STREAM;
    static  String usingStream(String str){
        str.chars().forEach(c-> System.out.println((char) c));
        return str;
    }

    //or using method reference

    static  String usingMethodReference(String str){
        str.chars().forEach(System.out::println);
        return str;
    }
    //PRINTS CHARACTER DIRECTLY

    static String usingMapObj(String str){
        str.chars().mapToObj(c-> (char) c).forEach(System.out::println);
        return str;
    }

    public static void main(String[] args) {
        System.out.println("simpleLoop " + simpleLoop("Bilal Ahmed"));
        System.out.println("enchaned loop " + enhancedLoop("sumit maurya"));
        System.out.println("while loop " + usingWhileLoop("RAAJU NEGI"));
        System.out.println("using stream java 8 feature " + usingStream("Rohit kale"));
        System.out.println("using methode reference " + usingMethodReference("sanjay kv")); //print the ASCII VALUES
        System.out.println("using mapObject " + usingMapObj("virat kholi"));

    }
}
