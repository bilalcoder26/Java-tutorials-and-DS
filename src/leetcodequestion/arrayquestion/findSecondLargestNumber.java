package leetcodequestion.arrayquestion;

// [67,89,100,1,2,52,23,0,2] => 89

public class findSecondLargestNumber {
    static int findSecondLargestNumber(int[] nums){
        if(nums == null || nums.length == 0){
            throw new IllegalArgumentException("numbers should be array");
        }
        int firstMaxNumber =  Integer.MIN_VALUE;
        int secondMaxNumber =  Integer.MIN_VALUE;
        for(int num : nums){
            if(num > firstMaxNumber){
                secondMaxNumber = firstMaxNumber;
                firstMaxNumber = num;
            } else if (num >secondMaxNumber && num != firstMaxNumber ) {
                secondMaxNumber = num;
                
            }
        }
        return secondMaxNumber;
    }

    public static void main(String[] args) {

        int result = findSecondLargestNumber(new int[]{67,89,100,1,2,52,23,0,2});
        System.out.println(result);

    }
}
