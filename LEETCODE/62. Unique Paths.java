//https://leetcode.com/problems/unique-paths/

class Solution {
    public int uniquePaths(int m, int n) {
           int dp[][]=new int[m+1][n+1];
      return helper(dp,0,0,m,n);
    }
    static int helper(int dp[][],int i,int j,int m,int n){
         if(i>=m || j>=n){
            return 0;
         }
        if(i==m-1 && j==n-1){
            return 1;
        }
       
        if(dp[i][j]!=0){
            return dp[i][j];
        }
        int r=helper(dp,i+1,j,m,n);
        int c=helper(dp,i,j+1,m,n);
        return dp[i][j]=r+c;
    }
}
