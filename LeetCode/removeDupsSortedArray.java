import java.util.Arrays;

public class removeDupsSortedArray {
    public static void main(String[] args) {
        int[] x= {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(x));
        
    }

    public static int removeDuplicates(int[] nums) {
        Arrays.sort(nums);
        if(nums.length == 0) return 0; // base case 
        int res = 1; // start at 1 as at least 1 number is in the array
        for(int i = 1; i < nums.length; i++){ //compare the 2 value to the value before, and add it to index of current result
          if(nums[i] != nums[i - 1]){
            nums[res] = nums[i];
            res++; // increament result to next value, for new number to be stored in the next array index 
          }
        }
        return res;
    }
}
