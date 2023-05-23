import java.util.*;
public class kruskal {
     //---------------EDGE CLASS-------------------
static class edge implements Comparable<edge>{
    int src;
    int dest;
    int wt;
    
    public edge(int s, int d, int w){
        this.src = s;
        this.dest = d;
        this.wt = w;
    }

    @Override
    public int compareTo(edge e2){
      return this.wt - e2.wt; //ascending 
    }
}

//--------------CREATE GRAPH--------------------
static void creategaph(ArrayList<edge> edges){
    edges.add(new edge(0, 1, 10));
    edges.add(new edge(0, 2, 15));
    edges.add(new edge(0, 3, 30));
    edges.add(new edge(1, 3, 40));
    edges.add(new edge(2, 3, 50));
}

static int n = 4;
    static int par[] = new int[n];
    static int rank[] = new int[n];

    public static void init(){
        for(int i=0; i<n;i++){
            par[i] = i;
        }
    }

    public static int find(int x){
        if(x == par[x]){
            return x;
        }

        return par[x] = find(par[x]);
    }

    public static void union(int a, int b){
        int parA = find(a);
        int parB = find(b);

        if(rank[parA] == rank[parB]){
            par[parB] = parA;
            rank[parA]++;
        }else if(rank[parA]<rank[parB]){
            par[parA] = parB;
        }else{
            par[parB] = parA;;
        }
    }

 public static void kruskalmst(ArrayList<edge> edges, int V){
    init();
    Collections.sort(edges);
    int mstcost = 0;
    int count = 0;

    for(int i=0;count<V-1;i++){ // i < edges.length
        edge e = edges.get(i);

        //(src, dest , wt)

        int parA = find(e.src); //src = a
        int parB = find(e.dest); //dest = b
        if(parA != parB){
            union(e.src, e.dest);
            mstcost += e.wt;
            count++;
        }
    }
    System.out.println(mstcost);

    }

    public static void main(String args[]){
        int V=4;

    //int arr[] = new arr[V];
    ArrayList<edge> edges= new ArrayList<>(); //null -> empty arraylist
    creategaph(edges);
    kruskalmst(edges, V);
    }
}