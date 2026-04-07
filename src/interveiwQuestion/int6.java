package interveiwQuestion;

//print n natural number
public class int6 {
    static void printNaturalNum(int n){
        // base case
        if(n == 11) return;

        System.out.println(n);

        printNaturalNum(n + 1);
    }

    public static void main(String[] args) {
        printNaturalNum(1);
    }

}
