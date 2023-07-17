class Solution {
    int rowWithMax1s(int arr[][], int n, int m) {
        
        int maxcount=0;
        int index=-1;
        // code here
        for(int i=0;i<arr.length;i++){
            int rowcount=0;
            for(int j=0;j<arr[0].length;j++){
            if(arr[i][j]==1){
                rowcount++;
            }
           if(rowcount>maxcount){
               maxcount=rowcount;
               index=i;
           }
        }
    }
    
      
     return index;
}
}
