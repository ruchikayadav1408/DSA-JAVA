import java.util.PriorityQueue;

import javax.swing.plaf.PopupMenuUI;

public class nearbycars {
    static class Points implements Comparable<Points>{
        int x;
        int y;
        int distsq;
        int idx;

        public Points(int x, int y, int distsq, int idx){
            this.x= x;
            this.y= y;
            this.distsq= distsq;
            this.idx= idx;
        }

        @Override
        public int compareTo(Points p2){
            return this.distsq - p2.distsq;
        }
    }
  public static void main(String args[]) {
        int pts[][]={{3,3} , {5, -1} ,  {-2,4}};
        int k=2;

        PriorityQueue<Points> pq= new PriorityQueue<>();
        for(int i=0; i<pts.length ;i++){
            int distsq = pts[i][0]*pts[i][0] + pts[i][1]*pts[i][1];
            pq.add(new Points(pts[i][0],pts[i][1],  distsq, i));
        }

        // nearkest k points
         for(int i=0;i<k;i++){
            System.out.println("C"+ pq.remove().idx);
         }
    }
}
