package DataAndAlgoL.Chpt10SortingAlgorithms;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] list ={2,3,2,6,5,1,-2,3,14,12};
        mergeSort(list);
        System.out.println(Arrays.toString(list));
    }

    public static void mergeSort(int[] list){
        if(list.length > 1){
            //merge sort 1st half
            int[] firstHalf= new int[list.length/2];
            System.arraycopy(list, 0, firstHalf, 0, list.length/2);
            mergeSort(firstHalf); //recursive call to merge the first half of the current recursive list

            //merge sort 2nd Half
            int secondHalfLength= list.length - list.length/2;
            int[] secondHalf= new int[secondHalfLength];
            System.arraycopy(list, list.length/2, secondHalf, 0, secondHalfLength);
            mergeSort(secondHalf); //recursive call to merge the second half of the list of the current recursive list 

            //merge first half with second half int list (original list) 
            merge(firstHalf, secondHalf, list);
            
        }
    }

    public static void merge(int[] list1, int[] list2, int[] temp){
        int current1=0; //current index in list 1
        int current2=0; //current index in list 2
        int current3=0;  //current index in list temp
        
        //while both lists have the same size 
        while(current1 < list1.length && current2 < list2.length){
            if(list1[current1] < list2[current2]){
                temp[current3++]=list1[current1++];
            }else{
                temp[current3++]= list2[current2++];
            }
        }

        //if list 1 has larger size than list 2 append the rest 
        while(current1 < list1.length){
            temp[current3++] = list1[current1++];
        }

        //if list 2 has a larger size than list 1, append the rest
        while(current2 < list2.length){
            temp[current3++]=list2[current2++];
        }
        
    }
}
