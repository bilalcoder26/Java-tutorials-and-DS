package leetcodequestion.stringquestion.InterviewQuestion;
//https://leetcode.com/problems/longest-substring-without-repeating-characters/description/?envType=problem-list-v2&envId=string
/*
Example 1:

Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3. Note that "bca" and "cab" are also correct answers.
Example 2:

Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
Example 3:

Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
 */

import java.util.HashMap;
import java.util.Map;

public class LongestSubstring {
    static int longestSubstring(String str){
        Map<Character,Integer> map = new HashMap<>();
        int maxLength =0;
        int start=0;
        for(int end=0;end<str.length();end++){
            char currentChar = str.charAt(end);
            if(map.containsKey(currentChar)){
                start = Math.max(start, map.get(currentChar) + 1);
            }

            map.put(currentChar,end);
            maxLength = Math.max(maxLength,end-start+1);
        }
        return  maxLength;

    }

    public static void main(String[] args) {
        int ans = longestSubstring("abcabcbb");
        System.out.println(ans);
        int ans2 = longestSubstring("bbbb");
        System.out.println(ans2);

    }
}
