class Solve{
    
    long maxArea(int A[], int len){
        // Code Here
        long maxwater=0;
        int lp=0;
        int rp=len-1;
        
        while(lp<rp){
            int height= Math.min(A[lp] , A[rp]);
            int width= rp-lp;
            int currwater=height*width;
            
            maxwater=Math.max(currwater, maxwater);
            
            if(A[lp]< A[rp]){
                lp++;
            }
            else{
                rp--;
            }
        }
        return maxwater;
    }
    
}
