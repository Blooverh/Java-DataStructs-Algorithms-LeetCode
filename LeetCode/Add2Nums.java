

//Definition for singly-linked list.
 class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
/*
 * create 1st list -> dummy list that will contain any value of our choice 
 * create a pointer (current) that will point the dummy node and traverse it
 * create variable sum that will store sum of L1 and L2 into dummy list 
 * create variable (carry) to store 2 value digits, since list can only have 1 digit nodes 
 * carry will be modulo; carry = sum % 10, example: carry = 10%10
 * formula: sum= L1+L2+carry 
 * the carry value will be added to next the next sum if one list bigger than the other 
 * 
 */
public class Add2Nums {

    public static void main(String[] args) {


      }
    public static ListNode add2nums(ListNode L1, ListNode L2){
            ListNode dummy = new ListNode(0); //empty dummy list 
            ListNode current= dummy; //pointer initialization
            int carry =0; //carry initialization with value 0 initially 

            while(L1 != null || L2 !=null || carry ==1 ){ // for base case avoidance
                 int sum=0; 
                 if (L1 != null){ //adding L1 to our sum and moving L1 to next node 
                    sum += L1.val;
                    L1=L1.next;
                 }

                 if(L2!= null){
                    sum+= L2.val;
                    L2= L2.next;
                 }

                 sum+= carry; // if we have to carry then add it to the sum
                 carry= sum/10; // if we carry, then divide by 10 to get the carry number 
                 ListNode node= new ListNode(sum%10); // the value we will get by moduling will become new node, then add to final list (returning list)
                 current.next = node ; // current will point to that node in ListNode node if we get
                 current = current.next; // update the current everytime
            }

            return dummy.next; // return dummy next because we do not want the value we have considered initially
        
        }

}
 /* 
Time Complexity :- BigO(max(N, M)) where N is length of l1 & M is length of l2
Space Complexity :- BigO(max(N,M))
 */