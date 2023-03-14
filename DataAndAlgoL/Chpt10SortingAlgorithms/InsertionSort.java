package DataAndAlgoL.Chpt10SortingAlgorithms;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] nums={2,1,6,34,4,7,55,3};
        insertionSort(nums);
    }

    public static void insertionSort(int[] arr){

        for(int i=1; i<arr.length; i++){
            int v=arr[i]; // holds value of index i
            int j=i-1; // holds index i-1
            // while previous index is > and v (current index value) and j >=1, assign arr[j] with previous value arr[j-1]
            while(arr[j] > v && j >= 0){
                arr[j+1] = arr[j];
                j--; // decrement j by 1 to previous position arr[j-1]
            }

            arr[j+1]=v;// stores the value from current position that was swapped with value of previous position
        }

        System.out.println(Arrays.toString(arr));
    }
}
