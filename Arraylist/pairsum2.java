import java.util.ArrayList;

public class pairsum2 {
    //optimized solution 2pointer approach

    public static boolean pairsum(ArrayList<Integer> list, int target){
        int bp=-1; //breaking point
        for(int i=0;i<list.size();i++){
            if(list.get(i)>list.get(i+1)){
                bp=i;
                break;
            }
        }
        int n=list.size();
        int lp=bp+1;
        int rp=bp;
        while(lp != rp){
            if(list.get(rp)+list.get(lp)== target){
                return true;
            }
             if(list.get(rp)+list.get(lp)<target){
                lp=(lp+1)%n;
             }
             else{
                rp=(rp+n -1)%n;
             }

        }
        return false;
    }
    public static void main(String args[]) {
        ArrayList<Integer> list= new ArrayList<>();
        //SORTED AND ROTATED ARRAY
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);
        int target=100;
        
        System.out.println(pairsum(list, target));

        
    }
}
