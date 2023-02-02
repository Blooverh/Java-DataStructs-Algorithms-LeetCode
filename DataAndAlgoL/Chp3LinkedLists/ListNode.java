package DataAndAlgoL.Chp3LinkedLists;

/*
 * This class creates the nodes for a linked list, as well as its pointers to the next node.
 */
public class ListNode {
    public int data;
    public ListNode next;

    public ListNode(int data){
        this.data= data;
    }

    public void setData(int data){
        this.data= data;
    }

    public int getData(){
        return data;
    }

    //sets pointer to the next List node 
    public void setNext(ListNode next){
        this.next= next;
    }

    //returns the next node at which previous node was pointing too
    public ListNode getNext(){
        return this.next;
    }
}
