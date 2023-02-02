package DataAndAlgoL.Chp3LinkedLists;

public class DoublyLinkedList {
    //properties
    public DDLNode head;
    public DDLNode tail;
    public int length;

    //create empty list 
    public DoublyLinkedList(){
        head= new DDLNode(Integer.MIN_VALUE, null, null); //start previous and next node as null and data as minimum integer value
        tail= new DDLNode(Integer.MAX_VALUE, head, null);
        head.setNext(tail); //next node after head is null since list is empty
        length=0;
    }

    //get the value at a given position
    public int get(int position){
        return Integer.MIN_VALUE;
    }

    //find the position of the head value that is equal to the given value 
    //the equals method is used to compare the two DDLNode objects
    public int getPosition(int data){
        DDLNode temp= head;
        int pos=0;
        while(temp != null){
            if(temp.getData() == data){
                return pos;
            }

            pos++;
            temp.getNext();
        }

        return Integer.MIN_VALUE; //return some large value if position not found 

    }

    //returns length of the list
    public int length(){
        return length;
    }

    //Add a new value to the front of the list 
    public void insert(int newVal){
        DDLNode newNode= new DDLNode(newVal, null, head.getNext()); //sets new node with a value null on left pointer
        //and next value as the value after the head
        newNode.getNext().setPrev(newNode); // new node points to next node and sets previous node as itself
        head= newNode; //new node becomes now the head
        length++; //increase the length of the list
    }

    //Add a new value to the list at a given position
    //All values at that position to the end of the list move over to make room
    public void insert(int data, int position){
        //fix the position
        if(position<0){
            position=0;
        }

        if(position >length){
            position=length;
        }

        if(head==null){
            head= new DDLNode(data); //if list is empty add this node to the head position
            tail=head; //beacuse list is empty the one node is the head and the tail
        }else if(position==0){ //if position is front of the list 
            DDLNode temp= new DDLNode(data); //create new temp node 
            temp.next=head; //temp node points now to the head
            head=temp; //and temp node becomes now the new head 
        }else{
            DDLNode temp=head;
            for(int i=1; i< position; i++){ //traverses throught the list until it gets to position
                temp=temp.getNext();
            }

            DDLNode newNode= new DDLNode(data);
            newNode.next=temp.next; //newNode points to the temp's next node (right pointer)
            newNode.prev= temp; //newNode points to the temp node which is the previous node to the position
            newNode.next.prev= newNode; // newNode pointer, points now to previous node and next node 
            temp.next=newNode; //temp (previous node at position) points to the newNode 
        }

        length++;
    }

    public void insertTail(int newVal){
        DDLNode newNode= new DDLNode(newVal, tail.getPrev(), tail); //new node created has a new value and points to previous node to current tail and points to the tail as its next node 
        newNode.getPrev().setNext(newNode); //sets the previous node to tail to point on right pointer to the newNode
        tail.setPrev(newNode);
        length++;
    }

    /*
     * Remove the value at a given position
     * if the position is less than 0, remove head's value (value at position 0)
     * if the position is more than 0, remove the value at the last position
     */

     public void remove(int position){
        if(position <0){
            position=0;
        }

        if(position >0){
            position= length-1;
        }

        if(head== null){
            return;
        }

        //if removing head element
        if(position ==0){
            head= head.getNext();
            if(head==null){
                tail=null;
            }
        }else{
            DDLNode temp= head;
            for(int i=1; i< position; i++){
                temp=temp.getNext();
            }

            //pointing prev and next node to temp to each other since it is a doubly linked list 
            temp.getNext().setPrev(temp.getPrev()); //temp's next node points now to temp's previous node since we are eliminating temp node
            temp.getPrev().setNext(temp.getNext());// temp's previous node points now to temp's next node since we are eleminating temp node
        }

        length--;
    }

    //Remove a node matching the specified node from the list 
    //use equals() method to compare the 2 object of typ DDLNode
    public synchronized void removedMatched(DDLNode node){
        if(head==null){
            return;
        }

        if(node.equals(head)){ // if we remove first node
            head=head.getNext(); // assign new head pointer to the next node to previous head node 
            if(head==null){
                tail=null;
            }
            return;
        }

        DDLNode p= head;
        while(p != null){ //traversing p through the list until last node in list points to null
            if(node.equals(p)){
                p.prev.next= p.next; 
                p.next.prev= p.prev;
                return;
            }
        }
    }

    //remove head value from the list. If the list is empty do nothing 
    public int removeHead(){
        if(length==0){
            return Integer.MIN_VALUE;
        }
        DDLNode save= head.getNext(); //save node becomes next node to current head 
        head.setNext(save.getNext()); 
        save.getNext().setPrev(head);
        length--;
        return save.getData();
    }

    //remove tail value from the list. If the list is empty do nothing 
    public int removeTail(){
        if(length==0){
            return Integer.MIN_VALUE;
        }

        DDLNode save= tail.getPrev();
        tail.setPrev(save.getPrev());;
        save.getPrev().setNext(tail);
        return save.getData();
    }

    public String toString(){
        String res="[]";
        if(length==0){
            return res;
        }

        res= "[" + head.getNext().getData();
        DDLNode temp= head.getNext().getNext();
        while(temp != tail){
            res+=","+temp.getData();
            temp= temp.getNext();
        }

        return res + "]";
    }

    //remove everything from the DDL
    public void clearList(){
        head=null;
        tail=null;
        length=0;
    }
}
