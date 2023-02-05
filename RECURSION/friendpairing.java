

public class friendpairing {
    public static int pairing(int n){
        if(n==1||n==2){
            return n;
        }
        //single pair
        int fnm1=pairing(n-1);
         //double pair
         int fnm2=pairing(n-2);
         int pair=(n-1)*fnm2;

         int totalways= fnm1 + pair;
         return totalways;
    }
    public static void main(String args[]) {
        System.out.println(pairing(3));;
        
    }
}
