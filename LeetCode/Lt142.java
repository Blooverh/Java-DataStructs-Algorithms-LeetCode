public class Lt142 {
    public static void main(String[] args) {
    
    }  
    
    public static ListNode detectCycle(ListNode head) {
        ListNode slow= head;
        ListNode fast= head;
        boolean isLoop= false;

        if (fast == null || fast.next == null) return null;

        while(fast != null && fast.next != null){
            fast= fast.next.next;
            slow= slow.next;
            if(slow == fast){
                isLoop=true;
                break;
            }
        }

        if(isLoop){
            slow=head;
            while(slow != fast){
                slow= slow.next;
                fast=fast.next;
            }

            return fast;
        }

        return null;
    }
 
}
