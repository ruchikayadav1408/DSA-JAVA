//Search an element in sorted and rotated array
https://practice.geeksforgeeks.org/problems/search-in-a-rotated-array0959/0

//User function Template for Java

class Solution 
{ 
    static int Search(int arr[], int target)
	{
	    // code here
	       int si = 0;
        int ei = arr.length-1;
        
        while(si <= ei) {
            int mid = (si+ei)/2;
            if(arr[mid] == target) {
                return mid;
            }
            //falls on L1
            if(arr[si] <= arr[mid]) {
                if(arr[si] <= target && target <= arr[mid]) {
                    //go left
                    ei = mid-1;
                } else {
                    //go right
                    si = mid+1;
                }
            }
            
            //falls on L2
            else {
                if(arr[mid] <= target && target <= arr[ei]) {
                    //go right
                    si = mid+1;
                } else {
                    //go left
                    ei = mid-1;
                }
            }
        }
        
        return -1;
	}
} 
