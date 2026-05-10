package leetcodequestion.arrayquestion;

import java.util.*;

// [1,4,2,6,7,9] => [3,5,8]
public class FindTheMissingArr {
    static int[] findnumArr(int[] nums){
        if(nums == null || nums.length == 0){
            throw new IllegalArgumentException("Array must not be empty");
        }
        List<Integer> result = new ArrayList<>();
        Set<Integer> set = new HashSet<>();

        int maxNum = nums[0];
        int minNum = nums[0];
        for(int num : nums){
            maxNum = Math.max(maxNum, num);
            minNum = Math.min(minNum, num);
            set.add(num);
        }

        for(int i =minNum; i<= maxNum;i++){
            if(!set.contains(i)){
                result.add(i);
            }
        }
        // Convert List -> int[]
        int[] ans = new int[result.size()];

        for(int i = 0; i < result.size(); i++){
            ans[i] = result.get(i);
        }

        return ans;


    }

    public static void main(String[] args) {
        int[]result = findnumArr(new int[]{1,4,2,6,7,9});
        System.out.println(Arrays.toString(result));

    }
}
