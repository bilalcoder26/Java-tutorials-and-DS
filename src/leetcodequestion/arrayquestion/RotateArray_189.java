package leetcodequestion.arrayquestion;

import java.util.Arrays;
/*
Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.

Example 1:

Input: nums = [1,2,3,4,5,6,7], k = 3
Output: [5,6,7,1,2,3,4]
Explanation:
rotate 1 steps to the right: [7,1,2,3,4,5,6]
rotate 2 steps to the right: [6,7,1,2,3,4,5]
rotate 3 steps to the right: [5,6,7,1,2,3,4]
Example 2:

Input: nums = [-1,-100,3,99], k = 2
Output: [3,99,-1,-100]
Explanation:
rotate 1 steps to the right: [99,-1,-100,3]
rotate 2 steps to the right: [3,99,-1,-100]
 */


public class RotateArray_189 {
    static int [] rotateArray(int[] nums, int k){
        int n = nums.length;
        // handle case when k > n
        k = k % n;
        /*
        1. k = k % n kyu?
❓ Problem

Agar:

n = 7
k = 10

👉 Tum 10 steps rotate karoge… par array me sirf 7 elements hain

🧠 Observation
7 steps rotate → same array wapas aa jata hai

👉 Matlab:

10 rotation = 7 + 3
           = full round + 3 extra

👉 To actual kaam:

k = 10 % 7 = 3
🎯 Simple rule

“Full cycles ignore karo, sirf extra rotation karo”
         */
        // full array reverse
        reverse(nums,0,nums.length-1);
        // step2 reverse the first k element
        reverse(nums,0,k-1);
        //step 3 reverse remaining element
        reverse(nums,k,n-1);
//        System.out.println(Arrays.toString(nums));
        return nums;
    }

    static int[] rotateLeft(int []nums, int k){
        int n = nums.length;
        k = k%n;

        reverse(nums, 0,n-1);
        reverse(nums, 0,k-1);
        reverse(nums,k,n-1);

        return nums;

    }

    static void reverse(int[] arr, int i, int j){
        while(i<=j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;

        }

    }

    public static void main(String[] args) {
        int[] ans =rotateArray(new int[] {1,2,3,4,5,6,7}, 3);
        System.out.println("final ans --> " + Arrays.toString(ans));
        int[] ans2=rotateLeft(new int[] {1,2,3,4,5,6,7}, 3);
        System.out.println("without comment {1,2,3,4,5,6,7} ---> " + Arrays.toString(ans2));

    }
}
