import java.util.*;
//cycle detect in directed graph
public class cycledirectedgraph {
    static class Edge{
        int  src;
        int dest;
    
        public Edge(int s, int d ){
            this.src=s;
            this.dest= d;
          
        }
    }
    public static void creategraph(ArrayList<Edge>[] graph) {
        
        for(int i=0;i<graph.length;i++){
            graph[i]= new ArrayList<>();

           }
    //0- vertex
    graph[0].add(new Edge(0, 2));
   // graph[0].add(new Edge(0, 2));

    //1- vertex
    graph[1].add(new Edge(1, 0));
   // graph[1].add(new Edge(1, 3));
   
    //2- vertex
    graph[2].add(new Edge(2, 3));
 //   graph[2].add(new Edge(2, 4));
   

    //3- vertex
    graph[3].add(new Edge(3, 0));
    //graph[3].add(new Edge(3, 4));


}
public static boolean isCycle( ArrayList<Edge>[] graph) {
    boolean vis[]= new boolean[graph.length];
    boolean stack[] = new boolean[graph.length];

    for(int i=0;i<graph.length ;i++){
        if(!vis[i]){
            if(isCycleUtil(graph , i ,vis,stack)){
                return true;
            }
        }
    }
    return false;
}

public static boolean isCycleUtil(ArrayList<Edge>[] graph, int curr , boolean vis[] , boolean stack[]) {
    vis[curr]= true;
    stack[curr]= true;

    for(int i=0;i<graph[curr].size() ; i++){
        Edge e= graph[curr].get(i);
        if(stack[e.dest]){
            return true;   //cycle
        }
        if(!vis[e.dest] && isCycleUtil(graph, e.dest, vis, stack)){
            return true;
        }
    }
    stack[curr]= false;
    return false;
    
}
public static void main(String args[]) {
    /*   
      0-----2
     /     /
    /     /
   1     4 
    \   /  
     \ /  
      3
           */

           int V=7;
           ArrayList<Edge>[] graph= new ArrayList[V];
           creategraph(graph);
           System.out.println(isCycle(graph));
}
}
