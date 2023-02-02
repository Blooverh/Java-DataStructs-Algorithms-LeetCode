package Blind75;

public class Lt206 {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static void main(String[] args){
        
    }

    public static ListNode reverseList(ListNode head) {
        ListNode newHead=null;
        while(head != null){
           ListNode next= head.next; //node next becomes the next node to from the head
           head.next= newHead; //
           newHead=head;
           head=next;
        }

        return newHead;
    }

    /* newHead= null
     * reverselist(1)
     * next = head.next => 2
     * head.next => newhead => Null
     * newHead = head = 1
     * head = next => 1
     * 1-> Null
     * 
     * reverselist(2)
     * next = head.next => 3
     * head.next= newHead => Null
     * newHead= head = 2
     * head=next => 2
     * 2 -> 1 -> Null
     * 
     * reverselist(3)
     * next= head.next =>4
     * head.next = newHead= Null
     * newHead = head => 3
     * head= next =>
     * 
     * 3 -> 2 -> 1 -> Null
     * 
     * 
     */
}
