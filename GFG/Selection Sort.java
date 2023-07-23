//https://practice.geeksforgeeks.org/problems/selection-sort/0


void selectionSort(int arr[], int n)
	{
	    //code here
	  
	      
          for(int turn=0; turn<arr.length; turn++) {
            int minPos = turn;
            for(int j=turn+1; j<arr.length; j++) {
                if(arr[minPos] > arr[j]) {
                    minPos = j;
                }
            } 

            //swap
            int temp = arr[turn];
            arr[turn] = arr[minPos];
            arr[minPos] = temp;
        }
	}
