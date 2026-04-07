package leetcodequestion.arrayquestion;
//https://leetcode.com/problems/two-sum/description/?envType=problem-list-v2&envId=array
/*
Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]
Example 3:

Input: nums = [3,3], target = 6
Output: [0,1]
 */

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    static int[] twoSumBF(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[0];
    }
    static int[] twoSum(int[] arr, int target){
        if(arr == null || arr.length == 0){
            throw  new IllegalArgumentException("Array is not empty");
        }
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i< arr.length;i++){
            int complement = target-arr[i];
            if(map.containsKey(complement)){
                return new int[] {map.get(complement), i};
            }
            map.put(arr[i],i);
        }
        return new int[]{-1, -1};

    }

    public static void main(String[] args) {
        int[] result = twoSum(new int[]{2,7,11,15},9);
        System.out.println(Arrays.toString(result));
        int[] result2 = twoSum(new int[]{3,2,4},6);
        System.out.println(Arrays.toString(result2));
    }
}
