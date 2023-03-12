package Grind169.LinkedLists;

public class SwapNodesInPairs_24 {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static void main(String[] args) {
        
    }

    public static ListNode swapPairs(ListNode head) {
        ListNode temp; 
        if(head ==null ){
            return null;
        }else if(head != null  && head.next ==null){
            return head;
        }else{
            temp=head.next;
            head.next=temp.next;
            temp.next=head;
            head=temp;
            head.next.next= swapPairs(head.next.next);
            return head;
        }
    }
}
