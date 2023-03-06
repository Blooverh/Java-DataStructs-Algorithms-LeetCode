package DataAndAlgoL.Chpt7BinaryHeapsPriorityQs;


/*
 * Given a min heap, what is an algorithm to find the maximum element
 * In a min heap, the max element is always at the leaf only 
 */
public class Problem7 {
    public static void main(String[] args) {
        Heap h= new Heap(5, 0);

        h.Insert(5);
        h.Insert(14);
        h.Insert(2);
        h.Insert(10);
        h.Insert(21);

        System.out.println(FindMaxElementMinHeap(h));
    }

    public static int FindMaxElementMinHeap(Heap h){
        int max= -1;
        for( int i= (h.count+1)/2; i < h.count; i++){
            if(h.array[i] >max){
                max=h.array[i];
            }
        }

        return max;
    }
}
