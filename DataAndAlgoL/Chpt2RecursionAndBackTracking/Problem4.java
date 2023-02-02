package DataAndAlgoL.Chpt2RecursionAndBackTracking;
//Generate all the strings of length n drawn from 0... k – 1.
//Let us assume we keep current k-ary string in an array A[0.. n – 1]. Call function k-string(n, k):

import java.util.Arrays;

public class Problem4 {
    static int n=4;
    static int nums[]= new int[n];
    public static void main(String[] args) {
        K_string(n, 2);
    }

    public static void K_string(int n, int k){
        //process all k-ary strinfs of length n
        if(n<1){
            System.out.println(Arrays.toString(nums));
        }else {
            for(int j=0; j<k; j++){
                nums[n-1]=j;
                K_string(n-1, k);
            }
        }
    }
}
