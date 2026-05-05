package leetcodequestion.stringquestion;

//https://leetcode.com/problems/reverse-words-in-a-string/description/?envType=problem-list-v2&envId=string


public class ReverseWord_151 {
    static String reverseWord(String str){
        String arr[] = str.split(" ");
        String res = "";
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i].length() == 0){
                continue;
            }
            if(res.length() == 0){
                res += arr[i];
            }else{
                res += " " + arr[i];
            }
        }
        return res;
    }
    static String reverseWordOptimized(String str){
        String arr[] = str.trim().split("\\s+");
        StringBuilder res = new StringBuilder();

        for(int i = arr.length - 1; i >= 0; i--){
            res.append(arr[i]);
            if(i != 0){
                res.append(" ");
            }
        }
        return res.toString();
    }

    public static void main(String[] args) {
        String result = reverseWord("the sky is blue");
        System.out.println(result);

        String result1 = reverseWordOptimized("the sky is blue");
        System.out.println(result1);
    }
}
