class Solution
{
    int isPowerOfFour(long n)
    {
	// Your code here	
	if(n<=0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        else if(n % 4!=0){
            return 0;
        }
        
        return isPowerOfFour(n/4) ;
    }
}
