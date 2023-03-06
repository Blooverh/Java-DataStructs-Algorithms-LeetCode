package DataAndAlgoL.Chpt10SortingAlgorithms;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] nums={2,1,6,34,4,7,55,3};
        selectionSort(nums);
    
    }

    //O(n^2) runtime. 2 nested for loops goes through n^2 inputs 
    public static void selectionSort(int[] nums){
        int min; // Stores minimum value in list 
        int temp; // holds values for swappage 

        for(int i=0; i < nums.length-1; i++){
            min=i;
            for(int j= i+1; j< nums.length; j++){ //for each iteration, goes through all the array starting at i and compares j to current min 
                if(nums[j] < nums[min]){
                    min=j;
                }
            }
            //Swap elements
            temp= nums[min];
            nums[min]= nums[i];
            nums[i]=temp;
        }

       System.out.println(Arrays.toString(nums));
    }
}
