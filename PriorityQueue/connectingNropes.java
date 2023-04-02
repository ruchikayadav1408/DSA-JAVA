import java.util.PriorityQueue;

public class connectingNropes {
    public static void main(String args[]) {
        int ropees[]={2,3,3,4,6};
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0;i<ropees.length;i++){
            pq.add(ropees[i]);

        }
        int cost=0;
        while(pq.size() >1){
            int min= pq.remove();
            int min2 = pq.remove();
            cost+=min+ min2;
            pq.add(min+min2);
        }
        System.out.println("cost of connecting n ropes: " + cost);
    }
    
}
