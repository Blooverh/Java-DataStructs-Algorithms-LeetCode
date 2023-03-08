package DataAndAlgoL.Chp3LinkedLists;
/*
 * Check Whether the given linked list length is even or odd
 * 
 * OBJECTIVE : USE A POINTER THAT TRAVELS 2X (2 NODES AT A TIME)
 * IF LENGTH IS EVEN POINTER WILL BE NULL, OTHER WISE IT IS NOT NULL
 */
public class Problem30 {
    public static void main(String[] args) {
        
    }

    public static int isEvenOrOddLength(ListNode head){
        while(head != null && head.next != null){
            head= head.next.next;
        }

        if(head == null){
            return 0;
        }

        return 1;
    }

    
}
