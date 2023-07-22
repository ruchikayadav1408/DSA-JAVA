//https://practice.geeksforgeeks.org/problems/quick-sort/0

class Solution
{
    //Function to sort an array using quick sort algorithm.
    static void quickSort(int arr[], int si, int ei)
    {
        // code here
           if(si >= ei) {
            return;
        }

        //pivot variable stores correct idx for pivot element
        int pIdx = partition(arr, si, ei);
        quickSort(arr, si, pIdx-1);
        quickSort(arr, pIdx+1, ei); 
    }
    static int partition(int arr[], int si, int ei)
    {
        // your code here
          int pivot = arr[ei];
        int i = si-1; // makes space for elements smaller than pivot

        for(int j=si; j<ei; j++) {
            if(arr[j] < pivot) {
                i++;
                //swap
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        //place pivot at correct position
        i++;
        int temp = arr[i];
        arr[i] = pivot;
        arr[ei] = temp; //pivot's position need to change so (pivot = temp) won't work

        return i;
    } 
}
