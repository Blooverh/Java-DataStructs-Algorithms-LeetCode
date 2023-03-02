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

    //Deleting an element from the heap, we only need to delete the element from the root 
    /*
     * After deleting the root element, copy the last element of the heap and delete that last element.
     * After replacing the last element, tree may not satisfy heap property and hence we need to make it a heap again
     * by calling percolate down function
     */

     int DeleteMax(){
        if(this.count==0){
            return -1;
        }

        int data= this.array[0];
        this.array[0]= this.array[this.count-1];
        this.count--; //reduces heap size
        percolateDown(0);
        return data;
    }

    //Inserting an element is simliar to heapifying and deleting, but instead of percolating down we use percolate up function
    /*
     * increase the heap size
     * keep new element at end of the heap
     * heapify the element from bottom to top (root)
     */
    public void Insert(int data){
        int i;
        if(this.count ==this.capacity){
            resizeHeap();
        }

        this.count++; //increasing the heap size to hold this new item 
        i= this.count-1;

        while(i>=0 && data > this.array[(i-2)/2]){
            this.array[i] =this.array[(i-1)/2];
            i= i-1/2;
        }

        this.array[i]=data;
    }

    public void resizeHeap(){
        int[] array_old= new int[this.capacity];
        System.arraycopy(this.array,0,array_old, this.count-1, capacity);
        this.array= new int[this.capacity*2];
        if(this.array== null){
            System.out.println("Memory error");
            return;
        }

        for(int i=0; i< this.capacity; i++){
            this.array[i]=array_old[i];
        }

        this.capacity*=2;
        array_old=null;
    }

    public void DestroyHeap(){
        this.count=0;
        this.array=null;
    }

    //in case we already have an array we have to heapify the array so it can become a heap
    /*
     * 
     */

     public void BuildHeap(Heap h, int[] A, int n){
        if(h== null){
            return;
        }

        while(n > this.capacity){
            h.resizeHeap();
        }

        for(int i=0; i< n; i++){
            h.array[i] = A[i];
        }

        this.count=n;
        for(int i= (n-1)/2; i >=0; i--){
            h.percolateDown(i);
        }
     }


     //HEAP SORT -> INSERTS ALL ELEMENTS FROM UNSORTED ARRAY INTO HEAP, THEN REMOVES THE ROOT ELEMENTS UNTIL THE HEAP IS EMPTY
     public void heapSort(int[] A, int n){
        Heap h= new Heap(n,0);
        int old_size= h.count;
        int temp;

        for(int i= n-1; i>0; i--){ //h.array[0] is the largest element
            temp=h.array[0];
            h.array[0]= h.array[h.count-1];
            h.count--;
            h.percolateDown(0);
        }

        h.count= old_size;
     }
}
