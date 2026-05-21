package leetcodequestion.recursionQuestion;

public class fabonacci {
    static int fabonacci(int n){
        if(n<=1){
            return n;
        }
        return fabonacci(n-1) + fabonacci(n-2);
    }
}
