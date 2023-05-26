public class Knapsack {

    //0-1 knapsack problem

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
    
    //---------------RECURRSION---------------------------------
    
        public static int knapsackRecur(int val[], int wt[], int W, int n){
            if(W == 0 || n == 0){
                return 0;
            }
    
            if(wt[n-1] <= W){ //wt[n-1] is index of 0th item //valis
                //include
                int ans1 = val[n-1] + knapsackRecur(val, wt, W-wt[n-1], n-1 );
                //exclude
                int ans2 = knapsackRecur(val, wt, W, n-1);
                return Math.max(ans1, ans2);
               
    
            }
            else{ //not valid
                return knapsackRecur(val, wt, W, n-1);
                
            }
        }
    
    //----------------MEMOIZATION------------------------------
    
        public static int knapsackDP(int val[], int wt[], int W, int n, int dp[][]){
            if(W == 0 || n == 0){
                return 0;
            }
    
            //for dp
            if(dp[n][W] != -1){ //already calculated
                return dp[n][W];
            }
    
            if(wt[n-1] <= W){ //wt[n-1] is index of 0th item //valis
                //include
                int ans1 = val[n-1] + knapsackDP(val, wt, W-wt[n-1], n-1, dp);
                //exclude
                int ans2 = knapsackDP(val, wt, W, n-1, dp);
                dp[n][W] = Math.max(ans1, ans2);
                return dp[n][W];
    
            }
            else{ //not valid
                dp[n][W] = knapsackDP(val, wt, W, n-1, dp);
                return dp[n][W];
            }
        }
//----------------------TABULATION-------------------------

public static int knapsackTAB(int val[], int wt[], int W){
    int n = val.length;
    int dp[][] = new int[n+1][W+1];

    //Initialization
    for(int i=0;i<dp.length;i++){ //0th col
        dp[i][0] = 0;
    }

    for(int j=0;j<dp[0].length;j++){ //0th row
        dp[0][j] = 0;
    }

    //Tabulation
    for(int i=1;i<n+1;i++){
        for(int j=1;j<W+1;j++){
            int v = val[i-1]; //ith item value 
            int w = wt[i-1]; //ith item weight

            if(w <=j){ //valid
                //include
                int Incprofit = v + dp[i-1][j-w];
                int Excprofit = dp[i-1][j];
                dp[i][j] = Math.max(Incprofit, Excprofit);
            }else{
                int excprofit = dp[i-1][j];
                dp[i][j] = excprofit;
            }
        }
    }
    print(dp);
    return dp[n][W];

}

    public static void main(String args[]){
        int val[] = {15, 14, 10, 45, 30};
        int wt[] = {2, 5, 1, 3, 4};
        int W = 7;
        int dp[][] = new int[val.length+1][W+1];
        for(int i=0; i<dp.length; i++){
            for(int j=0; j<dp[0].length;j++){
                dp[i][j] = -1;
            }
            
        }
        System.out.println(knapsackRecur(val, wt, W, val.length));
        System.out.println(knapsackDP(val, wt,W , val.length, dp));
        System.out.println(knapsackTAB(val, wt, W));
    }
}    