package DataAndAlgoL.Chpt9GraphAlgorithms;
import java.util.*;
import DataAndAlgoL.Chpt9GraphAlgorithms.DFSandBFSGraph;
//sole purpose of avoiding the error, still needs implementation
class LLQueue{

}
public class topologicalSort {
    // public void TopologicalSort(DFSandBFSGraph G){
    //     LLQueue Q= new LLQueue(); //linked list queue
    //     int counter=0;
    //     int v, w;

    //     for(int i =0; i< DFSandBFSGraph.vertexCount; i++){
    //         if(indegree[i]==0){
    //             Q.deQueue(i); //if indegree is 0 remove those vertices from queue (dequeue the vertices) 
    //         }
    //     }

    //     while(!Q.isEmpty()){
    //         v=Q.deQueue();
    //         topologicalOrder[v]=counter++;
    //         for each w adjacent to v
    //             if(--indegree[w]==0){ //decrement indegree of w (adjacent vertex), if that indegree is 0, enqueue vertex to queue
    //                 Q.enQueue(w);
    //             }
    //     }
    //     if(counter != G.vertexCount){
    //         System.out.println("Graph has a cycle");
    //     }

    //     Q.deleteQueue();
    // }    
}
