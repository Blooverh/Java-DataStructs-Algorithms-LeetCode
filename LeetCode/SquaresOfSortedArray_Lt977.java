import java.util.Arrays;

public class SquaresOfSortedArray_Lt977 {
    public static void main(String[] args) {
        
    }

    public int[] sortedSquares(int[] nums) {
        for(int i=0; i< nums.length; i++){
            nums[i]= (int) Math.pow(nums[i],2);
        }
        Arrays.sort(nums);
        return nums;
    }
}
