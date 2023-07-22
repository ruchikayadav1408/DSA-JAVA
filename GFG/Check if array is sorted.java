//https://practice.geeksforgeeks.org/problems/check-if-an-array-is-sorted0701/0

// User function Template for Java

class Solution {
    boolean arraySortedOrNot(int[] arr, int n) {
        if(n==1 || n==0){
            return true;
        }
        // code here
        
        for(int i=1;i<arr.length;i++){
            if(arr[i]<arr[i-1]){
               return false;
            }
        }
        return true;
    }
}
