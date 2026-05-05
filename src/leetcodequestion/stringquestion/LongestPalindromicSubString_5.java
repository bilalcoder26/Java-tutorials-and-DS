package leetcodequestion.stringquestion;

//https://leetcode.com/problems/longest-palindromic-substring/description/?envType=problem-list-v2&envId=string
/*
Given a string s, return the longest palindromic substring in s.
Example 1:

Input: s = "babad"
Output: "bab"
Explanation: "aba" is also a valid answer.
Example 2:

Input: s = "cbbd"
Output: "bb"
Constraints:

1 <= s.length <= 1000
s consist of only digits and English letters.
 */

public class LongestPalindromicSubString_5 {
    static
    String longestPalindrome(String str){
        if(str == null || str.length() <1) return "";
        int start =0;
        int end =0;
        for(int i=0; i<str.length(); i++){
            int len1 = expandFromCenter(str, i, i);
            int len2 = expandFromCenter(str, i, i+2);

            int len = Math.max(len1, len2);
            if(len > end -start ){
                start = i -(len-1)/2;
                end = i + len /2;
            }

        }
        return str.substring(start, end +1);

    }

    static int expandFromCenter(String str, int left, int right){
        while(left >=0 && right < str.length() && str.charAt(left) == str.charAt(right)){
            left--;
            right++;

        }
        return right - left -1;

    }

    public static void main(String[] args) {

        String ans  = longestPalindrome("babad");
        System.out.println(ans);

    }


}
