package DataAndAlgoL.Chp3LinkedLists;
/*\
 * Reverse the linked list in pairs. If you have a linked list that holds 
 * 1→2→3→4→X, then after the function has been called the linked list would hold 2→1→4→3→X.
 */
public class Problem34 {
    public static void main(String[] args) {
        
    }

    //Recursive way
    public static ListNode ReversePairsRec(ListNode head){
        ListNode temp;
        if(head== null || head.next== null){
            return null; //base case for empty or 1 element list
        }else{
            //Reverse pair first
            temp=head.next;
            head.next=temp.next;
            temp.next=head;
            head=temp;
            
            //call method recursively for the rest of the list 
            head.next.next=ReversePairsRec(head.next.next);
            return head;
            
        }
    }

    //Iterative way
    public static ListNode reversePairIte(ListNode head){
        ListNode temp1=null;
        ListNode temp2= null;

        while(head != null && head.next != null){
            if(temp1 != null){
                temp1.next.next=head.next;
            }

            temp1= head.next;
            head.next=head.next.next;
            temp1.next= head;

            if(temp2 ==null){
                temp2=temp1;
            }

            head=head.next;
        }

        return temp2;
    }
}
