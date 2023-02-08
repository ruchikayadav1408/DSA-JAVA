//time complexity -O(2^n+m)

public class gridways {
    public static int grid(int i, int j , int n, int m){
        //base case
        if(i==n-1 && j==m-1){//condition for last cell
            return 1;

        }
        else if(i==n || j==m){ //boundry condition
            return 0;
        }
    
        int w1=grid(i+1, j, n, m);
        int w2=grid(i, j+1, n, m);
        int totalways=w1+w2;
        return totalways;
    }
    public static void main(String args[]){
        int n=3, m=3;
        System.out.println(grid(0,0, n,m));
    }
    
}
