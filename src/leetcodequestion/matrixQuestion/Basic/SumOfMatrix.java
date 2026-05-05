package leetcodequestion.matrixQuestion.Basic;

//sum of all elements

public class SumOfMatrix {
    static int findSumOfMatrix(int[][] matrix){

        int sum =0;
        int rows = matrix.length;
        int cols = matrix[0].length;
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                sum += matrix[i][j];
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        int[][] matrix = {
                {1,2},
                {3,4}
        };
        int ans = findSumOfMatrix(matrix);
        System.out.println("ans --> " + ans);

    }
}
