package DataAndAlgoL.Chp3LinkedLists;
/*
 * Check whether the given linked list is NULL-terminated. If there is a cycle, find the length of the loop.
 * 
 * OBJECTIVE IS TO FIND THE AMOUNT OF NODES IN THE LOOP SIDE, 
 * WE NEED TO FIND IF THERE IS A LOOP. WE CAN START COUNTING HOW MANY NODES ARE IN THE LOOP
 * BY HAVING ONE OF THE POINTERS TRAVELING THROUGH THE LOOP UNTIL IT FINDS THE OTHER POINTER THAT STAYED STATIONARY 
 */
/*
 * This solution is also an extension of the basic cycle detection problem. After finding the
    loop in the linked list, keep the slowPtr as it is. The fastPtr keeps on moving until it again comes
    back to slowPtr. While moving fastPtr, use a counter variable which increments at the rate of 1
 */
public class Problem15 {
    public static void main(String[] args) {
        
    }

    public static int findLengthOfTheLoop(ListNode head){
        ListNode slow= head;
        ListNode fast= head;
        int length=0;
        boolean isLoop=false;

        while(slow != null && fast != null){
            slow= slow.getNext();
            fast=fast.getNext().getNext();
            if(slow== fast){
                isLoop=true;
                break;
            }
        }

        if(isLoop){
            length=1;
            fast =slow.getNext();
            while(slow != fast){
                fast=fast.getNext();
                length++;
            }
            
        }

        return length;
    }
}
