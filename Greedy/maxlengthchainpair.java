import java.util.Arrays;
import java.util.Comparator;

public class maxlengthchainpair {
    public static void main(String args[]) {
        int pairs[][]={{5, 24}, {39, 60}, {5, 28}, {27, 40}, {50, 90}};

         Arrays.sort(pairs, Comparator.comparingDouble(o -> o[1]));
         int chainlength=1;
         int chainend=pairs[0][1];
         for(int i=0;i<pairs.length;i++){
            if(pairs[i][0]> chainend){
                chainlength++;
                chainend= pairs[i][1];
            }
         }
         System.out.println("Max length chain pairs is: " + chainlength);
    }
    
}
