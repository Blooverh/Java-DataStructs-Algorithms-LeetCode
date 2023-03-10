package DataAndAlgoL.Chpt9GraphAlgorithms;

import java.util.Queue;
import java.util.Stack;

class Vertex{
    public char label;
    public boolean visited;
    public Vertex(char lab){
        label=lab;
        visited=false;
    }
}
public class DFSandBFSGraph {
    final int maxVertices=20; //max number of vertices in the graph
    Vertex[] vertexList; //array of vertices 
    int[][] adjMatrix; //matrix that will hold the vertices 
    static int vertexCount;
    Stack theStack; //for dfs
    Queue theQueue;


    public DFSandBFSGraph(){
        vertexList= new Vertex[maxVertices]; //new array of vertices of size maxVertices (20)
        adjMatrix= new int[maxVertices][maxVertices];// matrix that will contain the vertices with matrix size 20x20 
        vertexCount=0; 
        for(int i=0; i< maxVertices; i++){
            for(int j=0; j<maxVertices; j++){
                adjMatrix[i][j]=0; //populate the entire matrix with value 0 for each cell in row and column
            }
        }

        theStack= new Stack();

    }

    public void addVertex(char lab){
        vertexList[vertexCount++]= new Vertex(lab); //each char lab will be put in vertex list starting from 0 (vertexCount)
    }

    //creates an edge with value 1 for the position we want to add the edge
    public void addEdge(int start, int end){
        adjMatrix[start][end]=1;
        adjMatrix[end][start]=1;
    }

    public void displayVertex(int v){
        System.out.println(vertexList[v].label); //displays the char value of the vertex at position v 
    }

    public void dfs(){
        vertexList[0].visited=true;
        displayVertex(0);
        theStack.push(0);
        while(!theStack.isEmpty()){
            int v=getAdjUnvisitedVertex((int) theStack.peek());
            if(v ==-1){
                theStack.pop();
            }else{
                vertexList[v].visited=true;
                displayVertex(v);
                theStack.push(v);
            }
        }

        //reset flags
        for(int i=0; i<vertexCount; i++){
            vertexList[i].visited=false;
        }
    }

    public void bfs(){
        vertexList[0].visited=true; //first vertex assign visited in vertexList 
        displayVertex(0); //displays the first vertex 
        theQueue.add(0); //inserts 1st vertex in queue so we can go to next vertex and explore
        int v2;
        while(!theQueue.isEmpty()){
            int v1= (int) theQueue.remove();
            while((v2=getAdjUnvisitedVertex(v1)) !=1){
                vertexList[v2].visited=true;
                displayVertex(v2);
                theQueue.add(v2);
            }
        }

        for(int j=0; j< vertexCount; j++){
            vertexList[j].visited=false;
        }

    }

    public int getAdjUnvisitedVertex(int v){
        for(int i=0; i< vertexCount; i++){
            if(adjMatrix[v][i]==1 && vertexList[i].visited==false){
                return i;
            }
        }

        return -1;
    }
}
