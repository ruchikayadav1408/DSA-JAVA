//https://practice.geeksforgeeks.org/problems/max-min/1?utm_source=geeksforgeeks&utm_medium=article_practice_tab&utm_campaign=article_practice_tab
class Solution
{ 
    public static int findSum(int A[],int N) 
    {
        int largest= Integer.MIN_VALUE;
        int smallest=  Integer.MAX_VALUE;
        
        for(int i=0;i<N;i++){
            if(largest < A[i]){
                largest=A[i];
            }
            if(smallest > A[i]){
                smallest= A[i];
                
            }
        }
        int sum=0;
        sum= largest + smallest;
        return sum;
    }
}
