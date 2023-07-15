//https://practice.geeksforgeeks.org/problems/trapping-rain-water-1587115621/0

class Solution{
    
    // arr: input array
    // n: size of array
    // Function to find the trapped water between the blocks.
    static long trappingWater(int height[], int n) { 
        // Your code here
         //left max boundry
        int leftmax[]= new int[n];
        leftmax[0]= height[0];
        for(int i=1;i<n;i++){
            leftmax[i]= Math.max(height[i] , leftmax[i-1]);
        }
        
        //right max boundry
        int rightmax[]= new int[n];
        rightmax[n-1]= height[n-1];
        for(int i=n-2;i>=0;i--){
            rightmax[i]= Math.max(height[i] , rightmax[i+1]);
        }
        
        // find trapped water
        long trappedwater=0;
        for(int i=0;i<n;i++){
            //water level
            int waterlevel= Math.min(leftmax[i] , rightmax[i]);
            trappedwater+= waterlevel - height[i];
            
        }
        return trappedwater;
    } 
    
}
