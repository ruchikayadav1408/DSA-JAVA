class Solution 
{ 
    //Function to return max value that can be put in knapsack of capacity W.
    static int knapSack(int W, int wt[], int val[], int n) 
    { 
         // your code here
         int dp[][] = new int[val.length+1][W+1];
         for(int i=0; i<dp.length; i++){
            for(int j=0; j<dp[0].length;j++){
                dp[i][j] = -1;
            }
            
        }
      return  knapsackDP(val, wt,W , val.length, dp);
    } 
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
}
