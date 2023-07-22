//https://practice.geeksforgeeks.org/problems/inversion-of-array-1587115620/0

//User function Template for Java

class Solution
{
    // arr[]: Input Array
    // N : Size of the Array arr[]
    //Function to count inversions in the array.
    static long inversionCount(long arr[], long N)
    {
      int n = arr.length;
        long invCount = 0;

        // Merge sort the array
        long[] temp = Arrays.copyOf(arr, n);
        invCount = mergeSort(arr, 0, n - 1, temp);

        return invCount;
    }

    private static long mergeSort(long[] arr, int low, int high, long[] temp) {
        long invCount = 0;

        if (low < high) {
            int mid = (low + high) / 2;

            // Recursively count inversions in the left and right halves
            invCount += mergeSort(arr, low, mid, temp);
            invCount += mergeSort(arr, mid + 1, high, temp);

            // Count inversions in the merged array
            invCount += merge(arr, low, mid, high, temp);
        }

        return invCount;
    }

    private static long merge(long[] arr, int low, int mid, int high, long[] temp) {
        long invCount = 0;

        int i = low, j = mid + 1, k = low;

        while (i <= mid && j <= high) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
                invCount += (mid - i + 1);
            }
        }

        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        while (j <= high) {
            temp[k++] = arr[j++];
        }

        // Copy the sorted elements back to the original array
        for (i = low; i <= high; i++) {
            arr[i] = temp[i];
        }

        return invCount;

    }
}
