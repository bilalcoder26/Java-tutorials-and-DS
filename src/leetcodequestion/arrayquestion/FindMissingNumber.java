package leetcodequestion.arrayquestion;

// Find the missing number from array  [2,7,8,9,3,4,6]

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FindMissingNumber {
    static int findNum(int[] arr){
        if(arr == null || arr.length == 0){
            throw  new IllegalArgumentException("array must not be empty");
        }
        Set<Integer> set = new HashSet<>();
        int maxNum = arr[0];
        int minNum = arr[0];
        for(int num :arr){
            maxNum = Math.max(maxNum, num);
            minNum = Math.min(minNum,num);
            set.add(num);

        }
        System.out.println(set);
        for(int i=minNum;i<maxNum;i++){
            if(!set.contains(i)){
                return i;
            }

        }
        return -1;
    }

    static int optimizedFindNum(int[] arr){
        if(arr == null || arr.length == 0){
            throw  new IllegalArgumentException("array must not be empty");
        }
        int minNum = arr[0];
        int maxNum = arr[0];
        int actualSum = 0;
        for(int num : arr){
            minNum = Math.min(minNum,num);
            maxNum = Math.max(maxNum,num);
            actualSum += num;
        }
        int n = maxNum-minNum + 1;
        int expectedSum = (n*(minNum +  maxNum)/2);
        return expectedSum-actualSum;
    }
    public static void main(String[] args) {
        int ans = findNum(new int[]{2,7,8,9,3,4,6});
        System.out.println(ans);
        int ans2 = optimizedFindNum(new int[]{2,7,8,9,3,4,6});
        System.out.println(ans2);
    }

}
