import java.util.*;
import java.util.LinkedList;
public class bipartite {
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
    graph[0].add(new Edge(0, 1));
    graph[0].add(new Edge(0, 2));

    //1- vertex
    graph[1].add(new Edge(1, 0));
    graph[1].add(new Edge(1, 3));
   
    //2- vertex
    graph[2].add(new Edge(2, 0));
    graph[2].add(new Edge(2, 4));
   ;

    //3- vertex
    graph[3].add(new Edge(3, 1));
    graph[3].add(new Edge(3, 4));

    //4- vertex
    graph[4].add(new Edge(4, 2));
    graph[4].add(new Edge(4, 3));

    //5-vertex
  //  graph[5].add(new Edge(5, 3));
  //  graph[5].add(new Edge(5, 4));
  //  graph[5].add(new Edge(5, 6));

    //6-vertex
  //  graph[6].add(new Edge(6, 5));

    }

    public static boolean isBipartite(ArrayList<Edge>[] graph){
        int col[]=new int[graph.length];
        for(int i=0; i<col.length ;i++){
            col[i]=-1;  //no color
        }

        Queue<Integer> q= new LinkedList<>();

        for(int i=0;i<graph.length;i++){
            if(col[i] ==-1){
                q.add(i);
                col[i] =0;
                while(!q.isEmpty()){
                    int curr= q.remove();
                    for(int j=0;j<graph[curr].size();j++){
                        Edge e= graph[curr].get(j);
                        if(col[e.dest] ==-1){
                            int nextcol = col[curr] == 0 ?1 :0;
                            col[e.dest]= nextcol;
                            q.add(e.dest);

                        }
                        else if(col[e.dest]== col[curr]){
                            return false; // not bipartite

                        }
                    }
                }
            }
        }
        return true;
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
               System.out.println(isBipartite(graph));
    }
}
    
