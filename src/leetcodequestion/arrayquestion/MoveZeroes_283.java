package leetcodequestion.arrayquestion;
// https://leetcode.com/problems/move-zeroes/description/?envType=problem-list-v2&envId=array

/*
Example 1:

Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]
Example 2:

Input: nums = [0]
Output: [0]
 */

import java.util.Arrays;

public class MoveZeroes_283 {
    static int [] moveZeroes(int[] nums){
        int left =0;
        for(int right =0;right<nums.length;right++){
            if(nums[right] != 0){
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left++;
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] ans = moveZeroes(new int[]{0,1,0,3,12});
        System.out.println(Arrays.toString(ans));
    }
}
