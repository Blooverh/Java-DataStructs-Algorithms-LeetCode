package LeetcodeV1;
// You are given the heads of two sorted linked lists list1 and list2.
// Merge the two lists in a one sorted list. The list should be made by splicing together the nodes of the first two lists.
// Return the head of the merged linked list.

// Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
 
/*
 * 
 */
public class merge2sorterLists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode sorted= new ListNode(0); // New node with value 0
        ListNode previous= sorted; // node previous becomes new sorted node with value 0

        //base cases 
        if(list1 == null && list2 == null){ //if both lists are empty return null
            return null;
        }

        if(list1 == null){ //if list one is empty return list2
         return list2;
        }

        if(list2 == null){ //if list 2 is empty, print list1
            return list1;
        }

        //solution
        while(list1 != null && list2 != null){ //if both lists are not empty
            if(list1.val <= list2.val){ 
                previous.next=list1;
                list1= list1.next;
            }else{
                previous.next=list2;
                list2=list2.next;
            }
            previous=previous.next;
        }

        //  if list 1 greater than list 2 last node is appended in sorted node 
        if( list1 != null){
            previous.next = list1;
        }
        // if list 2 greater than list 1, last node is appended in sorted node 
        if(list2 != null){
            previous.next = list2;
        }

        return sorted.next;
    }

    //Recursion solution
    // public ListNode mergeTwoLists(ListNode l1, ListNode l2){
	// 	if(l1 == null) return l2;
	// 	if(l2 == null) return l1;
	// 	if(l1.val < l2.val){
	// 		l1.next = mergeTwoLists(l1.next, l2);
	// 		return l1;
	// 	} else{
	// 		l2.next = mergeTwoLists(l1, l2.next);
	// 		return l2;
	// 	}
    // }
}
