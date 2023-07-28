//https://leetcode.com/problems/n-queens/
51. N-Queens


class Solution {
    public List<List<String>> solveNQueens(int n) {
        char board[][]= new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]='.';

            }
        }
      List<List<String>> ans= new ArrayList<>();
         queens(board, 0 , ans);
         return ans;

    }
        public static void queens(char board[][], int row  , List<List<String>> ans ) {
          //base case
    if(row== board.length){
        ans.add(construct(board));
        return;
    }
    //recursion
    for(int j=0;j<board.length;j++){
        if(issafe(board, row, j)){
            board[row][j]='Q';
            queens(board, row+1 , ans);
            board[row][j]='.';
        }
    }
    }

      public static boolean issafe(char board[][], int row, int col){
        //vertical
        for(int i=row-1;i>=0;i--){
            if(board[i][col]=='Q'){
            return false;
        }
    }
        //diagonal left up
        for(int i=row-1, j=col-1;i>=0 && j>=0;i--, j--){
            if(board[i][j]=='Q'){
            return false;
        }
    }
        
        //diagonal right up
        for(int i=row-1, j=col+1; i>=0 && j<board.length; i--, j++){
            if(board[i][j]=='Q'){
            return false;
            }
        }
        return true;
    }
     static List<String> construct(char[][] board) {

        List<String> internal = new ArrayList<>();
        for (int i = 0; i < board.length; i++) {
            String row = new String(board[i]);
            internal.add(row);
        }
        return internal;
    }
}
