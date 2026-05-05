package leetcodequestion.matrixQuestion.Basic;

import java.util.Arrays;

public class CountEvenOddMatrix {
    static int[] countEvenAndOdd(int[][] matrix){
        int evenCount =0, oddCount =0;
        int rows = matrix.length;
        int cols = matrix[0].length;

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(matrix[i][j] % 2 == 0){
                    evenCount++;
                }else{
                    oddCount++;
                }
            }
        }
        return new int[]{evenCount, oddCount};
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {1,2},
                {3,4}
        };
        int[] ans = countEvenAndOdd(matrix);
        System.out.println(Arrays.toString(ans));

    }
}
