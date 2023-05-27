public class Rodcutting {
    //--------------Print DP MATRIX----------------------------
public static void print(int dp[][]){
   for(int i=0;i<dp.length;i++){ 
       for(int j=0;j<dp[0].length;j++){ 
           System.out.print(dp[i][j] + " ");
       }
       System.out.println();
   }
   System.out.println();

   
}
   // weigth = length ----- //val = price; W = totRod
   public static int RodcuttingTAB(int length[], int price[], int totRod){
       int n = price.length; //can also be written as length.length
       int dp[][] = new int[n+1][totRod+1];
   
       //Initialization
       for(int i=0;i < n+1;i++){ //0th col

           for(int j=0;j < totRod+1;j++){ //0th row
               if(i == 0 || j == 0){
                   dp[i][j] = 0;
               }
              
           }
       }
   
       
   
       //Tabulation
       for(int i=1;i<n+1;i++){
           for(int j=1;j<totRod+1;j++){
               int v = price[i-1]; //ith item price 
               int w = length[i-1]; //ith item length
   
               if(w <=j){ //valid
                   //include
                   int Incprofit = v + dp[i][j-w]; //change dp[i-1] = dp[i]
                   int Excprofit = dp[i-1][j];
                   dp[i][j] = Math.max(Incprofit, Excprofit);
               }else{
                   int excprofit = dp[i-1][j];
                   dp[i][j] = excprofit;
               }
           }
       }
       print(dp);
       return dp[n][totRod];
   
   }

   public static void main(String args[]){
       int length[] = {1, 2, 3, 4, 5, 6, 7, 8};
       int price[] = {1, 5, 8, 9, 10, 17, 17, 20};
       int totRod = 8;
       
       System.out.println(RodcuttingTAB(length, price, totRod));
   }
}