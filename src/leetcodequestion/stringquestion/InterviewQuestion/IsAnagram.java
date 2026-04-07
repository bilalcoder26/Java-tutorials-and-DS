package leetcodequestion.stringquestion.InterviewQuestion;
/*
Given two strings s and t, return true if t is an anagram of s, and false otherwise.



Example 1:

Input: s = "anagram", t = "nagaram"

Output: true

Example 2:

Input: s = "rat", t = "car"

Output: false
 */

import java.util.HashMap;
import java.util.Map;

public class IsAnagram {
    static boolean isAnagram(String str1, String str2){
        if(str1.length() != str2.length()) return false;
        Map<Character,Integer> map = new HashMap<>();
        /*
            for(int i=0;i< str.length();i++){
            char ch = str.charAt(i);
            if(map.containsKey(ch)){
                map.put(ch, map.get(ch) + 1);
            }else{
                map.put(ch,1);
            }
        }

         */
        //optimized no need if else
        for(char ch : str1.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        System.out.println("map "+ map);
        for(char ch :str2.toCharArray()){
            if(!map.containsKey(ch)) return false;
            int next = map.get(ch) -1;
            if(next == 0){
                map.remove(ch);
            }else{
                map.put(ch, next);
            }
        }
        return map.isEmpty();
    }

    public static void main(String[] args) {
        boolean ans = isAnagram("anagram", "nagaram");
        System.out.println("ans :" + ans);
        boolean ans2 = isAnagram("cat", "rat");
        System.out.println("ans2 :" + ans2);

    }
}
