package DataAndAlgoL.Chpt10SortingAlgorithms;

public class QuickSort {
    public static void main(String[] args) {
        
    }

    public static void quickSort(int[] nums, int low, int high){
        int pivot;
        //termination condition -> where it runs until it reaches stopping point
        if(high > low){
            pivot= Partition(nums, low, high);
            quickSort(nums, low, pivot-1); 
            quickSort(nums, pivot+1, high);
        }
    }

    public static int Partition(int[] nums, int low, int high){
        int left=low;
        int right=high;
        int pivot_item= nums[low];

        while(left < right){
            //Move left while item < pivot
            while(nums[left]<= pivot_item){
                left++;
            } 

            //Move right while item > pivot
            while(nums[right] >= pivot_item){
                right--;
            }
            //when index left is higher than index high we swap the elements in left index with right index
            if(left < right){
                swap(nums, left, right);
            }

        }
        
        //right is final position for the pivot
        nums[low]= nums[high];
        nums[right]= pivot_item;
        return right;
    }

    public static void swap(int[] nums, int left, int right){
     int temp=0;
     temp= nums[left];
     nums[left]= nums[right];
     nums[right]=temp;       
    }
}
