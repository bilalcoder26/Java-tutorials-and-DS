package leetcodequestion.arrayquestion;

import java.util.*;

//https://leetcode.com/problems/majority-element/description/?envType=problem-list-v2&envId=array
/*
Given an array nums of size n, return the majority element.

The majority element is the element that appears more than ⌊n / 2⌋ times.
You may assume that the majority element always exists in the array.

Example 1:

Input: nums = [3,2,3]
Output: 3
Example 2:

Input: nums = [2,2,1,1,1,2,2]
Output: 2
 */
public class MajorityElement {

    // this is my approach but best nhi hai ye
//    ❗ Problem with this approach
//    Time Complexity: O(n log n) (sorting ki wajah se)
//    Space: O(n) (map + list)
//            👉 Interview me yeh acceptable hai, but best nahi hai

    static int majorityElement(int[] nums){
        Map<Integer,Integer> map = new HashMap<>();

        for (int num : nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        System.out.println("map --> " + map);
//         just for looping reference
//        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
//            if(entry.getValue() == 1){
//                return entry.getKey();
//            }
//        }
        // Convert to list
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());

        // Sort based on value (frequency) descending
        list.sort((a, b) -> b.getValue() - a.getValue());

        // First element will have the highest frequency
        return list.get(0).getKey();
    }

    //more optimized no need of sorting
    static int majorityElementwithoutSorting(int[] nums){
        Map<Integer,Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num, map.getOrDefault(num,0) + 1);
            if(map.get(num) > nums.length/2){
                return num;
            }
        }
        return -1;
    }

//    🚀 PART 2: Boyer-Moore Algorithm (Magic Trick 🪄)
        static int majorityElementBoyerMooreAlgo(int[] nums){
        int count =0;
        int candidate =0;
        for(int num : nums){
            if(count == 0){
                candidate = num;
            }
            if(num == candidate){
                count++;
            }else{
                count--;
            }

        }
        return candidate;
        }
    public static void main(String[] args) {
        int ans = majorityElement(new int[]{3,2,3});
        System.out.println("ans " + ans);
        int majorityElementwithoutSorting = majorityElementwithoutSorting(new int[]{2,2,1,1,1,2,2});
        System.out.println("majorityElementwithoutSorting " + majorityElementwithoutSorting);
        int majorityElementBoyerMooreAlgo  = majorityElementBoyerMooreAlgo(new int[]{2,2,1,1,1,2,2});
        System.out.println("majorityElementBoyerMooreAlgo " + majorityElementBoyerMooreAlgo);

    }
}

/*
🧠 Final समझ (1 line me)

👉 Map approach:

"Count karo aur check karo"

👉 Boyer-Moore:

"Cancel karo aur survivor pakdo"
 */
