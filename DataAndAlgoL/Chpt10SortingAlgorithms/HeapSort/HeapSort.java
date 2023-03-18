package DataAndAlgoL.Chpt10SortingAlgorithms.HeapSort;

import java.util.Arrays;

public class HeapSort{
    
    public static <E extends Comparable<E>> void heapSort(E[] list){
        //create a heap of integers 
        Heap<E> heap= new Heap<>();

        /*
         * Since inserting on heap has sorting properties the list will start to become sorted
         * 
         */
        for(int i=0; i< list.length; i++){
            heap.add(list[i]);
        }

        System.out.println(heap.getSize()); //check to see if all elements were added to heap

         /*Removing elements from a heap*/
         /*
          * Always removes root element which can be smallest element for min heap
          * or largest element for max heap
          */

        for(int i= list.length-1; i >=0; i--){
            list[i]= heap.remove();
        }

       
        
    }


    public static void main(String[] args) {
        Integer[] list= {-44, -5, -3, 3, 3, 1, -4, 0, 1, 2, 4, 5, 53};
        heapSort(list);
        for(int i=0; i< list.length; i++){
            System.out.print(list[i]+" ");
        }
    }
    
}
