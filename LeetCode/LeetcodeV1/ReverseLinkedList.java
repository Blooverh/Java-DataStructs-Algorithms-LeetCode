package LeetcodeV1;
import java.util.ArrayList;
import java.util.LinkedList;


public class ReverseLinkedList {
    public static void main(String[] args) {
        ArrayList<ListNode> list= new ArrayList<>();
        
    }

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static ListNode reverseList(ListNode head) {
        /* iterative solution */
        ListNode newHead = null;
        while (head != null) {
            ListNode next = head.next;
            System.out.println(next);
            head.next = newHead;
            newHead = head;
            System.out.println(newHead);
            head = next;
            System.out.println(next);
        }
        return newHead;
    }


}
