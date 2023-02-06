public class backtrackingarray {
    public static void backtrk(int arr[], int i, int val){
        //base case
        if(i==arr.length){
            printarray(arr);
            return;
        }

        //recursion
        arr[i]=val;
        backtrk(arr, i+1, val+1);
        arr[i]=arr[i]-2;
    }
    public static void printarray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String args[])
    {
        int arr[]= new int[5];
        backtrk(arr, 0, 1);
        printarray(arr);
    }
}
