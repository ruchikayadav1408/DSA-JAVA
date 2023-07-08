class Solution{

    // arr: input array
    // n: size of array
    //Function to find the sum of contiguous subarray with maximum sum.
    long maxSubarraySum(int arr[], int n){
        int cnt=0;
        // Your code here
        long currsum=0;
    long maxsum= Integer.MIN_VALUE;
      long min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            currsum= currsum+arr[i];
            if(currsum<0){
                currsum=0;
                 
            }
             if(arr[i]<0){
               cnt++;
               min=Math.min(Math.abs(arr[i]),min);
             }
           
          maxsum=Math.max(currsum , maxsum); 
    

                
        }
                if(cnt==arr.length){
           return -(min);
         }
        
            
        return maxsum;
    
    
}
}
