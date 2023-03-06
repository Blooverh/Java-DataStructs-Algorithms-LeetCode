package LeetcodeV1;
import java.util.Arrays;

public class PlusOne2 {
    public static void main(String[] args) {
        int[] nums= {9,9,9};
        int[] nums2={9,9,9,9};
        System.out.println(Arrays.toString(plusOne(nums)));
        System.out.println(Arrays.toString(plusOne(nums2)));
        
    }

    public static int[] plusOne(int[] digits) {
        for(int i=digits.length-1; i>=0; i--){
            if(digits[i]<9){
                digits[i]++; //only does one iteration and returns the array right after
                return digits;
            }

            digits[i]=0; //if all digits[i]= 9 , then assign digits[i]=0
        }

        int[] newArr= new int[digits.length+1]; //which then we use a new created array because we need a +1 length with arr[0] =1 
        newArr[0]=1;
        return newArr;
    }
}
