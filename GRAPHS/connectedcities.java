import java.util.*;
public class connectedcities {

    //---------------EDGE CLASS-------------------
static class edge implements Comparable<edge>{
  
    int dest;
    int cost;
    
    public edge( int d, int c){
      
        this.dest = d;
        this.cost = c;
    }

    @Override
    public int compareTo(edge e2){
        return this.cost - e2.cost; //ascending 
    }
}

public static int connectcities(int cities[][]){
    boolean vis[] = new boolean[cities.length];
    PriorityQueue<edge> pq = new PriorityQueue<>();

    pq.add(new edge(0, 0));
    int finalcost = 0;

    while(!pq.isEmpty()){
        edge curr = pq.remove();

        if(!vis[curr.dest]){
            vis[curr.dest] = true;
            finalcost += curr.cost;
            //neighbours
            for(int i=0; i<cities[curr.dest].length;i++){ 
                if(cities[curr.dest][i] != 0){
                 
                    pq.add(new edge(i, cities[curr.dest][i]));
                }
               
                
            }
        }
    }

    return finalcost;

}
    public static void main(String args[]){
       int cities[][] = {{0, 1, 2, 3, 4},
                         {1, 0, 5, 0, 7},
                         {2, 5, 0, 6, 0},
                         {3, 0, 6, 0, 0},
                         {4, 7, 0, 0, 0}};
                                         
        System.out.println(connectcities(cities));
    }
}