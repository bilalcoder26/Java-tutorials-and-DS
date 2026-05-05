package leetcodequestion.stringquestion;

//https://leetcode.com/problems/count-the-number-of-consistent-strings/description/?envType=problem-list-v2&envId=string

import java.util.HashSet;
import java.util.Set;

/*
Example 1:

Input: allowed = "ab", words = ["ad","bd","aaab","baa","badab"]
Output: 2
Explanation: Strings "aaab" and "baa" are consistent since they only contain characters 'a' and 'b'.
Example 2:

Input: allowed = "abc", words = ["a","b","c","ab","ac","bc","abc"]
Output: 7
Explanation: All strings are consistent.
Example 3:

Input: allowed = "cad", words = ["cc","acd","b","ba","bac","bad","ac","d"]
Output: 4
Explanation: Strings "cc", "acd", "ac", and "d" are consistent.
 */
public class countConsistentString_1684 {

    static int countConsistentString(String allowed, String[] words){
        int count =0;
        Set<Character> set = new HashSet<>();
        for(char c : allowed.toCharArray()){
            set.add(c);
        }

//        System.out.println(set);

        for(String word : words){
            boolean isValid = true;

            for (char c: word.toCharArray()){
                if(!set.contains(c)){
                    isValid = false;
                    break;
                }

            }
            if(isValid) count++;

        }
        return count;

    }

    static int countConsistentStringOptimized(String allowed, String[] words){
        boolean[] allowedArr = new boolean[26];

        for(char c : allowed.toCharArray()){
            allowedArr[c-'a'] = true;
        }
        int count =0;
        for(String word : words){
            boolean isValid = true;

            for (char c: word.toCharArray()){
                if(!allowedArr[c-'a']){
                    isValid = false;
                    break;
                }

            }
            if(isValid) count++;

        }
        return count;
    }

    public static void main(String[] args) {
        int ans = countConsistentString("ab", new String[]{"ad","bd","aaab","baa","badab"});
        System.out.println(ans);

        int ans2 = countConsistentStringOptimized("ab", new String[]{"ad","bd","aaab","baa","badab"});
        System.out.println(ans2);
    }
}
