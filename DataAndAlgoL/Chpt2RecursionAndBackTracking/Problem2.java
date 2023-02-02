package DataAndAlgoL.Chpt2RecursionAndBackTracking;
/*Given an array, check whether the array is in sorted order with recursion */
public class Problem2 {
    public static void main(String[] args) {
        int[] nums={1,2,3,4,5};
        int index= nums.length;
        System.out.println(isSorted(nums, index));
    }

    public static int isSorted(int[] nums, int idx){
        //base case
        if(nums.length==1){
            return 1;
        }
        return (nums[idx-2] < nums[idx-1]) ? 0: isSorted(nums, idx-1);

    }
}
