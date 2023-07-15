//https://practice.geeksforgeeks.org/problems/second-largest3735/0



//User function Template for Java

class Solution {
    int print2largest(int arr[], int n) {
        // code here
        
         int max = -1;
        int seclarg=-1;
  
        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
            seclarg=max;
            max=arr[i];
            
            }
        }
         for(int i=0;i<arr.length;i++){
        if(arr[i]>=seclarg && arr[i]!= max){
            seclarg= arr[i];
        }
       
        
    }
    return seclarg;
    }   

}
