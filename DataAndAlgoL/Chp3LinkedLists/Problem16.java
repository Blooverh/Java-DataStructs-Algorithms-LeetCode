package DataAndAlgoL.Chp3LinkedLists;
/* Insert a node in a sorted linked list
 * Solution: Traverse the list and find a position for the element and insert it.
 * 
 * OBJECTIVE -> COMPARE BOTH THE NODE WE WANT TO INSERT PLUS EVERY NODE IN THE LIST 
 * UNTIL WE FIND THE NODE BIGGER THAN THE NEW NODE 
 * THEN WE SWAP THEM 
 */
public class Problem16 {
    public static void main(String[] args) {
        
    }

    public static ListNode inserInSortedList(ListNode head, ListNode newNode){
        ListNode current= head;

        if(head == null){
            head= newNode;
            return newNode;
        }
        
        while(current != null && current.getData() < newNode.getData()){
            ListNode temp= current.getNext();
            newNode.setNext(temp);
            current.setNext(newNode);
        }

        return head;
    }
}
