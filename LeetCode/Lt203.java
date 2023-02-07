/*Remove linked list elements that have the same val and variable val */
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
public class Lt203 {
    public static void main(String[] args) {
        
    }

    public ListNode removeElements(ListNode head, int val) {
        if (head == null) return null;
        head.next = removeElements(head.next, val); 
        if(head.val ==val){
            return head.next;
        }else{
            return head;
        }
       
    }
}
