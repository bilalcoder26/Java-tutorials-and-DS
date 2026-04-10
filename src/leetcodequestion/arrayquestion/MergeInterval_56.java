package leetcodequestion.arrayquestion;
//https://leetcode.com/problems/merge-intervals/description/?envType=problem-list-v2&envId=array
/*
iven an array of intervals where intervals[i] = [starti, endi], merge all overlapping intervals, and return an array of the non-overlapping intervals that cover all the intervals in the input.



Example 1:

Input: intervals = [[1,3],[2,6],[8,10],[15,18]]
Output: [[1,6],[8,10],[15,18]]
Explanation: Since intervals [1,3] and [2,6] overlap, merge them into [1,6].
Example 2:

Input: intervals = [[1,4],[4,5]]
Output: [[1,5]]
Explanation: Intervals [1,4] and [4,5] are considered overlapping.
Example 3:

Input: intervals = [[4,7],[1,4]]
Output: [[1,7]]
Explanation: Intervals [1,4] and [4,7] are considered overlapping.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeInterval_56 {
    static int[][] mergeInterval(int[][] intervals){
        if(intervals == null || intervals.length == 0){
            return new int[0][];
        }

        //sort intervals by start time
        Arrays.sort(intervals,(a,b) -> a[0]-b[0]);
        List<int[]> result = new ArrayList<>();

        int [] current = intervals[0];

        for(int i=1;i<intervals.length;i++){
            int[] next = intervals[i];
            //ye mere merging logic hai
            if(current[1] >= next[0]){
                current[1] = Math.max(current[1], next[1]);
            }else{
                result.add(current);
                current = next;
            }
        }
        //add last interval
        result.add(current);
        return result.toArray(new int[result.size()][]);
    }

    public static void main(String[] args) {
        int[][] intervals = {
                {1,3},
                {2,6},
                {8,10},
                {15,18}
        };
        int[][] mergedIntervals = mergeInterval(intervals);
        System.out.println("merged interval");
        System.out.println(Arrays.deepToString(mergedIntervals));
        for(int[] interval: mergedIntervals){
            System.out.println("[" + interval[0] + ", " + interval[1] + "]");
        }
    }


}
