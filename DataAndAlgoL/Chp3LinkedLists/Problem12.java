package DataAndAlgoL.Chp3LinkedLists;

import org.w3c.dom.Node;

/*Check whether the given linked list is null-terminated or not
 * If there is a cycle find the start node of the loop
 */
/*SOlUTION: extended version of Floyd cycle finding algorithm
 * After finding the loop in the
    linked list, we initialize the slowPtr to the head of the linked list. From that point onwards both
    slowPtr and fastPtr move only one node at a time. The point at which they meet is the start of the loop.   
*/
public class Problem12 {
    public static void main(String[] args) {
        LinkedList list= new LinkedList();
        list.insert(3, 6);
        for(int i=5; i> 0; i--){
            ListNode node= new ListNode(i);
            list.insertAtBeginning(node);
        }
        

        System.out.println(list.toString());
        
       
    }

    public static ListNode findBeginOfLoop(ListNode head){
        ListNode fast=head;
        ListNode slow=head;
        boolean loopExists=false;
        while(fast != null && fast.getNext() != null){ //while linked list is not empty and head is not null
            fast= fast.getNext().getNext();// double jump, travels at 2x rather than once
            slow= slow.getNext();
            if(slow == fast){ //when both slow and fast node are equals it means a loop is reached asserting that its a circular linked list 
                loopExists=true; //we assign to true and jump of the loop
                break;
            }
        }

        if(loopExists){ //while loop is is
            slow=head; //get slow back to head 
            while(slow != fast){ //while slow and fast are not equal now both travel one jump at time until both pointers are in the loop at the start loop position
                slow=slow.getNext();
                fast=fast.getNext();
            }        

            return fast; //return the pointer where the cycle starts
        }

        return null;
    }
}
