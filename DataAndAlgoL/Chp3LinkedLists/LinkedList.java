package DataAndAlgoL.Chp3LinkedLists;

/*
 * This class uses linked lists with the usage of nodes and pointers
 * Thus this class is an upgraded implementation of original Linked list class in java API
 */
public class LinkedList{
    public int length; //length of linked list
    ListNode head; //only field in the class it holds the head of the list 

    //default constructor
    public LinkedList(){
        length=0;
    }

    //return first node in list
    public synchronized ListNode getHead(){
        return head;
    }

    //insert a node at the beginning of the list
    public synchronized void insertAtBeginning(ListNode node){
        node.setNext(head);
        head=node;
        length++;
    }

    //insert a node at the end of the list
    public synchronized void insertAtEnd(ListNode node){
        if(head==  null){
            head=node;
        }else{
            ListNode p, q;
            for(p=head;(q=p.getNext()) != null; p=q);
                p.setNext(node);
        }

        length++;
    }

    //Add a new value to the list at a given position 
    //All values at that position to the end move over to make room
    public void insert(int data, int position){
        //fix positions in case poistion is less than 0 or larger than current length of the list 
        if(position<0){
            position=0;
        }

        if(position > length){
            position = length;
        }

        //if the list is empty, make it be the only element
        if(head== null){
            head= new ListNode(data);
        }else if(position==0){ ///if adding in front of the list
            ListNode temp= new ListNode(data);
            temp.next=head;
            head=temp;
        }else{ //else find the correct position and insert
            ListNode temp= head;
            for(int i=1; i< position; i++){
                temp= temp.getNext();
            }

            ListNode newNode= new ListNode(data);
            newNode.next= temp.next;
            temp.setNext(newNode);
        }

        length++;
    }

    //remove and return the node at the head of the list 
    public synchronized ListNode removeFromBegin(){
        ListNode node= head;
        if(head != null){
            head=node.getNext(); //node after initial head becomes new head 
            node.setNext(null); //set old head which is node to null and return its value
        }
        return node;
    }

    //remove and return the node at the end of the list
    public synchronized ListNode removeFromEnd(){
        if(head== null){
            return null;
        }

        ListNode p= head;
        ListNode q= null;
        ListNode next= head.getNext();

        if(next== null){ //if list contains one node, then set its node value to null as this node is the head of the list 
            head=null;
            return p; //return its value 
        }

        //traverses the list until pointer points to null 
        while((next = p.getNext())!= null){
            q=p;
            p=next;
        }
        //when p is the last node we assign the  pointer of q to null which has the value of node p
        q.setNext(null);
        return p;
    }

    //Remove a node matching the specified node from the list 
    //use equals() instead of == to test for a matched node as they are objects of type ListNode
    public synchronized void removedMatched(ListNode node){
        if(head==null){
            return;
        }

        if(node.equals(head)){
            head=head.getNext();
            return;
        }

        ListNode p= head;
        ListNode q= null;

        //this removal is by setting a temp variable and freeing the current node and do the same process to all nodes 
        while((q=p.getNext()) != null){
            if(node.equals(p)){
                p.setNext(q.getNext());
                return;
            }

            p=q;
        }
    }

    //Remove the value at a given position
    //if position <0, remove the value at position 0
    //if position greater than 0, remove the value at the last position

    public void remove(int position){
        if(position <0){
            position=0;
        }

        if(position >0){
            position=length-1;
        }

        //if nothing is in the list, do nothing 
        if(head== null){
            return;
        }

        if(position==0){
            head= head.next; //the node the current head is pointing to becomes the new head of the list 
        }else{ //else advance to correct position and remove 
            ListNode temp= head;
            for(int i=1; i< position; i++){
                temp= temp.getNext();
            }

            temp.setNext(temp.getNext().getNext());
        }

        //reduce length of the list 
        length--;
    }

    //return a string representation of this collection in the form ["str1", "str2",...]
    public String toString(){
        String res= "[";
        if(head== null){
            return res +" ]";
        }

        res= res+head.getData();
        ListNode temp= head.getNext();
        while(temp != null){
            res=res+","+ temp.getData();
            temp= temp.getNext();
        }

        return res+"]";
    }

    //return length of the list;
    public int length(){
        return length;
    }

    //find the position of the first value that is equal to a given value 
    //The equals method is used to determine equality

    public int getPosition(int data){
        //look for data
        ListNode temp= head;
        int position=0;
        while(temp != null){
            if(temp.getData()== data){
                return position;
            }
            position++;
            temp= temp.getNext();
        }
        //else return some large value
        return Integer.MIN_VALUE;
    }

    //remove everything from the list
    public void clear(){
        head= null;
        length=0;
    }

}
