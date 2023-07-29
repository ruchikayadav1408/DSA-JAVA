class Solution {
    public void setZeroes(int[][] matrix) {
    
        int n=matrix.length ;
        int  m=matrix[0].length;
        int nmatrix[][]= new int[n][m];

          for(int i=0;i<n;i++){
            for(int j=0;j<m;j++)
                nmatrix[i][j]=matrix[i][j];
        }

        for(int i=0;i<matrix.length;i++){
          for(int j=0;j<matrix[0].length;j++){
              if(matrix[i][j]== 0){
                 for(int k=0;k<m; k++){
                     nmatrix[i][k]=-0;
                 }
                 for(int x=0;x<n; x++){
                     nmatrix[x][j]=-0;
                 }
              }
        }
        }
          for(int i=0;i<n;i++){
          for(int j=0;j<m;j++){
             
                  matrix[i][j]=nmatrix[i][j];
              
          }
          }
}
}
