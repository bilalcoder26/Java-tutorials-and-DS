package leetcodequestion.recursionQuestion;

public class SumOfNaturalNumber {
    static int sum(int num){
        if(num == 0){
            return 0;
        }
        return num + sum(num-1);
    }

    public static void main(String[] args) {
       int ans =  sum(10);
        System.out.println(ans);
    }
}
