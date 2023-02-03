package DataAndAlgoL.Chpt9GraphAlgorithms;
//below class reads an undirected graph
public class Graph {
    public boolean adjMatrix[][];
    public int vertexCount;

    //constructor
    public Graph(int vertexCount){
        this.vertexCount= vertexCount;
        adjMatrix= new boolean[vertexCount][vertexCount]; //boolean 2-d array as a matrix with a max amount o VxV vertices
    }
    //adding an edge between to vertices 
    public void addEdge(int i, int j){
        if(i >=0 && i < vertexCount && j> 0 && j <vertexCount){
            adjMatrix[i][j]=true;
            adjMatrix[j][i]=true;
        }
    }

    public void removeEdge(int i, int j){
        if(i >=0 && i < vertexCount && j> 0 && j <vertexCount){
            adjMatrix[i][j]=false;
            adjMatrix[j][i]=false;
        }
    }

    public boolean isEdge(int i, int j){
        if(i >=0 && i < vertexCount && j> 0 && j <vertexCount){
            return adjMatrix[i][j]; //only if the edge is set to true which means it exists
        }else{
            return false;
        }
    }
}
