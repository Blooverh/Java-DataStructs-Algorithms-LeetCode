package DataAndAlgoL.Chpt10SortingAlgorithms.HeapSort;
// HEAP CLASS 
import java.util.ArrayList;

public class Heap<E extends Comparable<E>> {
    private ArrayList<E> list= new ArrayList<>();

    public Heap(){

    }

    public Heap(E[] objects){
        for(int i=0; i< objects.length; i++){
            add(objects[i]); // method from the heap class that adds an elements from array object onto the heap structure 
        }
    }

    public void add(E newObject){
        list.add(newObject); //adds to array list object E / append to the heap
        int currentIdx= list.size() -1; // index of last node

        while(currentIdx >0){
            int parentIdx= (currentIdx-1)/2;
            //swap if the current object E is > than its parent 
            if(list.get(currentIdx).compareTo(list.get(parentIdx))>0){
                E temp= list.get(currentIdx);
                list.set(currentIdx, list.get(parentIdx));
                list.set(parentIdx, temp);
            }else {
                break;
            }

            currentIdx= parentIdx;
        }
    }

    public E remove(){
        //returns null if heap is empty 
        if(list.size() ==0){
            return null;
        }

        E removedObject= list.get(0); // in heaps we always remove the root node 
        list.set(0, list.get(list.size() -1)); //sets the new root
        list.remove(list.size()-1); //removes the last node of the heap 

        int currIdx=0;
        //adjust the tree
        while(currIdx < list.size()){
            int leftChildIdx= 2* currIdx+1;
            int rightChildIdx= 2* currIdx +2;

            //find the max between the 2 children
            if(leftChildIdx >= list.size()){ //the tree is a heap
                break; 
            }
            int maxIdx= leftChildIdx;
            if(rightChildIdx < list.size()){
                if(list.get(maxIdx).compareTo(list.get(rightChildIdx)) < 0){
                    maxIdx=rightChildIdx;
                }
            }
            
            //swap if the current node is less than maximum
            if(list.get(currIdx).compareTo(list.get(maxIdx)) <0){ //SWAP WITH LARGER CHILD
                E temp= list.get(maxIdx);
                list.set(maxIdx, list.get(currIdx));
                list.set(currIdx, temp);
                currIdx= maxIdx;
                }else{
                    break;
                }
        }

        return removedObject;
       
    }

    public int getSize(){
        return list.size();
    }
}
