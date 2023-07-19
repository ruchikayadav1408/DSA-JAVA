class Solution{
    
    // Function to check if given number n is a power of two.
    public static boolean isPowerofTwo(long n){
        
        // Your code here
          if(n<=0){
            return false;
        }
        if(n==1){
            return true;
        }
        else if(n % 2!=0){
            return false;
        }
        
        return isPowerofTwo(n/2) ;
        
    }
    
}
