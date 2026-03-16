package DataStructure.Blind75;
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

public class IsValidAnagram {
    static boolean isAnagram(String str1, String str2){
        if(str1.length() != str2.length()) return false;
        Map<Character,Integer> counts = new HashMap<>();

        for (char c : str1.toCharArray()) {
            counts.put(c,counts.getOrDefault(c, 0) +1);
        }
        for(char c : str2.toCharArray()){
            if(!counts.containsKey(c)) return false;

            int next = counts.get(c) -1;
            if(next == 0){
                counts.remove(c);
            }else{
                counts.put(c, next);
            }
        }

        return counts.isEmpty();
    }
    public static void main(String[] args) {
        System.out.println(isAnagram("anagram", "nagaram"));
        System.out.println(isAnagram("cat", "rat"));

    }
}
