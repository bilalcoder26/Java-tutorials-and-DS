package leetcodequestion.stringquestion;
//https://leetcode.com/problems/reverse-string/description/?envType=problem-list-v2&envId=string
/*
Write a function that reverses a string. The input string is given as an array of characters s.

You must do this by modifying the input array in-place with O(1) extra memory.

Example 1:

Input: s = ["h","e","l","l","o"]
Output: ["o","l","l","e","h"]
Example 2:

Input: s = ["H","a","n","n","a","h"]
Output: ["h","a","n","n","a","H"]
 */

public class ReverseString_344 {

    static void reverseString(char[] chars){
        int left=0;
        int right= chars.length-1;
        while (left < right){
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;

        }

    }

    public static void main(String[] args) {
        char[] arr = {'h','e','l','l','o'};
        reverseString(arr);
        System.out.println(new String(arr));

    }

}
