//https://practice.geeksforgeeks.org/problems/boundary-traversal-of-matrix-1587115620/0

class Solution
{
    //Function to return list of integers that form the boundary 
    //traversal of the matrix in a clockwise manner.
    static ArrayList<Integer> boundaryTraversal(int matrix[][], int n, int m)
    {
        // code here 
        ArrayList<Integer> ls=new ArrayList<>();
        int startrow=0;
        int endrow=matrix.length-1;
        int startcol=0 ;
        int endcol=matrix[0].length-1;
        
       // while(startrow<= endrow && startcol<=endcol){
        //top
        for(int j=startrow ; j<=endcol;j++){
            ls.add(matrix[startrow][j]);
            }
        
        
          //right
        for(int i=startrow+1 ; i<=endrow;i++){
            ls.add(matrix[i][endcol]);
            }
        
          //bottom
        for(int j=endcol-1 ; j>=startcol;j--){
            if(startrow== endrow){
                break;
            }
            ls.add(matrix[endrow][j]);
            }
        
          //left
        for(int i=endrow-1 ; i>=startrow+1;i--){
            if(startcol==endcol){
                break;
            }
            ls.add(matrix[i][startcol]);
            }
            
            return ls;
        
    }
        
    
}
