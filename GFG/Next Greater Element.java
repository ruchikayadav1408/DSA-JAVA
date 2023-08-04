class Solution
{
    //Function to find the next greater element for each element of the array.
    public static long[] nextLargerElement(long[] arr, int n)
    { 
        // Your code here
        
        Stack<Integer> s= new Stack<>();
        long[] nextgreater= new long[arr.length];
        
        for(int i=arr.length-1 ; i>=0;i--){
            //while
            while(!s.isEmpty() && arr[s.peek()]<=arr[i]){
                s.pop();
                
            }
            //if else
            if(s.isEmpty()){
                nextgreater[i]=-1;
            }
            else{
                nextgreater[i] =arr[s.peek()];
            }
            
            //push
            s.push(i);
        }
        return nextgreater;
    } 
}
