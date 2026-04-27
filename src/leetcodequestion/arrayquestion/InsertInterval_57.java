package leetcodequestion.arrayquestion;
//https://leetcode.com/problems/insert-interval/description/?envType=problem-list-v2&envId=array

/*
Example 1:
Input: intervals = [[1,3],[6,9]], newInterval = [2,5]
Output: [[1,5],[6,9]]

Example 2:
Input: intervals = [[1,2],[3,5],[6,7],[8,10],[12,16]], newInterval = [4,8]
Output: [[1,2],[3,10],[12,16]]
Explanation: Because the new interval [4,8] overlaps with [3,5],[6,7],[8,10].
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InsertInterval_57 {
    static int[][] insertInterval(int[][] intervals, int[] newInterval) {

        List<int[]> result = new ArrayList<>();
        int i = 0;
        int n = intervals.length;

        // Step 1: add all intervals before newInterval
        while (i < n && intervals[i][1] < newInterval[0]) {
            result.add(intervals[i]);
            i++;
        }

        // Step 2: merge overlapping intervals
        while (i < n && intervals[i][0] <= newInterval[1]) {
            newInterval[0] = Math.min(newInterval[0], intervals[i][0]);
            newInterval[1] = Math.max(newInterval[1], intervals[i][1]);
            i++;
        }

        // add merged interval
        result.add(newInterval);

        // Step 3: add remaining intervals
        while (i < n) {
            result.add(intervals[i]);
            i++;
        }

        return result.toArray(new int[result.size()][]);
    }

    public static void main(String[] args) {
        int[][] intervals = {
                {1,2},
                {3,5},
                {6,7},
                {8,10},
                {12,16}
        };
        int[] newInterval = {4,8};
        int[][]insertInterval = insertInterval(intervals, newInterval);

        System.out.println("insert Interval ");
        System.out.println(Arrays.deepToString(insertInterval));
        for(int[] interval: insertInterval){
            System.out.println("[" + interval[0] + ", " + interval[1] + "]");
        }

    }
}
