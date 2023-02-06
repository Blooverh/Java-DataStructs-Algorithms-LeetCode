package Blind75;
//Definition for singly-linked list.
class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
public class Lt19 {
    public static void main(String[] args) {
        
    }

    //get previous to node to the node be deleted, point to node next to the node to be deleted
    //and point node to be deleted to null 
    // 1 -> 2 -> 3 -> 5 -> null
    //          4 -> null  
    //return deleted node
    /*We can use the turtle and rabbit algoritm from cycle list, so the faster pointer reaches faster to node to be deleted
     * and slow pointer will then point to next node to faster node
    */
    public ListNode removeNthFromEnd(ListNode head, int n) { //n is the gap between the 2 nodes slow and fast
        ListNode start= new ListNode(0);
        ListNode slow= start;
        ListNode fast= start;
        
        //Move fast in front so that the gap between slow node and fast node becomes n 
        for(int i=1; i<=n+1; i++){
            fast=fast.next;
        }

        //Move fast to the end, maintaining the gap
        while(fast != null){
            slow= slow.next;
            fast= fast.next;
        }

        //skip the desired node
        slow.next= slow.next.next;
        return start.next;// returns every node in the list besides deleted node 
    }
}
