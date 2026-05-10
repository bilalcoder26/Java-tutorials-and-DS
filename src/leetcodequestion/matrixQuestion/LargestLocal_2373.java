package leetcodequestion.matrixQuestion;

//https://leetcode.com/problems/largest-local-values-in-a-matrix/?envType=problem-list-v2&envId=matrix

public class LargestLocal_2373 {
    static int[][] largestLocal(int[][] grid){
        // store the matrix size

        int n = grid.length;
        //create Result Matrix
        int[][] maxLocal = new int[n-2][n-2];
        //outer loop sliding the window
        for(int i=0;i<n-2;i++){
            for(int j=0;j<n-2;j++){
                int max =0;

                //Traverse the 3*3 block
                for(int x=i;x< i+3;x++){
                    for(int y =j; y< j+3;y++){
                        max = Math.max(max, grid[x][y]);
                    }
                }
                maxLocal[i][j] = max;
            }
        }
        return maxLocal;

    }
}
