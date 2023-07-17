//https://practice.geeksforgeeks.org/problems/diagonal-sum0158/0

class Solution
{
    public int DiagonalSum(int[][] matrix)
    {
        // code here
        int sum=0;
        for(int i=0; i<matrix.length; i++){
          for(int j=0;j<matrix[0].length;j++){
              if(i==j){
                  sum+=matrix[i][j];
              }
              if(i+j==matrix.length-1){
                  sum+=matrix[i][j];
              }
          }
    }
    return sum;
}
}
