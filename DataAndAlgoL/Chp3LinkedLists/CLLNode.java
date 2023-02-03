package DataAndAlgoL.Chp3LinkedLists;

public class CLLNode {
    public CLLNode next;
    public int data;

    public CLLNode(int data){
        this.data= data;
    }

    public void setData(int data){
        this.data= data;
    }

    public int getData(){
        return data;
    }

    //sets pointer to the next List node 
    public void setNext(CLLNode next){
        this.next= next;
    }

    //returns the next node at which previous node was pointing too
    public CLLNode getNext(){
        return this.next;
    }
}
