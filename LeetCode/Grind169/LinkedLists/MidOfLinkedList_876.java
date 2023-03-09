package Grind169.LinkedLists;

public class MidOfLinkedList_876 {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static void main(String[] args) {
        
    }

    public static ListNode middleNode(ListNode head) {
        ListNode slow= head;
        ListNode fast= head;

        while(fast != null && fast.next != null){
            slow= slow.next;
            fast= fast.next.next;
        }

        return slow;

        
    }
}
