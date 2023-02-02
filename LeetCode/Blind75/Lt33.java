package Blind75;

public class Lt33 {
    public static void main(String[] args) {
        int[] nums= {1,3};
        int target= 0;
        System.out.println(search(nums, target));
    }  

    public static int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        while (low < high) {
            int mid = (low + high) / 2; //find mid element
            if (nums[mid] == target) return mid; // if mid elment = target, return index of mid
            
            if (nums[low] <= nums[mid]) { //if nums[left side] <= nums[mid element]
                if (target >= nums[low] && target < nums[mid]) { //if target >= lowest current element and target < mid element
                    high = mid - 1; //high goes from last index in array to mid -1
                } else {
                    low = mid + 1; // low goes from index 0 in array to mid+1 
                }
            } else { //else if nums[low] >= nums[mid]
                if (target > nums[mid] && target <= nums[high]) { // if target > nums[mid] and target <= nums[high]
                    low = mid + 1; //increase low to mid +1 
                } else {
                    high = mid - 1; //decrease high to mid -1
                }
            }
        }
        return nums[low] == target ? low : -1; //if nums[low] == target return low, else return -1
    }
}
