package DataAndAlgoL.Chp3LinkedLists;

/*
 * EXERCISE 7 BUT SOLUTION FOR EXERCISE 10
 * Check whether the given linked list is either NULL-terminated or ends in a cycle 
 */
public class Problem7_10 {
    public static void main(String[] args) {
        
    }

    //O(n) Solution -> Original Floyd Cycle algorithm (slow and fast pointer), once they enter a cycle they are expected to meet, which denotes a loop
    public static boolean findLoopIfExists(ListNode head){
        ListNode slow= head;
        ListNode fast= head;

        //If the 2 next pointers of fast are not null 
        //then fast jumps 2 nodes and slow jumps one node
        while(fast.next != null && fast.next.next != null){ 
            fast= fast.next.next;
            slow=slow.next;

            if(slow == fast){ //if there is no null pointers found; however slow and fast are equal, then there is a cycle and return true for existence of a loop
                return true;
            }
        }

        return false;
    }


}
