import java.util.Arrays;

public class MoveZeroes_Lt283 {
    public static void main(String[] args) {
        
    }

    public static void moveZeroes(int[] nums) {
        if (nums == null || nums.length ==0){
            return;
        }

        int insertPos=0;

       for(int i=0; i< nums.length; i++){
        if(nums[i] == 0){
            insertPos++;
        }else if(insertPos !=0){
            nums[i-insertPos]= nums[i];
            nums[i]=0;
        }
       }

        System.out.println(Arrays.toString(nums));
    }
}
