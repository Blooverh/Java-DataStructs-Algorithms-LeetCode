package DataAndAlgoL.Chpt9GraphAlgorithms;

import java.util.ArrayList;
import DataAndAlgoL.Chp3LinkedLists.ListNode;
//import DataAndAlgoL.Chp3LinkedLists.LinkedList;

public class GraphAdjList {
    ArrayList<Integer> vertices;
    ListNode[] edges;
    int vertexCount=0;

    public GraphAdjList(int vertexCount){
        this.vertexCount=vertexCount;
        vertices= new ArrayList<>();
        edges= new ListNode[vertexCount];
        for(int i=0; i< vertexCount; i++){
            vertices.add(i);
            edges[i]= new ListNode(0);
        }
    }

    public void addEdge(int source, int destination){
        int i= vertices.indexOf(source);
        int j= vertices.indexOf(destination);

        if(i != -1 && j != -1){
           // edges[i].insertAtBeginning(destination);
           // edges[j].insertAtBeginning(source);
        }
    }
}
