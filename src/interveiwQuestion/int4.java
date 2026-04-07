package interveiwQuestion;

// remove duplicates from an array [1,2,3,4,5,6,7,8,9,1,2,3,4,5,6,7,8,9] => [1,2,3,4,5,6,7,8,9];

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class int4 {
    static int[] removeDuplicate(int[] arr){
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<arr.length;i++){
            set.add(arr[i]);
        }
        // convert Set → int[]
//        System.out.println("set " + set);
        int[] result = new int[set.size()];
        int index = 0;

        for(int num : set){
            result[index++] = num;
        }

        return result;
    }
    static int [] removeDuplicateOptimized(int[] arr){
        Set<Integer> set = new LinkedHashSet<>();
        for(int num :arr){
            set.add(num);
        }
        int[] result = new int[set.size()];
        int index = 0;
        for(int num : set){
            result[index++] = num;
        }
        return result;
    }
    public static void main(String[] args) {
        int[] ans = removeDuplicate(new int[]{1,2,3,4,5,6,7,8,9,1,2,3,4,5,6,7,8,9});
        System.out.println(Arrays.toString(ans));
        int[] ans1 = removeDuplicateOptimized(new int[]{1,2,3,4,5,6,7,8,9,1,2,3,4,5,6,7,8,9});
        System.out.println(Arrays.toString(ans1));

    }
}
