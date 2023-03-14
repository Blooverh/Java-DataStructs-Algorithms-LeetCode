package DataAndAlgoL.Chpt10SortingAlgorithms;

public class Bubblesort {
    public static void main(String[] args) {
        
    }

    //O(n^2) time complexity -> extremely slow 
    public static void bubbleSort(int[] array){
        for(int i=array.length -1; i>=0; i--){
            for(int j=0; j< array.length; j++){
                if(array[i] > array[i+1]){
                    //swap elements
                    int temp= array[i];
                    array[i]=array[i+1];
                    array[i+1]=temp;
                }
            }
        }
    }

    //O(n) Improved bubble sort Best possible complexity
    // public static void bubbleSort2(int[] arr){
    //     int temp;
    //     int swapped=1; //flag to check whether its needs to be swapped meaning it is not sorted
    //     for(int i= arr.length-1; i>=0 /* && swapped */; i--){
    //         swapped=0;
    //         for(int j=0; j<=arr.length; j++){
    //             if(arr[i] >arr[i+1]){
    //                 //swap elements
    //                 temp= arr[i];
    //                 arr[i]=arr[i+1];
    //                 arr[i+1]=temp;
    //                 swapped=1;
    //             }
    //         }
    //     }
    // }
}
