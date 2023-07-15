class Solution
{
    //Function to return a list of integers denoting spiral traversal of matrix.
    static ArrayList<Integer> spirallyTraverse(int matrix[][], int r, int c)
    {
        // code here 
        int startrow=0 , startcol=0;
        int endrow=matrix.length-1 , endcol=matrix[0].length-1;
          ArrayList<Integer> ls = new ArrayList<>();
        
        while(startrow<=endrow && startcol<=endcol){
        // top
        for(int j=startcol ; j<=endcol; j++){
            ls.add(matrix[startrow][j]);
        }
        // right
        for(int i=startrow+1 ; i<=endrow; i++){
            ls.add(matrix[i][endcol]);
        }
        // bottom
        for(int j=endcol-1 ; j>=startcol; j--){
            if(startrow==endrow){
                 break;
            }
            ls.add(matrix[endrow][j]);
        }
        // left
        for(int i=endrow-1 ; i>=startrow+1; i--){
             if(endcol==startcol){
                  break;
             }
            ls.add(matrix[i][startcol]);
        
        }
        startrow++;
            startcol++;
            endrow--;
            endcol--;
        
    }
    
    return ls;
    }
}
