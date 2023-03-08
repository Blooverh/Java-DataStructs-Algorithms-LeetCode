package DataAndAlgoL.Chp3LinkedLists;

//PROBLEM 40 EXCHANGE THE ADJACENT ELEMENTS
public class ExchangeAdjacenNodes {
    public ListNode exchangeAdjNode(ListNode head){
        ListNode temp = new ListNode(0); //temporary node to point to head
        temp.next = head; //temp points its next node as head
        ListNode prev = temp, curr = head; // prev is temp node and current is the head 
        while(curr != null && curr.next != null){ //while current has a head and current.next has a pointer to head's next node
            ListNode tmp = curr.next.next; //tmp becomes the 2 next nodes to curr 
            curr.next.next = prev.next; //
            prev.next = curr.next;
            curr.next = tmp;
            prev = curr;
            curr = prev.next;
        }
        return temp.next;
    }
}
