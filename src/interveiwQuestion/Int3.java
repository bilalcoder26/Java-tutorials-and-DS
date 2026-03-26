package interveiwQuestion;
//input s ="abcabcbb"
//output =3;
//input s= "bbbbb"
//output =1
//input s ="pwwkew"
//output 3

import java.util.HashSet;
import java.util.Set;

public class Int3 {


static int longestSubstring(String str){
    Set<Character> seen = new HashSet<>();

    int maxLength = 0;
    int start = 0;

    for(int end = 0; end < str.length(); end++){
        char currentChar = str.charAt(end);

        while(seen.contains(currentChar)){
            seen.remove(str.charAt(start));
            start++;
        }

        seen.add(currentChar);
        maxLength = Math.max(maxLength, seen.size());
    }

    return maxLength;
}
    public static void main(String[] args) {

        System.out.println(longestSubstring("abcabcbb"));
    }
}
