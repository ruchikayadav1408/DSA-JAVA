import java.util.*;
public class LongestIncreasingSubSequence {

//----------------------LCS----------------------------
    public static int lcsTab(int arr1[], int arr2[]){
        int n = arr1.length;
        int m = arr2.length;

        int dp[][] = new int[n+1][m+1];

        //initialization
            for(int i=0; i<n+1; i++){
                for(int j=0; j<m+1;j++){
                    if(i == 0 || j == 0){
                        dp[i][j] = 0;
                    }
                }
                
            }

            for(int i=1; i<n+1; i++){
                for(int j=1; j<m+1;j++){
                   if(arr1[i-1] == arr2[j-1]){ //same
                    dp[i][j] = dp[i-1][j-1] + 1;        
        }
        else{
            int ans1 = dp[i-1][j];
            int ans2 = dp[i][j-1];
            dp[i][j] =  Math.max(ans1, ans2);
        }
    }
}
    return dp[n][m];
}

//-------------------Increasing subsequence--------------------
    public static int LIS(int arr1[]){
        HashSet<Integer> set = new HashSet<>();
        for(int i=0; i<arr1.length; i++){
            set.add(arr1[i]);
        }

        int arr2[] = new int[set.size()]; //sorted unique elements
        int i = 0;
        for (int num : set){
            arr2[i] = num;
            i++;
        
        }

        Arrays.sort(arr2); //ascending
        return lcsTab(arr1, arr2);
    }

//---------------------MAIN FUNCTION--------------------------
    public static void main(String args[]){
        int arr[] = {50, 3, 10, 7, 40, 80};
        System.out.println(LIS(arr));
    }
}