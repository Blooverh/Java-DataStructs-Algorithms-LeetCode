package LeetcodeV1;
/*
 * Given the heads of two singly linked-lists headA and headB, 
 * return the node at which the two lists intersect. If the two linked lists have no intersection at all, return null.
 * INTERSECTION OF 2 LINKED LISTS
 */

public class Lt160 {
    public static void main(String[] args) {
        
    }

    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode a = headA, b = headB;
        while (a != b) {
            a = a == null ? headB : a.next;
            b = b == null ? headA : b.next;
        }
        return a;
    }
}
