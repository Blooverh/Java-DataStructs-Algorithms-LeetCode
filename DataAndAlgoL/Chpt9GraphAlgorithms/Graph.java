package DataAndAlgoL.Chpt9GraphAlgorithms;
import java.util.*;

import javax.xml.transform.Source;

public class Graph {
    /*//specifying a string that represents a new line character
    Retrieves the value of the line separator property of the system, which is the character sequence used to separate lines in text files 
    */
    private static final String NEWLINE= System.getProperty("line.separator"); 

    private final int V; // creates vertex number
    private int E; //creates number of edges 
    private boolean[][] adjMatrix; //creates a matrix of boolean values for graph and dfs algotrithm
    boolean[] visited; //creates array to store whether vertices where visited previously
    
    //Empty graph with V vertices 
    public Graph(int V){
        if(V < 0) throw new IllegalArgumentException("Too few vertices"); // checks for error as V cannot be < 0
        this.V= V;
        this.E=0;
        this.adjMatrix= new boolean[V][V]; //creates matrix with number of vertices by number of vertices
        visited= new boolean[V]; //creates an array with size V (# of vertices)
    }

    //random graph with V vertices and E edges
    public Graph(int V, int E){
        this(V);
        if(E > (long) V*(V-1)/2+V) throw new IllegalArgumentException("Too many edges");
        if(E<0) throw new IllegalArgumentException("Too few eges");
        Random random= new Random();

        //can be inefficient 
        while(this.E != E){
            int u= random.nextInt(V);
            int v= random.nextInt(V);
            addEdge(u,v); // creates edge between adjacent vertices
        }

        visited= new boolean[V];
    }

    //number of vertices and edges
    public int V(){
        return V;
    }

    public int E(){
        return E;
    }

    //adding undirected edge u-v
    public void addEdge(int u, int v){
        if(!adjMatrix[u][v]){
            E++;
        }
        adjMatrix[u][v]= true; //undirected edge from u-v 
        adjMatrix[v][u]=true; //undirected edge from v-u
    }

    //does graph contain the edge u-v
    public boolean contains(int u, int v){
        return adjMatrix[u][v];
    }

    //return list of neighbors of u
    public Iterable<Integer> adjMatrix(int u){
        return new AdjIterator(u);
    }

    //support iteration over graph vertices 
    private class AdjIterator implements  Iterator<Integer>, Iterable<Integer>{
        private int u;
        private int v=0;

        AdjIterator(int u){
            this.u=u;
        }
        
        public Iterator<Integer> iterator() {
            return this;
        }

        @Override
        public boolean hasNext() {
           while(v < V){
            if(adjMatrix[u][v])
                return true;
            v++;
           }

           return false;
        }

        @Override
        public Integer next() {
            if(!hasNext()){
                throw new NoSuchElementException();
            }

            return v++;
        }

        public void remove(){
            throw new UnsupportedOperationException();
        }
        
    }

    //String representation of Graph - Takes O(n^2) time
    public String toString(){
        StringBuilder s = new StringBuilder();
        s.append("Undirected graph" + NEWLINE);
        s.append("Vertices:"+ V + " and edges:" + E + NEWLINE);
        for (int u = 0; u < V; u++) {
            s.append(u + ": ");
            for (int v = 0; v < V; v++) {
                s.append(String.format("%7s", adjMatrix[v][u]) + " ");
            }
            s.append(NEWLINE);
        }
        return s.toString();
    }

    void clearVisited(){
        for (int i = 0; i < visited.length; i++)
            visited[i] = false;
    }

    //ALGORITHM IMPORTANT PART DFS ALGORITHM 
    public void dfs(){
        //visit nodes using a stack to store "to visit" nodes 
        Stack<Integer> s= new Stack<>();
        clearVisited(); //set all visited[i]=0;
        s.push(0); // start the "to visit" at node 0

        //LOOP AS LONG AS THERE ARE ACTIVE NODES
        while(!s.isEmpty()){
            int nextNode; //next Node to visit
            int i;
            nextNode= s.pop();
            if(!visited[nextNode]){ //current node has't been visited
                visited[nextNode]=true; //mark node as visited
                System.out.println("nextNode "+nextNode);
                for(i=0 ; i< V; i++){ //for i < than the total number of vertices
                    if((this.adjMatrix[nextNode][i]==true) && !this.visited[i]){ // if next column assigning to the next node from current node is true in matrix and has not beed visited, push that next node
                        s.push(i); //node pushed that has a connection of value true to previous node 
                    }
                }
            }
        }
    }

    //BFS ALGORITHM IMPORTANT 
    public void bfs(){
        Queue<Integer> q = new LinkedList<>(); //BFS USES QUEUE DATA SRUCTURE
        clearVisited();
        q.add(0);

        //LOOP AS LONG AS THERE IS AN ACTIVE NODE
        while(!q.isEmpty()){
            int nextNode =q.remove(); // NEXT NODE TO VISIT
            if(!visited[nextNode]){
                visited[nextNode]=true; //MARK NODE/VERTEX AS VISITED
                System.out.println("nextNode= "+nextNode); //PRINT CURRENT NODE STARTING FROM FIRST NODE/VERTEX
                for(int i=0; i< V; i++){
                    if(adjMatrix[nextNode][i] ==true && !visited[i]){ //IF NEXTNODE ON THE SAME ROW BUT NEXT COLUMN IS TRUE AND NOT VISITED ADD THAT NODE TO THE QUEUE TO EXPLORE THE NEXT VERTICES
                        q.add(i);
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        int V =5;
        int E =7;
        Graph G= new Graph(V,E);
        System.out.println(G.toString());
        System.out.println("DFS ALGORITHM");
        G.dfs();
        System.out.println();
        System.out.println("BFS ALGORITHM");
        G.bfs();
    }
}
