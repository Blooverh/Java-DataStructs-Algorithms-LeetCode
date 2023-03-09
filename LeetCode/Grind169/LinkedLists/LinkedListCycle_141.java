package Grind169.LinkedLists;

public class LinkedListCycle_141 {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static void main(String[] args) {
        
    }

    public static boolean hasCycle(ListNode head) {
        ListNode slow=head;
        ListNode fast= head;
        if(head == null){
            return false;
        }
        while(fast.next != null && fast.next.next != null){
            slow= slow.next;
            fast=fast.next.next;

            if(slow == fast){
                return true;
            }
        }

        return false;
    }
}
