package leetcodequestion.matrixQuestion.Basic;

public class MaximumInMatrix {
    static int findMaximumNum(int[][] matrix){
        int maxNum = matrix[0][0];
        for(int[] row : matrix){
            for(int val : row){
                if(val > maxNum){
                    maxNum = val;
                }
            }
        }
        return maxNum;
    }
    public static void main(String[] args) {
        int [][] matrix = {
                {3,7,1},
                {5,2,9}
        };

       int ans =  findMaximumNum(matrix);
        System.out.println(ans);


    }
}
