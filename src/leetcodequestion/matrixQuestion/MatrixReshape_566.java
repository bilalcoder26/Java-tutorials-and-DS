package leetcodequestion.matrixQuestion;

//https://leetcode.com/problems/reshape-the-matrix/?envType=problem-list-v2&envId=matrix
/*
Input: mat = [[1,2],[3,4]], r = 1, c = 4
Output: [[1,2,3,4]]

Input: mat = [[1,2],[3,4]], r = 2, c = 4
Output: [[1,2],[3,4]]
 */

import java.util.Arrays;

public class MatrixReshape_566 {
    static int[][] matrixReshape(int[][] mat, int r, int c){
        // step1 : get the original matrix dimension
        int m = mat.length;
        int n = mat[0].length;

        //check if the reshape is possible
        if(m * n != r * c){
            return mat;
        }
        //create a new matrix
        // example r=1, c-4 [0,0,0,0]
        int[][] reshaped = new int[r][c];
        int row =0, col=0;

        //traverse orginal matrix
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                reshaped[row][col] = mat[i][j];
                col++;
            }
            // handle row completion
            if(col == c){
                col =0;
                row++;
            }
        }
        return reshaped;
    }

    public static void main(String[] args) {
        int[][] mat = {{1,2},{3,4}};
        int[][] result = matrixReshape(mat, 1, 4);
        System.out.println(Arrays.deepToString(result));

        int[][] mat2 = {{1,2},{3,4}};
        int[][] result2 = matrixReshape(mat, 2, 4);
        System.out.println(Arrays.deepToString(result2));

    }
}
