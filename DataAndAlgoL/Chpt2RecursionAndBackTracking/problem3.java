package DataAndAlgoL.Chpt2RecursionAndBackTracking;

import java.util.Arrays;

/*Generate all the strings of n bits. Assume A[0..n-1] is an array of size n */
public class problem3 {
    static int n=2;
    static int nums[]= new int[n];
    public static void main(String[] args) {
        Binary(n);
    }
    
    public static void Binary(int n){
        if(n<1){
            System.out.println(Arrays.toString(nums));
        }else{
            nums[n-1]=0;
            System.out.println(nums[n-1]);
            Binary(n-1);
            nums[n-1]=1;
            System.out.println(nums[n-1]);
            Binary(n-1);
        }
    }
}
