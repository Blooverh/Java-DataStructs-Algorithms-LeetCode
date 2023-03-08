package DataAndAlgoL.Chp3LinkedLists;

/* Displaying a linked list from the end
 * 
 * Objective: recursively traverse until the end of the linked list, when coming back start printing the elements
 */
public class Problem29 {
    public static void main(String[] args) {
        
    }   

    public static void printListEnd(ListNode head){
        if(head == null){
            return;
        }

        printListEnd(head.getNext());
        System.out.println(head.getData());
    }

}
