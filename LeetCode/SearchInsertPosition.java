public class SearchInsertPosition {
    public static void main(String[] args) {
        int[] nums= {1,3,5,6};
        int target= 7;
        System.out.println(searchInsert(nums, target));
    }

    public static int searchInsert(int[] nums, int target) {
        int low= 0;
        int high= nums.length-1;
        while(high >= low){
            int mid=(low+high)/2;
            if(target < nums[mid]){
                high= mid-1;
            }else if (target== nums[mid] ){
                return mid;
            }else{
                low= mid+1;
            }
        }
        return low;
    }
}
