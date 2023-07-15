class Sol
{
    public static int matSearch(int mat[][], int N, int M, int X)
    {
        // your code here
        
        int row=0, col= mat[0].length-1;
        
        while(row<mat.length && col>=0){
            if(mat[row][col] == X){
                return 1;
            }
            else if(X<mat[row][col])
            {
                col--;
            }
            else{
                row++;
            }
        }
        return 0;
    }
}
