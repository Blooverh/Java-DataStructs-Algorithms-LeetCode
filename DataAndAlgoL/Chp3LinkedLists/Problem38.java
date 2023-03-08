package DataAndAlgoL.Chp3LinkedLists;

import java.util.List;

/*
 * Split a Circular Linked List into 2 equal parts if number of nodes is even
 * if odd make first list one node extra than second List
 */

 /*ALGORITHM 
  * > Store mid and last pointers of circular list using floyed cycle algorithm 
    > Make second half circular 
    >  Make first half circular
    > set head pointers of the 2 linked lists
  */
public class Problem38 {
    public static void main(String[] args) {
        
    }

    public static void SplitList(ListNode head, ListNode head1, ListNode head2){
        ListNode slow= head;
        ListNode fast= head;

        if(head== null){
            return;
        }

        //If there are odd nodes in the circular list then fast.next becomes head 
        //If its even nodes fast.next.next= head
        while(fast.next != head && fast.next.next != head){
            fast= fast.next.next;
            slow= slow.next;
        }

        //If there are even elements in list the move fast pointer
        if(fast.next.next != head){
            fast=fast.next;
        }

        //set head pointer of 1st half
        head1= head;

        //set head pointer of second half
        if(head.next != head){
            head2=slow.next;
        }

        // make 2nd half circular 
        fast.next= slow.next;

        //make 1st half circular 
        slow.next=head;
    }


}
