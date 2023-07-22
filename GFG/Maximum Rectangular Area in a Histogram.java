//https://practice.geeksforgeeks.org/problems/maximum-rectangular-area-in-a-histogram-1587115620/0



class Solution
{
    //Function to find largest rectangular area possible in a given histogram.
    public static long getMaxArea(long arr[], long n) 
    {
        // your code here
        Stack<Integer> s= new Stack<>();
        long MaxArea= Integer.MIN_VALUE;
        long nsl[]= new long[arr.length];
        long nsr[]= new long[arr.length];

        //next smalller right
        for(int i=arr.length-1;i>=0;i--){
        while(!s.isEmpty() && arr[s.peek()]>= arr[i]){
                s.pop();

            }
            if(s.isEmpty()){
                nsr[i]=arr.length;
            }
            else{
                nsr[i]=s.peek();
            }
            s.push(i);
        }
        // next smaller left
         s = new Stack<>();
        for(int i=0;i<arr.length;i++){
            while(!s.isEmpty() && arr[s.peek()]>= arr[i]){
                    s.pop();
    
                }
                if(s.isEmpty()){
                    nsl[i]=-1;
                }
                else{
                    nsl[i]=s.peek();
                }
                s.push(i);
            }
            // current area : width = j-i-1 or nsr[i]- nsl[i]-1
            for(int i=0;i<arr.length;i++){
                long height=arr[i];
                long width=nsr[i]- nsl[i]-1;
                long currArea= height * width;
                MaxArea=Math.max(MaxArea, currArea);

            }
         return MaxArea;
    }
        
}

