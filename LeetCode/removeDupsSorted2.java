import java.util.Arrays;

public class removeDupsSorted2 {
    public static void main(String[] args) {
        int[] x= {1,1,1,2,2,3};
        System.out.println(removeDuplicates(x));
    }

    public static int removeDuplicates(int[] nums) {
        Arrays.sort(nums);
        if(nums.length==0){
            return 0;
        }

        int i = 0;
        for (int n : nums) //for n in nums 
            if (i < 2 || n > nums[i - 2]) //if count (i) is < than 2 (k number of dupplicates) or value n is bigger than 2 previous values at index i
                nums[i++] = n; //value at index i equals to n
        return i;
        
    }
}
