//https://practice.geeksforgeeks.org/problems/binary-search-1587115620/0

class Solution {
    int binarysearch(int arr[], int n, int key) {
        // code here
        
        int start=0 , end=arr.length-1;
        
        while(start <= end){
            int mid=(start+end)/2;
            
             if(arr[mid]== key){
                 return mid;
                 
             }
             else if(arr[mid]>key){
                 end= mid-1;
             }
             else{
                 start=mid+1;
             }
        }
        return -1;
    }
}
