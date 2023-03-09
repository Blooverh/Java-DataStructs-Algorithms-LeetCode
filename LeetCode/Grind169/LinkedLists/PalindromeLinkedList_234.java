package Grind169.LinkedLists;

public class PalindromeLinkedList_234 {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static void main(String[] args) {
        
    }

    /*\
     * Use Floyeds cycle to find middle of the list 
     * reverse second half of the linked list
     * compare both 1st half and 2nd half 
     */
    public static boolean isPalindrome(ListNode head) {
        //Floyed cycle 
        ListNode slow =head;
        ListNode fast =head;
        // Swap temp nodes 
        ListNode prev;
        ListNode temp;

        //Find middle list using Floyed cycle 
        while(fast != null && fast.next != null){
            slow=slow.next;
            fast=fast.next.next;
        }

        //
        prev=slow; // prev becomes middle node 
        slow= slow.next; //slow becomes next node to middle node 
        prev.next=null; // we assign the prev (mid node) next pointer to null 

        //We swap the nodes in the second half
        while(slow != null){
            temp=slow.next;
            slow.next= prev;
            prev=slow;
            slow=temp;
        }

        //fast goes to first node and slow goes to middle node
        fast=head;
        slow=prev;
        //compare each node fast (from 1st half) and slow node (from 2nd half) check if they are equal
        while(slow != null){
            if(fast.val != slow.val){ //if nodes are no equal then list is not a palindrome and returns false
                return false;
            }

            fast=fast.next;
            slow= slow.next;
        }

        return true;
    }
}
