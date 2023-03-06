package LeetcodeV1;
import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {
        int[] nums={4,1,2,1,2};
        System.out.println(singleNumber(nums));
    }
    //XOR solution
    public static int singleNumber(int[] nums) {
        int res=0;
        for(int num :nums){
            res ^=num;
        }

        return res;
       
    }
    //O(NLOG(N)) time complexity solution
    public int singleNumber2(int[] nums) {
        Arrays.sort(nums);                          //Sort the array
        for(int i=0 ; i<nums.length-1; i+=2){       
            if(nums[i]!=nums[i+1])                  //Check pairwise values in array
                return nums[i];                     //if any pairwise values are different, then it is answer
        }
        return nums[nums.length - 1];       //if answer is largest value, then it will not be detected in above loop hence return it here
   }
}
