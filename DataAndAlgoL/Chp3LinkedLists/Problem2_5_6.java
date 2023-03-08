package DataAndAlgoL.Chp3LinkedLists;


/*
 * Find the Nth Node from the end of a linked list 
 * Return that node once found
 */
public class Problem2_5_6 {
    public static void main(String[] args) {
        
    }

    //solution from problem 5
    public static ListNode NthNodeFromEnd(ListNode head, int NthNode){
        ListNode pTemp=head; //temporary node 
        ListNode pNthNode= null; //counts the number of nodes
        // pNthNode only starts movinf after pTemp  has made n moves 

        for(int i=1; i<NthNode; i++){
            if(pTemp != null){
                pTemp= pTemp.getNext(); //if temporary pointer is not null get the next node until we find the end of the list 
            }
        }
        //pTemp node moves forward until it reaches the end of the list
        while(pTemp!=null){
            if(pNthNode==null){
                pNthNode= head;
            }else{
                pNthNode=pNthNode.getNext();
            }

            pTemp= pTemp.getNext();
        }

        if(pNthNode != null){
            return pNthNode;
        }

        return null;
    }

    //Using Recursion which is O(2n) = O(n), however small than previous one due to recursion call
    public ListNode NthNodeFromEnd2(ListNode head, int Nth){
        int counter=0;//counts the ietarions up to the node 
        if(head != null){
            NthNodeFromEnd2(head.next, Nth); //recursion call, where if head is not equal to null, increase counter
            counter++;
            if(Nth == counter){// If counter is equal to Nth then return the head
                return head;
            }
        }

        return null; //return null if there is no element in linked list
    }
}
