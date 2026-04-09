package leetcodequestion.arrayquestion;
//https://leetcode.com/problems/product-of-array-except-self/description/?envType=problem-list-v2&envId=array
/*
Given an integer array nums, return an array answer such that answer[i] is equal to the
product of all the elements of nums except nums[i].
The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
You must write an algorithm that runs in O(n) time and without using the division operation.

Example 1:

Input: nums = [1,2,3,4]
Output: [24,12,8,6]
Example 2:

Input: nums = [-1,1,0,-3,3]
Output: [0,0,9,0,0]
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProductExceptSelf_238 {
    static int[] productExceptSelfBruteForce(int[] nums ){
        if(nums == null || nums.length == 0){
            return new int[]{};
        }
        int n = nums.length;
        int[] result = new int[n];
        for(int i=0;i<n;i++){
            int product =1;
            for(int j=0;j<n;j++){
                if(i != j){
                    product *= nums[j];

                }
            }
            result[i] = product;
        }
        return result;
    }
    static int[] productofSelfOptimized(int[] nums){
        if(nums == null || nums.length == 0){
            return new int[]{};
        }
        int n = nums.length;
        int[] prefix = new int[n];
        int[] suffix = new int[n];
        int[] result = new int[n];
        //prefix
        // Step 1: Prefix
        prefix[0] = 1;
        for(int i = 1; i < n; i++){
            prefix[i] = prefix[i - 1] * nums[i - 1];
        }

        //step 2 : suffix
        suffix[n-1] =1;
        for(int i=n-2;i>=0;i--){
            suffix[i] = suffix[i+1] * nums[i+1];

        }
        // Step 3: Result
        for(int i = 0; i < n; i++){
            result[i] = prefix[i] * suffix[i];
        }

        return result;

    }
    //more optimized and memory optimized
    static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        // Step 1: Prefix store in result
        result[0] = 1;
        for(int i = 1; i < n; i++){
            result[i] = result[i - 1] * nums[i - 1];
        }

        // Step 2: Multiply with suffix
        int suffix = 1;
        for(int i = n - 1; i >= 0; i--){
            result[i] = result[i] * suffix;
            suffix *= nums[i];
        }

        return result;
    }

    public static void main(String[] args) {
       int[] ans = productExceptSelfBruteForce(new int[]{1,2,3,4});
        System.out.println(Arrays.toString(ans));
        int[] ans2 = productofSelfOptimized(new int[]{1,2,3,4});
        System.out.println(Arrays.toString(ans2));

    }
}
