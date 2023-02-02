public class FindPeakElementHigherThanElements {
    public static void main(String[] args) {
        int[] array= {5,10, 20,15};
        System.out.println(findPeak(array));
    }

    public static int findPeak(int[] nums){
        for(int i=1; i<nums.length-1; i++){
            if(nums[i] >= nums[i-1] && nums[i]>= nums[i+1]){
                return nums[i];
            }
        }
        return 0;
    }
}
