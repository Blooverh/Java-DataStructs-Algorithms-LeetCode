package DataAndAlgoL.Chp3LinkedLists;

/*
 * Exchange the adjacent elements in a link list 
 */

public class Problem40 {
    public static void main(String[] args) {
        
    }

    public ListNode exchangeAdjNodes(ListNode head){
        ListNode temp=null; // to hold another node for swap

        temp.next=head;
        ListNode prev= temp;
        ListNode curr= head;

        while( curr != null && curr.next != null){
            ListNode tmp= curr.next.next;
            curr.next.next= prev.next;
            prev.next= curr.next;
            curr.next= tmp;
            prev= curr;
            curr=prev.next;
        }

        return temp.next;
    }
}
