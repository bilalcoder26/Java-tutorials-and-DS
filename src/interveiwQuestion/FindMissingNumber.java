package interveiwQuestion;

// Find the missing number from array  [2,7,8,9,3,4,6]


import java.util.HashSet;
import java.util.Set;

public class FindMissingNumber {
    static int findMissingNum(int[] arr){
        if(arr == null || arr.length == 0) {
            throw  new IllegalArgumentException("Array is empty");
        }
        int max = arr[0];
        int min = arr[0];
        for(int i=1;i<arr.length;i++){
            max = Math.max(max, arr[i]);
            min = Math.min(min, arr[i]);
        }
        Set<Integer> set = new HashSet<>();
        for(int num: arr){
            set.add(num);
        }
        for(int i=min;i<max;i++){
            if(!set.contains(i)){
                return i;
            }
        }
        return 0;
    }

    //Optimal Solution (O(n), O(1) space)

    static int optimalFindMissingNum(int[]arr){
        int max = arr[0];
        int min = arr[0];
        int actualSum = 0;

        for(int num : arr){
            max = Math.max(max, num);
            min = Math.min(min,num);
            actualSum += num;
        }
        int n = max - min + 1;
        int expectedSum = (n * (min + max)) / 2;

        return expectedSum - actualSum;
    }

    public static void main(String[] args) {
        int ans = findMissingNum(new int[] {2,7,8,9,3,4,6});
        System.out.println("ans : " + ans);
        int ans2 = optimalFindMissingNum(new int[] {2,7,8,9,3,4,6});
        System.out.println("ans2 : " + ans2);
    }
}
