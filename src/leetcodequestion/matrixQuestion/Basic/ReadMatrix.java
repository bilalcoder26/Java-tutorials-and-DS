package leetcodequestion.matrixQuestion.Basic;

// write a java program to read matrix and print it.

public class ReadMatrix {
    public static void main(String[] args) {


//        int[][] matrix = new int[rows][cols];
        int[][] matrix  = {
                {1,2,3},
                {4,5,6}
        };

        /*
        This creates a 2D array (matrix)
        There is 2 rows and 3 columns

        int rows = matrix.length;  ---> here rows =2;
        int cols = matrix[0].length ---> hers columns =3;
         */

        int rows = matrix.length;
        int cols = matrix[0].length;

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.println(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }
}
