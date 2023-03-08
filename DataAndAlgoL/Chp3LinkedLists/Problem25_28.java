package DataAndAlgoL.Chp3LinkedLists;

/*
 * How can we find the middle of a linked list !!
 * With just one scan which is the faster algorithm
 * 
 * OBJECTIVE -> USE 2 POINTERS, ONE GOES TWICE FAST THAN THE OTHER ONCE FAST NODE REACHES NULL POINTER 
 * SLOW POINTER WILL BE AT THE MIDDLE POSITION
 * 
 * NOTE: IF LIST HAS AN EVEN LENGTH MIDDLE NODE WILL BE N/2
 */
public class Problem25_28 {
    public static void main(String[] args) {
        
    }

    public static ListNode findMid(ListNode head){
        ListNode fast= head;
        ListNode slow= head;
        int i=0;

        //Loops until the tail is reached
        while(fast.next!= null){
            if(i==0){ //increment only 1st pointer 
                fast=fast.next;
                i=1;
            }else if(i==1){
                //increement both pointers
                fast=fast.next;
                slow= slow.next;
                i=0;
            }
        }

        return slow;
    }
}
