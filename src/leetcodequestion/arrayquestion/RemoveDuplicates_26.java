package leetcodequestion.arrayquestion;
//https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/?envType=problem-list-v2&envId=array


import java.util.Arrays;

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
    //two-pointer :slow and faster pointer
    static int removeDuplicate(int[] nums){
        int i =1;
        for(int j=1;j<nums.length;j++){
            if(nums[j] != nums[j-1]){
                nums[i] = nums[j];
                i++;
            }

        }

        return i;

    }

    public static void main(String[] args) {
       int ans = removeDuplicate(new int[] {1,1,2});
        System.out.println(ans);
        int ans2 = removeDuplicate(new int[] {0,0,1,1,1,2,2,3,3,4});
        System.out.println(ans2);

    }
}
