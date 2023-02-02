package DataAndAlgoL.Chp3LinkedLists;

//CLASS FOR DOUBLE LINKED LIST NODES AND ITS POINTERS 
public class DDLNode {
    public int data;
    public DDLNode prev;
    public DDLNode next;

    public DDLNode(int data){
        this.data=data;
        prev=null;
        next=null;
    }

    public DDLNode(int data, DDLNode prev, DDLNode next){
        this.data=data;
        this.prev=prev;
        this.next=next;
    }

    public void setData(int data){
        this.data=data;
    }

    public int getData(){
        return data;
    }

    public DDLNode getPrev(){
        return prev;
    }

    public DDLNode getNext(){
        return next;
    }

    public void setPrev(DDLNode where){
        prev= where;
    }

    public void setNext(DDLNode where){
        next= where;
    }

}
