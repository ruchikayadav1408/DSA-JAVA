class Solution 
{ 
    //Function to search a given number in row-column sorted matrix.
	static boolean search(int matrix[][], int n, int m, int x) 
	{  
	    // code here 
	    int row=0 ;
        int col= matrix[0].length-1;
        while(row<matrix.length && col>=0){
            if(matrix[row][col]== x){
                return true;
            }
            else if(x< matrix[row][col]){
                col--;
            }
            else{
                row++;
            }
        }
       
         return false;
	} 
} 
