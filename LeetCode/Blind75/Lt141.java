package Blind75;

public class Lt141 {

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public static void main(String[] args) {
        
    }

    //Floyd's cycle-finding algorithm 
    //move first pointer once every iteration and the second pointer twice
    //when first pointer points to the next pointer, and the second pointer points to the same pointer and the first pointer return true 
    //because there is a cycle as the second pointer which is further points to the same value as the first pointer
    public static boolean hasCycle(ListNode head) {
        ListNode slow = head, fast = head;
  
        while (fast != null && fast.next != null) {
          slow = slow.next;
          fast = fast.next.next;
          
          if (slow == fast) 
              return true;
        }
        
        return false;


    }
}
