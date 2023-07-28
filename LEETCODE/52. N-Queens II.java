//https://leetcode.com/problems/n-queens-ii/

class Solution {
     public int cnt=0;
    public int totalNQueens(int n) {
        char Board[][]=new char[n][n];
        for(int i=0;i<n;i++)
        {
            for (int j = 0; j < n; j++) 
            {
                Board[i][j] = '.';
            }
        }
        placeQueen(n,Board,0);
        return cnt;
    }
    public void placeQueen(int n, char Board[][],int row)
    {
        //Base Case
        if(row==n)
        {
            cnt++;
            return;
        }
         for(int col=0;col<n;col++)
         {
             if(canPlaceQueen(n,Board,row, col))
             {
                 Board[row][col]='Q';
                 placeQueen(n,Board,row+1);
                 Board[row][col]='.';
             }
         }
        
    }
    public Boolean canPlaceQueen(int n,char Board[][],int row, int col)
    {
       // check all rows for the current column
        for (int i = 0; i < row; i++) 
        {
            if (Board[i][col] == 'Q') {
                return false;
            }
        }

        //check for 45 degree positions
        for (int i = row - 1, j = col + 1; i >= 0 && j < n; i--, j++) {
            if (Board[i][j] == 'Q') {
                return false;
            }
        }
        //check for 135 positions
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (Board[i][j] == 'Q') {
                return false;
            }
        }
        return true;

    }
}
    
