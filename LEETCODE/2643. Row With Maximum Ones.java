class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
         int maxcount=0;
        int index=0;
        // code here
        for(int i=0;i<mat.length;i++){
            int rowcount=0;
            for(int j=0;j<mat[0].length;j++){
            if(mat[i][j]==1){
                rowcount++;
            }
           if(rowcount>maxcount){
               maxcount=rowcount;
               index=i;
           }
        }
    }
    
      
     int arr[]={index , maxcount};
     return arr;
    }
}
