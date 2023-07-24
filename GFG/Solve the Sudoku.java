

//User function Template for Java

class Solution
{
    //Function to find a solved Sudoku. 
    static boolean SolveSudoku(int grid[][])
    {
        // add your code here
        int row=0, col=0;
    return  sudokosolver(grid , 0, 0);
        
    }
    public static boolean sudokosolver(int grid[][], int row, int col){
    if(row==9 ){
        return true;
    }
    int nextrow= row,  nextcol=col+1;
    if(col+1==9){
        nextrow=row+1;
        nextcol=0;

    }
    if(grid[row][col]!=0){
         return sudokosolver(grid, nextrow, nextcol);


    }
    for(int digit=1;digit<=9;digit++){
        if(issafe(grid, row, col, digit)){
            grid[row][col]= digit;
        if(sudokosolver(grid, nextrow, nextcol)){
            return true;

        }
        grid[row][col]=0;

        }

    }
    return false;
}
    public static boolean issafe(int grid[][], int row, int col, int digit){
    // column
   for(int i=0;i<=8;i++){
    if(grid[i][col]== digit){
        return false;
    }
   }
   // row
   for(int j=0;j<=8;j++){
    if(grid[row][j]== digit){
        return false;

    }
   }
   // grid
   int sr=(row/3)*3;
   int sc=(col/3)*3;

    for(int i=sr; i<sr+3;i++){
        for(int j=sc;j<sc+3;j++){
    if(grid[i][j]==digit){
        return false;

    }
        }
    }
    return true;
    
}
    //Function to print grids of the Sudoku.
    public static void printsuduku(int grid[][]){
    for(int i=0;i<9;i++){
        for(int j=0;j<9;j++){
            System.out.print((grid[i][j]+ " "));
        }
      
    }
}

    static void printGrid (int grid[][])
    {
        // add your code here
        if(sudokosolver(grid, 0, 0)){
   
    printsuduku(grid);
}

    }
}
