package DataAndAlgoL.Chpt7BinaryHeapsPriorityQs;

public class Heap {
    public int[] array; 
    public int count; //number of elements in heap
    public int capacity; // size of the heap
    public int heap_type; // Min heap or Max Heap


    //contructor
    public Heap(int capacitty , int heap_type){
        this.heap_type= heap_type;
        this.count= 0; //default value 
        this.capacity= capacity;
        this.array= new int[capacity];
    }

    //Parent of a node, complexity -> O(1)
    public int parent(int i){
        if(i <= 0 || i >= this.count){
            return -1;
        }

        return i-1/2;
    }

    //Children of node 

    //left child
    public int leftChild(int i){
        int left= 2*i+1;

        if(left >= this.count){
            return -1;
        }

        return left;
    }

    public int rightChild(int i){
        int right= 2*i+2;
        if(right >= this.count){
            return -1;
        }

        return right;
    }

    //get max element in heap
    public int getMax(){
        if(this.count==0){
            return -1;
        }

        return this.array[0]; //if it is max heap root (array[0]) is the largest element in heap
    }

    //Heapifying an element at location i for max heap
    public void percolateDown(int i){
        int l, r, max, temp;
        l=leftChild(i);
        r=rightChild(i);

        if(l != -1 && this.array[l] > this.array[i]){ //check which node is max, parent (nnew node i) or its child  
            max=l;
        }else{
            max=i;
        }

        if(r != -1 && this.array[r] > this.array[max]){
            max=r;
        }
        //Swap array[i] with arra[max]
        if(max != i){
            temp= this.array[i];
            this.array[i]= this.array[max];
            this.array[max]=temp;
        }

        percolateDown(max); //recursive call untill all nodes are correct location.
    }
}
