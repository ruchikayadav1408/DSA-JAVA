class Solution {
    public int countNegatives(int[][] grid) {
          int maxcount=0;
      int rowcount=0;
        // code here
        for(int i=0;i<grid.length;i++){
           // int rowcount=0;
            for(int j=0;j<grid[0].length;j++){
            if(grid[i][j]<0){
                rowcount++;
            }
           if(rowcount>maxcount){
               maxcount=rowcount;
               
           }
        }
    }
    
      
     return maxcount;
    }
}
