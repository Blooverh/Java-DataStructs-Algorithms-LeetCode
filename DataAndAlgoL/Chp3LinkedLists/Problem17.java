package DataAndAlgoL.Chp3LinkedLists;
/* Reverse a singly linked list.*/
public class Problem17 {
    public static void main(String[] args) {
        
    }

    public static ListNode reverseListIterative(ListNode head){
        ListNode newHead= null;

        while(head != null){
            ListNode next= head.getNext();
            head.setNext(newHead);
            newHead= head;
            head= next;
        }

        return newHead;
    }
}
