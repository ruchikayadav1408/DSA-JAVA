//https://www.geeksforgeeks.org/problems/floor-in-a-sorted-array-1587115620/0

//Given a sorted array arr[] of size N without duplicates, and given a value x. Floor of x is defined as the largest element K in arr[] such that K is smaller than or equal to x. Find the index of K(0-based indexing).

/* Example 1:

Input:
N = 7, x = 0 
arr[] = {1,2,8,10,11,12,19}
Output: -1
Explanation: No element less 
than 0 is found. So output 
is "-1".  */


class Solution{
    
    // Function to find floor of x
    // arr: input array
    // n is the size of array
    static int findFloor(long arr[], int n, long x)
    {
           return find(arr, 0, n - 1, x, -1);
    }
    
    
         static int find(long arr[], int start, int end, long x, int ans) {
       if (start <= end) {
            // find mid
            int mid = start + (end - start) / 2;
            if (arr[mid] == x) 
                return mid;
            else if (arr[mid] < x) {
                ans = mid;
                return find(arr, mid+1, end, x, ans);
            } else {
                return find(arr, start, mid - 1, x, ans);
            }
        }
        return ans;
    
    }
    
}
