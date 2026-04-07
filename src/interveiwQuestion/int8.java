package interveiwQuestion;

//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;

import java.util.*;

// find odd number [21,45,67,53,89,24,4,8]
public class int8 {
    static int[] findOddNumbers(int[] arr){
        if(arr == null || arr.length == 0){
            throw new IllegalArgumentException("Array must not be empty");

        }
        List<Integer> list = new ArrayList<>();
        for(int num: arr){
            if(num % 2 != 0){
                list.add(num);
            }

        }
        System.out.println("list" +  list);
//        convert  list --> int[]
        int[] result = new int[list.size()];
        for(int i=0;i<list.size();i++){
            result[i] = list.get(i);
        }
        return result;

    }

    public static void main(String[] args) {
        int[] ans = findOddNumbers(new int[]{21,45,67,53,89,24,4,8});
        System.out.println("ans " + Arrays.toString(ans));

    }
}
