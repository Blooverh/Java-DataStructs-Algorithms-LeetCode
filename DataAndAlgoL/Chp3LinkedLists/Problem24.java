package DataAndAlgoL.Chp3LinkedLists;
//Intersection of 2 linked lists 
public class Problem24 {
    public static void main(String[] args) {
        
    }

    //O(max(m,n)) is the run time complexity for this problem
    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int l1=0;
        int l2=0;
        int diff=0;
        ListNode head1= headA;
        ListNode head2= headB;
        //Finding the length of both list and see which one is bigger leads to O(max(n,m))
        //O(n) Iterates throught one list of n inputs
        while(head1 != null){
            l1++;
            head1= head1.next;
        }
        // O(m) Iterates throught a second list of m inputs 
        while(head2 != null){
            l2++;
            head2=head2.next;
        }

        //Taking the different is done in O(1)
        if(l1 < l2){
            head1=headB;
            head2=headA;
            diff= l2-l1;
        }else{
            head1=headA;
            head2= headB;
            diff= l1-l2;
        }

        // O(diff) for making diff steps in longer list 
        for(int i=0; i< diff; i++){
            head1= head1.next;
            while(head1 != null && head2 != null){
                if(head1==head2){
                    return head1;
                }

                head1= head1.next;
                head2=head2.next;
            }
        }

        return null;
    }
}
