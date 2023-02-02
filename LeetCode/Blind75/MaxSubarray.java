package Blind75;

import java.util.Arrays;

public class MaxSubarray {
    public static void main(String[] args) {
        int[] nums={-2,1,-3,4,-1,2,1,-5,4};
        //5,4,-1,7,8
        //-2,1,-3,4,-1,2,1,-5,4
        System.out.println(maxSubArray(nums));
    }
    //KADANE'S ALGORITHM DYNAMIC PROGRAMMING
    public static int maxSubArray(int[] nums) {
        int n = nums.length;
        int max = Integer.MIN_VALUE, sum = 0;
        
        for(int i=0;i<n;i++){
            sum += nums[i];
            max = Math.max(sum,max);
            
            if(sum<0) sum = 0;
        }
        
        return max;
    }
}
