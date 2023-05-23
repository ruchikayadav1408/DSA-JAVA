import java.util.*;
public class  Prims {
    static class edge{
        int src;
        int dest;
        int wt;
        
        public edge(int s, int d, int w){
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }
    //--------------CREATE GRAPH--------------------
    static void creategaph(ArrayList<edge> graph []){
        for(int i=0;i<graph.length;i++){
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new edge(0, 1, 10));
        graph[0].add(new edge(0, 2, 15));
        graph[0].add(new edge(0, 3, 30));
    
        graph[1].add(new edge(1, 0, 10));
        graph[1].add(new edge(1, 3, 40));

        graph[2].add(new edge(2, 0, 15));
        graph[2].add(new edge(2, 3, 50));
    
        graph[3].add(new edge(3, 1, 40));
        graph[3].add(new edge(3, 2, 50));
       
    
    }
        static class Pair implements Comparable<Pair>{
            int v;
            int cost;
             public Pair(int v , int c){
                this.v= v;
                this.cost= c;

             }

             @Override
             public int compareTo(Pair p2){
                return this.cost - p2.cost;
             }
        }

  public static void prims_MST(ArrayList<edge> graph[])
  {
    boolean vis[]= new boolean[graph.length];
    PriorityQueue<Pair> pq= new PriorityQueue<>();
    pq.add(new Pair(0, 0));
    int finalcost= 0 ; //total cost min weight
      
     while(!pq.isEmpty()){
        Pair curr = pq.remove();
        if(!vis[curr.v]){
            vis[curr.v]= true;
            finalcost +=curr.cost;

             for(int i=0;i<graph[curr.v].size();i++){
             edge e= graph[curr.v].get(i);
                pq.add(new Pair(e.dest,e.wt));     
                    }
        }
     }
  
    System.out.println("final min cost of MST :  " + finalcost);
}

    public static void main(String args[]){
       
        int V=5;
    
        //int arr[] = new arr[V];
        ArrayList<edge>[] graph = new ArrayList[V]; //null -> empty arraylist
        creategaph(graph);
        prims_MST(graph);
        
    }
}
