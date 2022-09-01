//https://leetcode.com/problems/search-a-2d-matrix-ii/
//Input: matrix = [[1,4,7,11,15],[2,5,8,12,19],[3,6,9,16,22],[10,13,14,17,24],[18,21,23,26,30]], target = 20
//Output: false


class Solution {
    public boolean searchMatrix(int[][] matrix, int key) {
        int row=0;
        int col= matrix[0].length-1;
          while(row<matrix.length && col>=0){
              if(matrix[row][col]==key){
                  //System.out.print("found key at ", row, col);
                  return true;
                  
              }
              else if(key<matrix[row][col]){
                  col--;
              }
              else{
                  row++;
                  
              }
              //System.out.print("KEY NOT FOUND");
          }
        return false;
    }
}
