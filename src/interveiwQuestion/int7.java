package interveiwQuestion;
//[21,45,67,53,89,24,4,8] --> 89

public class int7 {
    static int findMaxNumber(int[]arr){
        if(arr == null || arr.length == 0){
            throw new IllegalArgumentException("Array is empty");
        }
        int maxNum = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i] > maxNum ){
                maxNum = arr[i];
            }
        }

        return maxNum;
    }

    static int  findMaxNumberEnchanedLoop(int[]arr){
        if(arr == null || arr.length == 0){
            throw new IllegalArgumentException("Array is empty");
            }
        int maxNumb = arr[0];
        for(int num :arr){
            if(num > maxNumb){
                maxNumb = num;
            }
        }
        return  maxNumb;
    }

    public static void main(String[] args) {
       int ans =  findMaxNumber(new int[]{21,45,67,53,89,24,4,8});
        System.out.println(ans);
        int ans2  = findMaxNumberEnchanedLoop(new int[]{21,45,67,53,89,24,4,8});
        System.out.println("ench "+ ans2);

    }
}
