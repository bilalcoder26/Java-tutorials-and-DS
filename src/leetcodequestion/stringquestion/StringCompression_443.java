package leetcodequestion.stringquestion;
/*
Example 1:

Input: chars = ["a","a","b","b","c","c","c"]
Output: 6
Explanation: The groups are "aa", "bb", and "ccc". This compresses to "a2b2c3".
Example 2:

Input: chars = ["a"]
Output: 1
Explanation: The only group is "a", which remains uncompressed since it's a single character.
Example 3:

Input: chars = ["a","b","b","b","b","b","b","b","b","b","b","b","b"]
Output: 4
Explanation: The groups are "a" and "bbbbbbbbbbbb". This compresses to "ab12".

 */


public class StringCompression_443 {

    static int stringCompression(char [] chars){
     StringBuilder sb = new StringBuilder();
     int i =0;
     while (i< chars.length){
         int j=i;
         while (j<chars.length && chars[i] == chars[j]){
             j++;
         }
         sb.append(chars[i]);
         int len = j-i;
         if(len > 1){
             sb.append(len);
         }
         i = j;
     }
     for(i=0;i<sb.length();i++){
         chars[i] = sb.charAt(i);
     }
     return  sb.length();
    }

    static int stringCompressionOptimized(char[] chars){
        int read =0; // original array ko scan karne ke liye
        int write =0; // compressed array me write karne ke liye

        while(read < chars.length){
            char currentChar = chars[read];
            int count =0;
            while(read < chars.length && chars[read] == currentChar){
                read++;
                count++;
            }
            chars[write] = currentChar;
            write++;

            if(count > 1){
                String cnt = String.valueOf(count);
                for(char c : cnt.toCharArray()){
                    chars[write] = c;
                    write++;
                }
            }
        }
        return write;

    }

    public static void main(String[] args) {
        int ans  = stringCompression(new char[] {'a','a','b','b','c','c','c'});
        System.out.println(ans);
        int ans2  = stringCompressionOptimized(new char[] {'a','a','b','b','c','c','c'});
        System.out.println(ans2);
    }
}
