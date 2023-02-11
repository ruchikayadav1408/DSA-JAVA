import java.util.ArrayList;

public class containerwithmostwater {
    public static int storewater(ArrayList<Integer> height){
        //brute force
        int maxwater =0;
        for(int i=0;i<height.size();i++){
            for(int j=i+1; j<height.size();j++){
                int width= j-i;
               int  ht= Math.min(height.get(i), height.get(j));
                int water = ht*width;
               maxwater= Math.max(maxwater, water);
            }
        }
        return maxwater;
    }

    //optimized solution using 2pointer approach

    public static int MAXWATER(ArrayList<Integer> height) {
        int lp=0;
        int maxwater=0;
        int rp=height.size()-1;

        while(lp<rp){
            int ht= Math.min(height.get(lp), height.get(rp));
            int width=rp-lp;
            int water=width*ht;
            maxwater=Math.max(maxwater, water);

            if(lp<rp){
                lp++;
            }
            else{
                rp--;
            }
        }
        return maxwater;
    }
     public static void main(String[] args) {
        ArrayList<Integer> height= new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);
     
       System.out.println("CONTAINER WITH MOST WATER : " + storewater(height));
       System.out.println("max water : "+  MAXWATER(height));

     }
}
