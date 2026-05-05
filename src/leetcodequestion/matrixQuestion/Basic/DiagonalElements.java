package leetcodequestion.matrixQuestion.Basic;

/*
what is diagonal of matrix ?
The main diagonal of matrix contains elements where;
row index == column index

## --> only works for square matrix (rows = columns)

int[][] matrix  ={
{1,2,3},
{4,5,6},
{7,8,9}

diagonal elements
position where i ==j;
matrix[0][0] = 1
matrix[1][1] = 5
matrix[2][2] = 9

output [1,5,9];
 */

import java.util.Arrays;

public class DiagonalElements {
    static int[] findDiagonalElement(int[][] matrix){
        int n = matrix.length;
        int[] diagonal = new int[n];
        for(int i=0;i<n;i++){
            diagonal[i] = matrix[i][i];
        }
        return diagonal;
    }

    public static void main(String[] args) {
        int[][] matrix  ={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int[] result = findDiagonalElement(matrix);
        System.out.println(Arrays.toString(result));
    };

}




