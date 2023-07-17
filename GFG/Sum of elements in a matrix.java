class Solution {
    int sumOfMatrix(int N, int M, int[][] Grid) {
        // code here
        int sum=0;
        for(int i=0;i<Grid.length;i++){
            for(int j=0;j<Grid[0].length;j++){
                sum+=Grid[i][j];
            }
        }
        return sum;
    }
}
