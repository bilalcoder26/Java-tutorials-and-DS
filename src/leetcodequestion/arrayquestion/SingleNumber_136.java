package leetcodequestion.arrayquestion;

import java.util.HashMap;
import java.util.Map;

//https://leetcode.com/problems/single-number/description/?envType=problem-list-v2&envId=array
/*
Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.

You must implement a solution with a linear runtime complexity and use only constant extra space.

Example 1:
Input: nums = [2,2,1]
Output: 1

Example 2:
Input: nums = [4,1,2,1,2]
Output: 4

Example 3:
Input: nums = [1]

Output: 1
 */
public class SingleNumber_136 {
    //do not use this logic in interview because extra space is not allowed
    static int singleNumber(int[] arr){
        Map<Integer,Integer> map = new HashMap<>();
        for(int num : arr){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        System.out.println(map);
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue() == 1){
                return entry.getKey();
            }
        }

        return -1;
    }
    //WHENEVER There is duplicate use XOR PROPERTIES JB ME SAME SAME HOGA WO ZERO HO JATA HAI
    //LIKE 2^2 =0, 4^0 =4
    /*
    result = 0

0 ^ 4 = 4
4 ^ 1 = 5
5 ^ 2 = 7
7 ^ 1 = 6
6 ^ 2 = 4
     */
    static int singleNumberXOR(int[] arr){
        int result = 0;

        for(int num : arr){
            result = result ^ num;
        }

        return result;
    }

    public static void main(String[] args) {
       int ans =  singleNumber(new int[]{2,2,1});
        System.out.println(ans);

        int ans2 =  singleNumberXOR(new int[]{4,1,2,1,2});
        System.out.println(ans2);

    }
}
