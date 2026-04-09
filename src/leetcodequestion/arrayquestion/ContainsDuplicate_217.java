package leetcodequestion.arrayquestion;
//https://leetcode.com/problems/contains-duplicate/description/
/*
Given an integer array nums, return true if any value appears at least twice in the array,
and return false if every element is distinct.

Example 1:
Input: nums = [1,2,3,1]
Output: true

Explanation:
The element 1 occurs at the indices 0 and 3.

Example 2:
Input: nums = [1,2,3,4]
Output: false

Explanation:
All elements are distinct.

Example 3:
Input: nums = [1,1,1,3,3,4,3,2,4,2]
Output: true
 */

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate_217 {
    static boolean containDuplicate(int[] nums){
        if(nums == null || nums.length == 0){
            throw new IllegalArgumentException("Array must not be empty");
        }
        Set<Integer> set = new HashSet<>();
        for(int num : nums){
            if(set.contains(num)) return true;
            set.add(num);
        }
        return false;
    }

    public static void main(String[] args) {
        boolean ans =  containDuplicate(new int[] {1,2,3,1});
        boolean ans2 =  containDuplicate(new int[] {1,2,3,4});
        boolean ans3 =  containDuplicate(new int[] {1,1,1,3,3,4,3,2,4,2});
        System.out.println("ans: " + ans);
        System.out.println("ans2: " + ans2);
        System.out.println("ans3: " + ans3);

    }
    /*
    🧠 Interview Follow-up (VERY IMPORTANT)

Interviewer may ask:

❓ Can you do it without extra space?
Answer:

👉 Yes, using sorting

Arrays.sort(nums);

for(int i = 1; i < nums.length; i++){
    if(nums[i] == nums[i-1]){
        return true;
    }
}
return false;
     */
}
