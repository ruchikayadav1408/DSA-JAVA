//https://practice.geeksforgeeks.org/problems/merge-sort/0



class Solution
{
    void merge(int arr[], int si, int mid, int ei)
    {
         // Your code here
          int temp[] = new int[ei-si+1];
        int i = si; //idx for 1st sorted part
        int j = mid+1; //idx for 2nd sorted part
        int k = 0; //idx for temp;

        while(i <= mid && j <= ei) {
            if(arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        //for leftover elements of 1st sorted part
        while(i <= mid) {
            temp[k++] = arr[i++];
        }

        //for leftover elements of 2nd sorted part
        while(j <= ei) {
            temp[k++] = arr[j++];
        }

        //copy temp to original array
        for(k=0, i=si; k<temp.length; k++, i++) {
            arr[i] = temp[k];
        }
    
    }
    void mergeSort(int arr[], int si, int ei)
    {
        //code here
        if(si >= ei) {
            return;
        }
        int mid = si + (ei - si)/2; // or = (si + ei) / 2; 
        mergeSort(arr, si, mid);
        mergeSort(arr, mid+1, ei);

        merge(arr, si, mid, ei);
    }
}
