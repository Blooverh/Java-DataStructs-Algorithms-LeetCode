package DataAndAlgoL.Chp3LinkedLists;



public class Problem2 {
    public static void main(String[] args) {
        
    }

    //solution from problem 5
    public static ListNode NthNodeFromEnd(ListNode head, int NthNode){
        ListNode pTemp=head; //temporary node 
        ListNode pNthNode= null; //counts the number of nodes

        for(int i=1; i<NthNode; i++){
            if(pTemp != null){
                pTemp= pTemp.getNext(); //if temporary pointer is not null get the next node until we find the end of the list 
            }
        }

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
}
