package leetcodequestion.matrixQuestion.Basic;

import java.util.Arrays;

/*
Transpose --> convert rows into columns and columns into rows

if original element is at :
matrix[i][j]

after transpose , it goes to
transpose[j][i]
 */
public class Transpose {
    static int[][] Transpose(int[][] matrix){
        int rows = matrix.length; //2
        int cols = matrix[0].length;//3

        int[][] result = new int[cols][rows];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                result[j][i] = matrix[i][j];
            }
        }
        return result;

    }
    public static void main(String[] args) {
        int[][] matrix = {
                {1,2,3},
                {4,5,6}
        };
        //rows = 2;
        // columns = 3;

        int[][] result = Transpose(matrix);
        System.out.println(Arrays.deepToString(result)); // [[1, 4], [2, 5], [3, 6]]

    }
}
