package leetcodequestion.arrayquestion;
/*
Kadane’s Algorithm ek bahut famous algorithm hai jo maximum subarray sum find karta hai —
 yani array ke andar continuous elements ka aisa part jiska sum sabse zyada ho.

🔹 Problem Example
arr = [-2,1,-3,4,-1,2,1,-5,4]

👉 Output: 6
👉 Subarray: [4, -1, 2, 1]
 */
//https://leetcode.com/problems/maximum-subarray/description/?envType=problem-list-v2&envId=array

/*
Given an integer array nums, find the subarray with the largest sum, and return its sum.

Example 1:

Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
Output: 6
Explanation: The subarray [4,-1,2,1] has the largest sum 6.
Example 2:

Input: nums = [1]
Output: 1
Explanation: The subarray [1] has the largest sum 1.
Example 3:

Input: nums = [5,4,-1,7,8]
Output: 23
Explanation: The subarray [5,4,-1,7,8] has the largest sum 23.
 */
public class MaxSubArray_53 {
    static int maxSubArray(int[] nums){
        int currentSum = nums[0];
        int maxSum = nums[0];
        for(int i=1;i<nums.length;i++){
            currentSum =  Math.max(nums[i], currentSum + nums[i]);
            maxSum = Math.max(maxSum,currentSum);
        }
        return maxSum;
    }

    public static void main(String[] args) {
       int ans = maxSubArray(new int[] {-2,1,-3,4,-1,2,1,-5,4});
        System.out.println(ans);
        int ans2 = maxSubArray(new int[] {1});
        System.out.println(ans2);
        int ans3 = maxSubArray(new int[] {5,4,-1,7,8});
        System.out.println(ans3);
    }
}
