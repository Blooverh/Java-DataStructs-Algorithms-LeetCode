package DataAndAlgoL.Chp3LinkedLists;
/*
 * Josephus Circle: N people have decided to elect a leader by arranging themselves in a circle
 * and eleminenting every Mth person arounf the circle, closing ranks as each person drops out
 * Find which person will be the last one remaining with rank 1
 * 
 * SOLUTION: Assume the input is a circular linked list with N nodes and each node has a number
 * range 1 to N associated with it. Head node has number 1 as data.
 */
public class Problem44 {
    public static void main(String[] args) {
        
    }

//     public ListNode getJosephusPosition(int N, int M){
//         ListNode p;
//         ListNode q;
//         //create circular linked list containing all the players
//         p.setData(1);

//         q=p;

//         for(int i=2; i<= N; i++){
//             p=p.getNext();
//             p.setData(i);
//         }

//         p.setNext(q); // Close the circular linked list by having the last node point to the first

//         for(int count=N; count >1; count--){
//             for(int i=0; i<M-1; i++){
//                 p=p.getNext();
//                 p.setNext(p.getNext().getNext());// remove the eliminated player from the list 
//             }
//         }

//         return p;

        
//     }
}
