package leetcodequestion.recursionQuestion;

// print number 1 to N
public class PrintNumber {
    static  void printNumber(int n){
        if(n==0) return; // base case
        printNumber(n-1);
        System.out.println(n);


    }
    public static void main(String[] args) {
//        System.out.println(printNumber(10));
        printNumber(10);
    }
}
