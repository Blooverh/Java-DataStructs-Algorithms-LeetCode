package DataAndAlgoL.Chp3LinkedLists;

public class CoutingCLLNodes {
    public int CircularListLength(CLLNode head){
        int length=0;
        CLLNode currentNode= head.getNext();
        while (currentNode != head){
            length++;
            currentNode=currentNode.getNext();
        }

        return length;
    }
}
