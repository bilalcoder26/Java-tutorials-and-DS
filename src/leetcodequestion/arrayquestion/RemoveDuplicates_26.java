package leetcodequestion.arrayquestion;
//https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/?envType=problem-list-v2&envId=array

import java.util.HashSet;
import java.util.Set;

/*
Example 1:

Input: nums = [1,1,2]
Output: 2, nums = [1,2,_]
Explanation: Your function should return k = 2, with the first two elements of nums being 1 and 2 respectively.
It does not matter what you leave beyond the returned k (hence they are underscores).
Example 2:

Input: nums = [0,0,1,1,1,2,2,3,3,4]
Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]
Explanation: Your function should return k = 5, with the first five elements of nums being 0, 1, 2, 3, and 4 respectively.
It does not matter what you leave beyond the returned k (hence they are underscores).
 */
public class RemoveDuplicates_26 {
    static int[] removeDuplicate(int[] nums){
        int left =0;
        int count =0;
        for(int right=0;right<nums.length;right++){
            if(nums[left] == nums[right]){
                left++;
                count++;
            }else{
                int temp = nums[right];
                
            }

        }

        return new int[]{};

    }

    public static void main(String[] args) {
        removeDuplicate(new int[] {1,1,2});

    }
}
