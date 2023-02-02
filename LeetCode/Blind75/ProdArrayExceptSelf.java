package Blind75;

import java.util.Arrays;

public class ProdArrayExceptSelf {
    public static void main(String[] args) {
        int[] nums= {1,2,3,4};
        System.out.println(Arrays.toString(productExceptSelf(nums)));
    }
    
    //O(n) time because both loops run at O(n)+ O(n)= O(2n)= O(n)
    public static int[] productExceptSelf(int[] nums) {
        int[] result=new int[nums.length];
       
        for(int i=0, j=1; i<nums.length; i++){
            result[i]=j; //turns result[] = {1,1,1,1}
            j*=nums[i]; //leaves nums array original
        }

        for (int i = nums.length - 1, j= 1; i >= 0; i--) {
            result[i] *= j;
            j*= nums[i];
        }
        return result;
    }
}
