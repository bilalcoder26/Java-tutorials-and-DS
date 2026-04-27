package leetcodequestion.arrayquestion;

//https://leetcode.com/problems/continuous-subarray-sum/description/?envType=problem-list-v2&envId=array

/*
Example 1:

Input: nums = [23,2,4,6,7], k = 6
Output: true
Explanation: [2, 4] is a continuous subarray of size 2 whose elements sum up to 6.
Example 2:

Input: nums = [23,2,6,4,7], k = 6
Output: true
Explanation: [23, 2, 6, 4, 7] is an continuous subarray of size 5 whose elements sum up to 42.
42 is a multiple of 6 because 42 = 7 * 6 and 7 is an integer.
Example 3:

Input: nums = [23,2,6,4,7], k = 13
Output: false

 */

import java.util.HashMap;

public class checkSumArray_523 {
    static boolean checkSumArrayBF(int[] nums, int k){
        for(int i = 0; i < nums.length; i++){
            int sum = nums[i];
            System.out.println("outer loop sum ---> " + sum + " " + "index " + i  );

            for(int j = i + 1; j < nums.length; j++){
                sum += nums[j];
                System.out.println("inner loop sum ---> " + sum + " " + "index " + j  );


                if(sum % k == 0){
                    System.out.println("Subarray found from index " + i + " to " + j);
                    return true;
                }
            }
        }
        return false;
    }

    static boolean checkSumArray(int[] nums, int k) {

        // Map: remainder -> first index jahan ye remainder mila
        HashMap<Integer, Integer> map = new HashMap<>();

        // Edge case handle:
        // agar prefix sum directly k se divisible ho (subarray starting from index 0)
        map.put(0, -1);

        int sum = 0; // running prefix sum

        for (int i = 0; i < nums.length; i++) {

            // Step 1: prefix sum update
            sum += nums[i];

            // Step 2: remainder nikalo
            int remainder = sum % k;

            // Step 3: check karo kya ye remainder pehle aa chuka hai
            if (map.containsKey(remainder)) {

                int prevIndex = map.get(remainder);

                // Step 4: subarray length check (>=2)
                if (i - prevIndex >= 2) {
                    return true; // valid subarray mil gaya
                }

            } else {
                // Step 5: sirf pehli baar remainder store karo
                map.put(remainder, i);
            }
        }

        return false; // koi valid subarray nahi mila
    }

    public static void main(String[] args) {
        boolean ans = checkSumArrayBF(new int[]{23,2,4,6,7}, 6);
        System.out.println("burteForce solution ---> " + ans );

        boolean ans2 = checkSumArray(new int[]{23,2,4,6,7}, 6);
        System.out.println("optimized solution ---> " + ans2);



    }
}
