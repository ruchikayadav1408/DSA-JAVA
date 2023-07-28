//https://leetcode.com/problems/sudoku-solver/
//37. Sudoku Solver


class Solution {
    public void solveSudoku(char[][] sudoku) {
        sudokosolver(sudoku, 0, 0);
    }
        public static boolean sudokosolver(char sudoku[][], int row, int col){
        if(row==9 ){
        return true;
    }
    int nextrow= row,  nextcol=col+1;
    if(col+1==9){
        nextrow=row+1;
        nextcol=0;

    }
    if(sudoku[row][col]!='.'){
         return sudokosolver(sudoku, nextrow, nextcol);
    }

    for(char digit='1';digit<='9';digit++){
        if(issafe(sudoku, row, col, digit)){
            sudoku[row][col]= digit;
        if(sudokosolver(sudoku, nextrow, nextcol)){
            return true;

        }
        sudoku[row][col]='.';

        }

    }
    return false;
    }

    public static boolean issafe(char sudoku[][], int row, int col, int digit){
    // column
   for(int i=0;i<=8;i++){
    if(sudoku[i][col]== digit){
        return false;
    }
   }
   // row
   for(int j=0;j<=8;j++){
    if(sudoku[row][j]== digit){
        return false;

    }
   }
   // grid
   int sr=(row/3)*3;
   int sc=(col/3)*3;

    for(int i=sr; i<sr+3;i++){
        for(int j=sc;j<sc+3;j++){
    if(sudoku[i][j]==digit){
        return false;

    }
        }
    }
    return true;
    
}
}
