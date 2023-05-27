public class TargetsumSubset {

    //--------------Print DP MATRIX----------------------------
    public static void print(boolean dp[][]){
        for(int i=0;i<dp.length;i++){ 
            for(int j=0;j<dp[0].length;j++){ 
                System.out.print(dp[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    
        
    }
        public static boolean sumsubset(int arr[], int sum){
            int n = arr.length;
            boolean dp[][] = new boolean[n+1][sum+1];
            //i = items && j = Target sum
            for(int i=0; i<n+1; i++){
                dp[i][0] = true;
            }
    
            for(int i=1;i<n+1;i++){
                for(int j=1;j<sum+1;j++){
                    int v = arr[i-1]; //ith item value 
        
                    if(v <=j && dp[i-1][j-v] == true){ //valid
                        //include
                        dp[i][j] = true;
                    }else if(dp[i-1][j] == true){
                        
                        dp[i][j] = true;
                    }
                }
            }
            print(dp);
            return dp[n][sum];
        }
    
    
        public static void main(String args[]){
            int arr[] = {4, 2, 7, 1, 3};
            int sum = 10;
            System.out.println(sumsubset(arr, sum));
        }
    }