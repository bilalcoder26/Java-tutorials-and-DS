package leetcodequestion.stringquestion;
//https://leetcode.com/problems/group-anagrams/description/?envType=problem-list-v2&envId=string

/*
Given an array of strings strs, group the anagrams together. You can return the answer in any order.

Example 1:

Input: strs = ["eat","tea","tan","ate","nat","bat"]
Output: [["bat"],["nat","tan"],["ate","eat","tea"]]

Explanation:

There is no string in strs that can be rearranged to form "bat".
The strings "nat" and "tan" are anagrams as they can be rearranged to form each other.
The strings "ate", "eat", and "tea" are anagrams as they can be rearranged to form each other.

Example 2:

Input: strs = [""]
Output: [[""]]

Example 3:

Input: strs = ["a"]

Output: [["a"]]
 */

import java.util.*;

public class GroupAnagram_49 {
    static List<List<String>> groupAnagram(String[] strs){
        Map<String,List<String>> groups = new HashMap<>();
        for(String s : strs){
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);
            if(!groups.containsKey(key)){
                groups.put(key, new ArrayList<>());
            }
            groups.get(key).add(s);

        }
        return new ArrayList<>(groups.values());


    }

    static List<List<String>> groupAnagramOptimized(String[] strs){
        Map<String, List<String>> groups = new HashMap<>();

        for(String s: strs){
            int[] freq = new int[26];

            for(char c : s.toCharArray()){
                freq[c-'a']++;
            }
            System.out.println("s ---> " + s + " " + "freq  ---> " + Arrays.toString(freq));
            // convert frequency to string key
            StringBuilder key = new StringBuilder();
            for(int count : freq){
                key.append('#');
                key.append(count);
//                System.out.println("s----> " + s + " " + "count ----> " + count);

            }
            if(!groups.containsKey((key.toString()))){
                groups.put(key.toString(), new ArrayList<>());
            }
            groups.get(key.toString()).add(s);
        }
        return new ArrayList<>(groups.values());
    }

    public static void main(String[] args) {
        List<List<String>> result = groupAnagram(
                new String[]{"eat","tea","tan","ate","nat","bat"}
        );
        for(List<String> group : result){
            System.out.println(group);
        }
        List<List<String>> result1 = groupAnagramOptimized(
                new String[]{"eat","tea","tan","ate","nat","bat"}
        );
        for(List<String> group : result1){
            System.out.println(group);
        }

    }
}
