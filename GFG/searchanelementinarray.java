https://practice.geeksforgeeks.org/problems/search-an-element-in-an-array-1587115621/0

class Solution{
        
    static int search(int arr[], int N, int X)
    {
        for(int i=0;i<arr.length;i++){
            if(arr[i]== X){
                return i;
            }
        }
        // Your code here
        return -1;
    }
    
}
