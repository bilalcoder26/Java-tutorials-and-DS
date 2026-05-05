package leetcodequestion.stringquestion;
//https://leetcode.com/problems/valid-palindrome/description/?envType=problem-list-v2&envId=string
/*
Example 1:

Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.
Example 2:

Input: s = "race a car"
Output: false
Explanation: "raceacar" is not a palindrome.
Example 3:

Input: s = " "
Output: true
Explanation: s is an empty string "" after removing non-alphanumeric characters.
Since an empty string reads the same forward and backward, it is a palindrome.
 */
public class ValidPalindrome_125 {
    static boolean isPalindrome(String strs){
        String updatedStr = strs.toLowerCase().replaceAll("[^a-z]", "");
        System.out.println(updatedStr);
        int left =0;
        int right = updatedStr.length() -1;
        while (left < right){
            if(updatedStr.charAt(left) != updatedStr.charAt(right)){
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    static boolean isPlaindromeOptimized(String strs){
        int left =0;
        int right = strs.length()-1;
        while (left < right){
            while(left< right && !Character.isLetterOrDigit(strs.charAt(left))){
                left++;
            }
            while(left < right && !Character.isLetterOrDigit(strs.charAt(right))){
                right--;
            }
            if(Character.toLowerCase(strs.charAt(left)) != Character.toLowerCase(strs.charAt(right))){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        boolean ans = isPalindrome("A man, a plan, a canal: Panama");
        System.out.println(ans);

        boolean ans2 = isPalindrome("race a car");
        System.out.println(ans2);

        boolean ans3 = isPlaindromeOptimized("A man, a plan, a canal: Panama");

        System.out.println("optimized --->  " + ans3);


    }
}
