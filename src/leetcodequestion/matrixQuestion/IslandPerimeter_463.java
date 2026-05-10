package leetcodequestion.matrixQuestion;

//https://leetcode.com/problems/island-perimeter/?envType=problem-list-v2&envId=matrix

/*
Input: grid = [[0,1,0,0],[1,1,1,0],[0,1,0,0],[1,1,0,0]]
Output: 16
Explanation: The perimeter is the 16 yellow stripes in the image above.
Example 2:

Input: grid = [[1]]
Output: 4
Example 3:

Input: grid = [[1,0]]
Output: 4

 */

public class IslandPerimeter_463 {
    static int isLandPerimeter(int[][] grid){
        int perimeter =0;
        int rows = grid.length;
        int cols = grid[0].length;
        for(int i=0;i< rows;i++){
            for(int j=0;j< cols;j++){
                //process only land cells
                if(grid[i][j] ==  1){
                    // Each land cell contributes 4 sides
                    perimeter +=4;

                    //Top
                    if(i >0 && grid[i-1][j] ==1){
                        perimeter -=2;
                    }
                    //left
                    if(j>0 && grid[i][j-1] == 1){
                        perimeter -=2;
                    }

                }
            }
        }
        return perimeter;

    }

    public static void main(String[] args) {
        int[][] grid = {{0,1,0,0},{1,1,1,0},{0,1,0,0},{1,1,0,0}};
        int ans = isLandPerimeter(grid);
        System.out.println(ans);
    }
}
/*
| Step | (i,j) | Value | Operation            | Perimeter |
| ---- | ----- | ----- | -------------------- | --------- |
| 1    | (0,0) | 0     | Skip                 | 0         |
| 2    | (0,1) | 1     | +4                   | 4         |
|      |       |       | Top नहीं (i=0)       | 4         |
|      |       |       | Left = 0 → No change | 4         |
| 3    | (0,2) | 0     | Skip                 | 4         |
| 4    | (0,3) | 0     | Skip                 | 4         |
| 5    | (1,0) | 1     | +4                   | 8         |
|      |       |       | Top = 0 → No change  | 8         |
|      |       |       | Left नहीं (j=0)      | 8         |
| 6    | (1,1) | 1     | +4                   | 12        |
|      |       |       | Top = 1 → -2         | 10        |
|      |       |       | Left = 1 → -2        | 8         |
| 7    | (1,2) | 1     | +4                   | 12        |
|      |       |       | Top = 0 → No change  | 12        |
|      |       |       | Left = 1 → -2        | 10        |
| 8    | (1,3) | 0     | Skip                 | 10        |
| 9    | (2,0) | 0     | Skip                 | 10        |
| 10   | (2,1) | 1     | +4                   | 14        |
|      |       |       | Top = 1 → -2         | 12        |
|      |       |       | Left = 0 → No change | 12        |
| 11   | (2,2) | 0     | Skip                 | 12        |
| 12   | (2,3) | 0     | Skip                 | 12        |
| 13   | (3,0) | 1     | +4                   | 16        |
|      |       |       | Top = 0 → No change  | 16        |
|      |       |       | Left नहीं            | 16        |
| 14   | (3,1) | 1     | +4                   | 20        |
|      |       |       | Top = 1 → -2         | 18        |
|      |       |       | Left = 1 → -2        | 16        |
| 15   | (3,2) | 0     | Skip                 | 16        |
| 16   | (3,3) | 0     | Skip                 | 16        |

 */
