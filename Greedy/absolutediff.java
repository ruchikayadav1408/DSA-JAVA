import java.util.Arrays;

public class absolutediff {
    public static void main(String args[]){
        int A[]={4,1,8,7};
        int B[]={2,3,6,5};

         Arrays.sort(A);
         Arrays.sort(B);
         int mindiff=0;
         for(int i=0; i<A.length;i++){
            mindiff+=Math.abs(A[i]- B[i]);

         }
         System.out.println("Minimum absolute differnece = "+ mindiff);
    }
    
}
