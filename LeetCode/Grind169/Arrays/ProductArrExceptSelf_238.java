package Grind169.Arrays;

public class ProductArrExceptSelf_238 {
    public static void main(String[] args) {
        
    }

    public static int[] productExceptSelf(int[] nums) {
        int[] result=new int[nums.length];
       
        for(int i=0, j=1; i<nums.length; i++){
            result[i]=j;
            j*=nums[i];
        }

        for (int i = nums.length - 1, j= 1; i >= 0; i--) {
            result[i] *= j;
            j*= nums[i];
        }
        return result;
    }
}
