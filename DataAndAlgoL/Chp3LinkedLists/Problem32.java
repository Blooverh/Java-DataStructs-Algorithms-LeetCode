package DataAndAlgoL.Chp3LinkedLists;
/*
 * GIVEN 2 SORTED LIST L1 AND L2 WE NEED TO MERGE THEM INTO A NEW LIST IN SORTED ORDER
 * 
 */
public class Problem32 {
 
    public static void main(String[] args) {
        
    }

    public static ListNode mergeTwoLists(ListNode head1, ListNode head2){
        if(head1== null){
            return head2;
        }

        if(head2 == null){
            return head1;
        }

        ListNode head;

        if(head1.getData() <= head2.getData()){
            head=head1;
            head.next=mergeTwoLists(head1.next, head2);
        }else{
            head=head2;
            head.next=mergeTwoLists(head2.next, head1);
        }

        return head;
    }
}
